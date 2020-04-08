package com.str818.offer;

/**
 * 数值的整数次方
 *
 * 标签：快速幂
 *
 * Code It Now：https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/
 *
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#16-%E6%95%B0%E5%80%BC%E7%9A%84%E6%95%B4%E6%95%B0%E6%AC%A1%E6%96%B9
 *
 * @author str818
 * @date 2020/4/7
 */
public class Solution_16 {

    public double myPow(double x, int n) {
        if (x == 0) return 0;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double res = 1;
        while (n != 0) {
            if ((n & 1) == 1) {
                res *= x;
            }
            x *= x;
            n /= 2;
        }
        return res;
    }

}
