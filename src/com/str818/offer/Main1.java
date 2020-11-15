package com.str818.offer;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] step = new int[n];
        for(int i = 0; i < n; i++){
            step[i] = sc.nextInt();
        }
        int[] ans = cal(step, k);
        if (ans.length == 0) {
            System.out.println("paradox");
        } else {
            System.out.println(ans[0] + " " + ans[1]);
        }
    }

    public static int[] cal(int[] step, int k) {
        int backCount = 0;
        for (int i : step) {
            if (k == i) return new int[0];
            if (k > i) {
                k -= i;
            } else {
                backCount++;
                k = Math.abs(k - i);
            }
        }
        return new int[]{k, backCount};
    }
}