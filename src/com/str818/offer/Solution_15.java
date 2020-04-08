package com.str818.offer;

/**
 * 二进制中1的个数
 *
 * 标签：位运算
 *
 * Code It Now：https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 *
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#15-%E4%BA%8C%E8%BF%9B%E5%88%B6%E4%B8%AD-1-%E7%9A%84%E4%B8%AA%E6%95%B0
 *
 * @author str818
 * @date 2020/4/7
 */
public class Solution_15 {

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

}
