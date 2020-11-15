package com.str818.pdd;

import java.util.*;

public class Main_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] ans = solve(s);
        if (ans.length == 0) {
            System.out.println(" ");
        }
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] solve(String s) {

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        int num = set.size();
        HashMap<String, Integer> ans = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (int l = 0; l < s.length(); l++) {
            HashSet<Character> tmpSet = new HashSet<>();
            tmpSet.add(s.charAt(l));
            for (int r = l + 1; r < s.length(); r++) {
                tmpSet.add(s.charAt(r));
                if (num == tmpSet.size()) {
                    ans.put(s.substring(l, r + 1), l);
                    list.add(s.substring(l, r + 1));
                }
            }
        }

        Collections.sort(list);

        String first = list.get(0);

        for (String ss : list) {
            if (ss.charAt(0) == first.charAt(0) && ans.get(ss) > ans.get(first)) {
                first = ss;
            }
        }

        if (list.size() == 0) return new int[]{};
        return new int[]{ans.get(first), first.length()};
    }

}
