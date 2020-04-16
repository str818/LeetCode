package com.str818.offer;

/**
 * 从 1 到 n 整数中 1 出现的次数
 *
 * 标签：数学
 *
 * Code It Now：https://leetcode-cn.com/problems/number-of-digit-one/
 *
 * Note：https://str818.github.io/2019/07/09/sword-refers-to-offer-middle.html#43-%E4%BB%8E-1-%E5%88%B0-n-%E6%95%B4%E6%95%B0%E4%B8%AD-1-%E5%87%BA%E7%8E%B0%E7%9A%84%E6%AC%A1%E6%95%B0
 *
 * @author str818
 * @date 2020/4/16
 */
public class Solution_43 {

    public int countDigitOne(int n) {
        int count = 0;
        //依次考虑个位、十位、百位...是 1
        for (long k = 1; k <= n; k *= 10) {
            // xyzdabc
            long abc = n % k;
            long xyzd = n / k;
            long d = xyzd % 10;
            long xyz = xyzd / 10;
            count += xyz * k;
            if (d > 1) {
                count += k;
            }
            if (d == 1) {
                count += abc + 1;
            }
        }
        return count;
    }

}


