package com.str818.offer;

/**
 * 和为 S 的两个数字
 *
 * 标签：双指针
 *
 * Code It Now：https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 *
 * Note：https://str818.github.io/2019/07/10/sword-refers-to-offer-down.html#571-%E5%92%8C%E4%B8%BA-s-%E7%9A%84%E4%B8%A4%E4%B8%AA%E6%95%B0%E5%AD%97
 *
 * @author str818
 * @date 2020/5/15
 */
public class Solution_57_1 {

    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while(i < j) {
            int s = nums[i] + nums[j];
            if(s < target) i++;
            else if(s > target) j--;
            else return new int[] { nums[i], nums[j] };
        }
        return new int[0];
    }

}


