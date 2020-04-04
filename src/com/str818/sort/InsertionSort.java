package com.str818.sort;

/**
 * 插入排序
 *
 * 维护一个有序列，不停把新元素插入其中。
 *
 * https://str818.github.io/2019/03/25/algorithm-sorting.html#%E4%B8%89%E6%8F%92%E5%85%A5%E6%8E%92%E5%BA%8F
 *
 * @author str818
 * @date 2020/4/4
 */
public class InsertionSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0 && arr[j] < arr[j - 1]; j--) {
                Main.swap(arr, j, j - 1);
            }
        }
    }
}
