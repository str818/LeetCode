package com.str818.sort;

/**
 * 基数排序
 *
 * 从最低位向最高位依次排序。
 *
 * https://str818.github.io/2019/03/25/algorithm-sorting.html#%E5%8D%81%E5%9F%BA%E6%95%B0%E6%8E%92%E5%BA%8F
 *
 * @author str818
 * @date 2020/4/5
 */
public class RadixSort {

    public static void sort(int[] arr) {
        if(arr == null || arr.length < 2) {
            return;
        }
        radixSort(arr, 0, arr.length - 1, maxBits(arr));
    }

    // 基数排序
    public static void radixSort(int[] arr, int begin, int end, int digit) {
        final int radix = 10;
        int i, j;
        int[] count = new int[radix];
        int[] bucket = new int[end - begin + 1];
        // 依次遍历每个位数
        for (int d = 1; d <= digit; d++) {
            for (i = 0; i < radix; i++) {
                count[i] = 0;
            }

            // 统计数量
            for (i = begin; i <= end; i++) {
                j = getDigit(arr[i], d);
                count[j]++;
            }

            // 计算位置
            for (i = 1; i < radix; i++) {
                count[i] = count[i] + count[i - 1];
            }

            // 记录到对应位置
            for (i = end; i >= begin; i--) {
                j = getDigit(arr[i], d);
                bucket[count[j] - 1] = arr[i];
                count[j]--;
            }
            for (i = begin, j = 0; i <= end; i++, j++) {
                arr[i] = bucket[j];
            }
        }
    }

    // 计算最大位数
    public static int maxBits(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            max = Math.max(max, value);
        }
        int res = 0;
        while (max != 0) {
            res++;
            max /= 10;
        }
        return res;
    }

    // 获取位数数值
    public static int getDigit(int x, int d) {
        return ((x / ((int) Math.pow(10, d - 1))) % 10);
    }
    
}
