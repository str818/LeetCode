package com.str818.offer;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 最小的 K 个数
 *
 * 标签：快排、堆
 *
 * Code It Now：https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
 *
 * Note：https://str818.github.io/2019/07/09/sword-refers-to-offer-middle.html#40-%E6%9C%80%E5%B0%8F%E7%9A%84-k-%E4%B8%AA%E6%95%B0
 *
 * @author str818
 * @date 2020/4/14
 */
public class Solution_40 {

    // 解法一：快排
    public int[] getLeastNumbers1(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        // 最后一个参数表示我们要找的是下标为k-1的数
        return quickSearch(arr, 0, arr.length - 1, k - 1);
    }

    private int[] quickSearch(int[] nums, int lo, int hi, int k) {
        // 每快排切分1次，找到排序后下标为j的元素，如果j恰好等于k就返回j以及j左边所有的数；
        int j = partition(nums, lo, hi);
        if (j == k) {
            return Arrays.copyOf(nums, j + 1);
        }
        // 否则根据下标j与k的大小关系来决定继续切分左段还是右段。
        return j > k? quickSearch(nums, lo, j - 1, k): quickSearch(nums, j + 1, hi, k);
    }

    // 快排切分，返回下标j，使得比nums[j]小的数都在j的左边，比nums[j]大的数都在j的右边。
    private int partition(int[] nums, int lo, int hi) {
        int v = nums[lo];
        int i = lo, j = hi + 1;
        while (true) {
            while (++i <= hi && nums[i] < v);
            while (--j >= lo && nums[j] > v);
            if (i >= j) {
                break;
            }
            int t = nums[j];
            nums[j] = nums[i];
            nums[i] = t;
        }
        nums[lo] = nums[j];
        nums[j] = v;
        return j;
    }

    // 解法二：堆排序
    public int[] getLeastNumbers2(int [] nums, int k) {
        if (k > nums.length || k < 0) return new int[0];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int num : nums) {
            maxHeap.add(num);
            if (maxHeap.size() > k)
                maxHeap.poll();
        }

        // 返回堆中的元素
        int[] res = new int[maxHeap.size()];
        int idx = 0;
        for(int num: maxHeap) {
            res[idx++] = num;
        }
        return res;
    }

}


