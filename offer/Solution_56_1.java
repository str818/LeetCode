package com.str818.offer;

/**
 * 数组中数字出现的次数
 *
 * 标签：位运算
 *
 * Code It Now：https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/
 *
 * Note：https://str818.github.io/2019/07/10/sword-refers-to-offer-down.html#561-%E6%95%B0%E7%BB%84%E4%B8%AD%E6%95%B0%E5%AD%97%E5%87%BA%E7%8E%B0%E7%9A%84%E6%AC%A1%E6%95%B0
 *
 * @author str818
 * @date 2020/5/15
 */
public class Solution_56_1 {

    public int[] singleNumbers(int[] nums) {
        int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        diff &= -diff;
        int[] res = new int[2];
        for (int num : nums) {
            if ((num & diff) == 0) {
                res[0] ^= num;
            } else {
                res[1] ^= num;
            }
        }
        return res;
    }

}


