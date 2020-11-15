package com.str818.offer;

/**
 * 丑数
 *
 * 标签：动态规划
 *
 * Code It Now：https://leetcode-cn.com/problems/chou-shu-lcof/
 *
 * Note：https://str818.github.io/2019/07/10/sword-refers-to-offer-down.html#49-%E4%B8%91%E6%95%B0
 *
 * @author str818
 * @date 2020/4/18
 */
public class Solution_49 {

    public int nthUglyNumber(int n) {
        int a = 0, b = 0, c = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 1; i < n; i++) {
            int n2 = dp[a] * 2, n3 = dp[b] * 3, n5 = dp[c] * 5;
            dp[i] = Math.min(Math.min(n2, n3), n5);
            if(dp[i] == n2) a++;
            if(dp[i] == n3) b++;
            if(dp[i] == n5) c++;
        }
        return dp[n - 1];
    }

}


