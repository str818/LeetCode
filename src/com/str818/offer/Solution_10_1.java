package com.str818.offer;

/**
 * 斐波那契数列
 *
 * 标签：递归
 *
 * Code It Now：https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 *
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#101-%E6%96%90%E6%B3%A2%E9%82%A3%E5%A5%91%E6%95%B0%E5%88%97
 *
 * @author str818
 * @date 2020/4/6
 */
public class Solution_10_1 {

    public int fib(int n) {
        if (n < 2) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return b;
    }

}
