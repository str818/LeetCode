package com.str818.tengxun;

import java.util.*;

public class Main2 {

    private static int k;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        k = in.nextInt();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        list.sort(Comparator.comparingInt(c -> c));
        StringBuilder newS = new StringBuilder();
        for (Character val : list) {
            newS.append(val);
        }

        int l = 0, r = 0;
        while (l < newS.length()) {
            if (k == 0) {
                System.out.println(newS.substring(l, r));
                return;
            }
            if (r > newS.length()) {
                l++;
            } else {
                r++;
            }
            k--;
        }

    }
}