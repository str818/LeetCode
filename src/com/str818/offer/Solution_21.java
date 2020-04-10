package com.str818.offer;

/**
 * 调整数组顺序使奇数位于偶数前面
 *
 * 标签：数组、双指针
 *
 * Code It Now：https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 *
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#21-%E8%B0%83%E6%95%B4%E6%95%B0%E7%BB%84%E9%A1%BA%E5%BA%8F%E4%BD%BF%E5%A5%87%E6%95%B0%E4%BD%8D%E4%BA%8E%E5%81%B6%E6%95%B0%E5%89%8D%E9%9D%A2
 *
 * @author str818
 * @date 2020/4/7
 */
public class Solution_21 {

    public int[] exchange(int[] nums) {
        int oddCount = 0;
        for (int x : nums) {
            if (x % 2 == 1) oddCount++;
        }
        int[] copy = nums.clone();
        int i = 0, j = oddCount;
        for (int x : copy) {
            if (x % 2 == 1) nums[i++] = x;
            else nums[j++] = x;
        }
        return nums;
    }
}
