package com.str818.offer;

import java.util.Arrays;

/**
 * 变态跳台阶
 *
 * 标签：递归、动态规划
 *
 * Code It Now：https://www.nowcoder.com/questionTerminal/22243d016f6b47f2a6928b4313c85387
 *
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#104-%E5%8F%98%E6%80%81%E8%B7%B3%E5%8F%B0%E9%98%B6
 *
 * @author str818
 * @date 2020/4/7
 */
public class Solution_10_4 {

    // 解法一
    public int jumpFloor_1(int target) {
        if (target <= 0) return 0;
        return (int) Math.pow(2, target -1);
    }

    // 解法二：动态规划
    public int JumpFloor(int target) {
        int[] dp = new int[target];
        Arrays.fill(dp, 1);
        for (int i = 1; i < target; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j];
            }
        }
        return dp[target - 1];
    }

}
