package com.str818.offer;

/**
 * 剪绳子 II
 *
 * 标签：动态规划、数学
 *
 * Code It Now：https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/
 *
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#142-%E5%89%AA%E7%BB%B3%E5%AD%90-ii
 *
 * @author str818
 * @date 2020/4/7
 */
public class Solution_14_2 {

    public int cuttingRope(int n) {
        if(n == 2) return 1;
        if(n == 3) return 2;
        int mod = (int)1e9 + 7;
        long res = 1;
        while(n > 4) {
            res *= 3;
            res %= mod;
            n -= 3;
        }
        return (int)(res * n % mod);
    }

}
