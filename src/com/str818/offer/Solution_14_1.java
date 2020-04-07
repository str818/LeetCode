package com.str818.offer;

/**
 * 剪绳子
 *
 * 标签：动态规划、数学
 *
 * Code It Now：https://leetcode-cn.com/problems/jian-sheng-zi-lcof/
 *
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#14-%E5%89%AA%E7%BB%B3%E5%AD%90
 *
 * @author str818
 * @date 2020/4/7
 */
public class Solution_14_1 {

    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++)
            for (int j = 1; j < i; j++)
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), dp[j] * (i - j)));
        return dp[n];
    }

}
