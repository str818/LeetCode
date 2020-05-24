package com.str818.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 和为 S 的连续正数序列
 *
 * 标签：双指针、滑动窗口
 *
 * Code It Now：https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/
 *
 * Note：https://str818.github.io/2019/07/10/sword-refers-to-offer-down.html#572-%E5%92%8C%E4%B8%BA-s-%E7%9A%84%E8%BF%9E%E7%BB%AD%E6%AD%A3%E6%95%B0%E5%BA%8F%E5%88%97
 *
 * @author str818
 * @date 2020/5/24
 */
public class Solution_57_2 {

    public int[][] findContinuousSequence(int target) {
        int l = 1, r = 1, sum = 0;
        List<int[]> res = new ArrayList<>();
        while (l <= target / 2) {
            if (sum < target) {
                sum += r;
                r++;
            } else if (sum > target) {
                sum -= l;
                l++;
            } else {
                int[] nums = new int[r - l];
                for (int i = l; i < r; i++) {
                    nums[i - l] = i;
                }
                res.add(nums);
                sum -= l;
                l++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }

}


