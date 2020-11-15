package com.str818.meituan;

import java.util.*;

public class Main3 {
    public static Map<Integer, HashSet<Integer>> map = new HashMap<>();
    public static List<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            HashSet<Integer> tmpSet = new HashSet<>();
            tmpSet.add(x);
            tmpSet.add(y);
            map.put(i, tmpSet);
        }
        judge();
        System.out.println(ans.size());
        for (ArrayList<Integer> list : ans) {
            Collections.sort(list);
            StringBuilder s = new StringBuilder();
            for (int i : list) {
                s.append(i).append(" ");
            }
            System.out.println(s.toString());
        }

    }
    public static void judge(){
        for (int i : map.keySet()) {
            if (map.get(i) != null) {
                HashSet<Integer> start = map.get(i);
                for (int j : map.keySet()) {
                    if (i == j) continue;
                    HashSet<Integer> end = map.get(j);
                    for (int k : end) {
                        if (start.contains(k)) {
                            start.addAll(end);
                            map.put(j, new HashSet<>());
                            break;
                        }
                    }
                }
            }
        }
        for (int key : map.keySet()) {
            if (!map.get(key).isEmpty()) {
                ans.add(new ArrayList<>(map.get(key)));
            }
        }
    }
}
