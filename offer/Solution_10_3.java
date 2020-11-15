package com.str818.offer;

/**
 * 跳台阶
 *
 * 标签：递归
 * 
 * Code It Now：https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 * 
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#103-%E8%B7%B3%E5%8F%B0%E9%98%B6
 *
 * @author str818
 * @date 2020/4/6
 */
public class Solution_10_3 {

    public int numWays(int n) {
        if (n == 0) return 1;
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
