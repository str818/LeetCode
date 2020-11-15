package com.str818.tengxun;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
            sum += nums[i];
        }

        int cnt = 0;
        while (sum != 0) {
            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    ans = 0;
                    continue;
                }
                if (ans == 0) {
                    cnt += 1;
                }
                ans += 1;
                nums[i] -= 1;
                sum -= 1;
            }
        }
        System.out.println(cnt);
    }
}