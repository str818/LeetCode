package com.str818.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static List<int[]> ans = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        judge(n);
        System.out.println(ans.size());
        for (int[] item : ans) {
            System.out.println(item[0] + " " + item[1]);
        }
    }
    public static void judge(int n){
        for (int i = 1; i <= n; i++) {
            StringBuilder raw = new StringBuilder(i * 4 + "");
            StringBuilder reverse = raw.reverse();
            while (reverse.charAt(0) == '0') {
                reverse.delete(0, 1);
            }
            if (reverse.toString().equals(i + "")) {
                ans.add(new int[]{i, i * 4});
            }
        }
    }
}
