package com.str818.offer;

/**
 * 数组中的逆序对
 *
 * 标签：归并排序
 *
 * Code It Now：https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof/
 *
 * Note：https://str818.github.io/2019/07/10/sword-refers-to-offer-down.html#51-%E6%95%B0%E7%BB%84%E4%B8%AD%E7%9A%84%E9%80%86%E5%BA%8F%E5%AF%B9
 *
 * @author str818
 * @date 2020/4/19
 */
public class Solution_51 {

    int cnt = 0;
    int[] tmp;
    public int reversePairs(int[] nums) {
        tmp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1);
        return cnt;
    }

    public void mergeSort(int[] nums, int l, int h) {
        if (h <= l) return;
        int mid = l + (h - l) / 2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, h);
        merge(nums, l, mid, h);
    }

    public void merge(int[] nums, int l, int m, int h) {
        int i = l, j = m + 1, k = l;
        while (i <= m || j <= h) {
            if (i > m) {
                tmp[k++] = nums[j++];
            } else if (j > h) {
                tmp[k++] = nums[i++];
            } else if (nums[i] <= nums[j]) {
                tmp[k++] = nums[i++];
            } else {
                tmp[k++] = nums[j++];
                cnt += m - i + 1;
            }
        }
        for (k = l; k <= h; k++) {
            nums[k] = tmp[k];
        }
    }

}


