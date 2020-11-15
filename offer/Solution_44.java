package com.str818.offer;

/**
 * 数字序列中某一位的数字
 *
 * 标签：数学
 *
 * Code It Now：https://leetcode-cn.com/problems/shu-zi-xu-lie-zhong-mou-yi-wei-de-shu-zi-lcof/
 *
 * Note：https://str818.github.io/2019/07/09/sword-refers-to-offer-middle.html#44-%E6%95%B0%E5%AD%97%E5%BA%8F%E5%88%97%E4%B8%AD%E6%9F%90%E4%B8%80%E4%BD%8D%E7%9A%84%E6%95%B0%E5%AD%97
 *
 * @author str818
 * @date 2020/4/16
 */
public class Solution_44 {

    public int findNthDigit(int n) {
        // 先判断 target 是几位数，用 digits 表示
        int digits = 1;
        while (n > digits * Math.pow(10, digits - 1) * 9) {
            n -= digits * Math.pow(10, digits - 1) * 9;
            digits++;
        }
        // 所在位置的数字
        int target = (int)(Math.pow(10, digits - 1) + (n - 1) / digits);
        // 数字中的第几位
        return String.valueOf(target).charAt((n - 1) % digits) - '0';
    }

}


