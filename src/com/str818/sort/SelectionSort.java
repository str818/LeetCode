package com.str818.sort;

import java.util.Arrays;

/**
 * 选择排序
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
