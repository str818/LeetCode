package com.str818.offer;

/**
 * 礼物的最大价值
 *
 * 标签：动态规划
 *
 * Code It Now：https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof/
 *
 * Note：https://str818.github.io/2019/07/09/sword-refers-to-offer-middle.html#47-%E7%A4%BC%E7%89%A9%E7%9A%84%E6%9C%80%E5%A4%A7%E4%BB%B7%E5%80%BC
 *
 * @author str818
 * @date 2020/4/17
 */
public class Solution_47 {

    public int maxValue(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int n = grid[0].length;
        int[] dp = new int[n];
        for (int[] value : grid) {
            dp[0] += value[0];
            for (int i = 1; i < n; i++)
                dp[i] = Math.max(dp[i], dp[i - 1]) + value[i];
        }
        return dp[n - 1];
    }

}


