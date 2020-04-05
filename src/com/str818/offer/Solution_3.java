package com.str818.offer;

/**
 * 数组中重复的数字
 *
 * 标签：数组、哈希表
 *
 * Code It Now: https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 *
 * Note: https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#3-%E6%95%B0%E7%BB%84%E4%B8%AD%E9%87%8D%E5%A4%8D%E7%9A%84%E6%95%B0%E5%AD%97
 *
 * @author str818
 * @date 2020/4/5
 */
public class Solution_3 {

    public static int findRepeatNumber(int[] nums) {

        if (nums == null || nums.length == 0) {
            return -1;
        }

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i && nums[nums[i]] != nums[i]) {
                swap(nums, i, nums[i]);
            }
            if (nums[i] != i) {
                return nums[i];
            }
        }

        return -1;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
