package com.str818.pdd;

import java.util.*;

public class Main_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = in.nextInt();
        }

        int[] ans = solve(prices, m);
        if (ans[0] == Integer.MIN_VALUE || ans[1] == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(ans[0] + " " + ans[1]);
        }
    }

    public static int[] solve(int[] prices, int m) {

        Arrays.sort(prices);
        int min = prices[0] - 3;
        int max = prices[prices.length - 1] + 3;

        int minAns = Integer.MIN_VALUE, maxAns = Integer.MAX_VALUE;
        for (int i = min; i <= max; i++) {
            boolean flag = true;
            for (int price : prices) {
                if (Math.abs(i - price) > m) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                minAns = i;
                break;
            }
        }

        for (int i = max; i >= min; i--) {
            boolean flag = true;
            for (int price : prices) {
                if (Math.abs(i - price) > m) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                maxAns = i;
                break;
            }
        }
        return new int[]{minAns, maxAns};
    }

}
