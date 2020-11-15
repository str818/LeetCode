package com.str818.sort;

/**
 * 计数排序
 *
 * 开辟额外空间，统计每个元素的数量。
 *
 * https://str818.github.io/2019/03/25/algorithm-sorting.html#%E5%85%AB%E8%AE%A1%E6%95%B0%E6%8E%92%E5%BA%8F
 *
 * @author str818
 * @date 2020/4/5
 */
public class CountingSort {

    public static void sort(int[] arr) {

        if (arr == null || arr.length < 2) {
            return;
        }

        // 找出最大值与最小值
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int value : arr) {
            maxValue = Math.max(value, maxValue);
            minValue = Math.min(value, minValue);
        }

        // 初始化计数数组
        int[] counter = new int[maxValue - minValue + 1];
        for (int value : arr) {
            counter[value - minValue]++;
        }

        // 计算每个元素的位置
        for (int i = 0; i < counter.length - 1; i++) {
            counter[i + 1] += counter[i];
        }

        // 初始化一个新的数组存放排序后的元素
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0 ; i--) {
            ans[counter[arr[i] - minValue] - 1] = arr[i];
            counter[arr[i] - minValue]--;
        }

        // 将排序结果赋值到原始数组中
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
    }

}
