package com.str818.sort;

/**
 * 冒泡排序
 *
 * 将最 小/大 的数交换到待排序序列的最前面。
 *
 * https://str818.github.io/2019/03/25/algorithm-sorting.html#%E4%BA%8C%E5%86%92%E6%B3%A1%E6%8E%92%E5%BA%8F
 *
 * @author str818
 * @date 2020/4/4
 */
public class BubbleSort {

    public static void sort(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    Main.swap(arr, j, j + 1);
                }
            }
        }
    }
}
