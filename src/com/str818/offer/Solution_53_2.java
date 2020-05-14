package com.str818.offer;

/**
 * 0～n-1中缺失的数字
 *
 * 标签：数组、二分查找
 *
 * Code It Now：https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/
 *
 * Note：https://str818.github.io/2019/07/10/sword-refers-to-offer-down.html#532-0n-1%E4%B8%AD%E7%BC%BA%E5%A4%B1%E7%9A%84%E6%95%B0%E5%AD%97
 *
 * @author str818
 * @date 2020/5/14
 */
public class Solution_53_2 {

    public int missingNumber(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

}


