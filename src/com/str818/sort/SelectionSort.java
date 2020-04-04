package com.str818.sort;

/**
 * 选择排序
 *
 * 将最 小/大 的数交换到待排序序列的最前面。
 *
 * https://str818.github.io/2019/03/25/algorithm-sorting.html#%E4%B8%80%E9%80%89%E6%8B%A9%E6%8E%92%E5%BA%8F
 *
 * @author str818
 * @date 2020/4/3
 */
public class SelectionSort {

    public static void sort(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            // 寻找当前最小元素的下标
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            Main.swap(arr, i, minIndex);
        }
    }

}
