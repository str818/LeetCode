package com.str818.sort;

/**
 * 希尔排序
 *
 * @author str818
 * @date 2020/4/4
 */
public class ShellSort {

    public static void sort(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int D = arr.length / 2; D >= 1; D /= 2) {
            for (int i = D; i < arr.length; i++) {
                int j = i;
                int temp = arr[j]; // 要插入的值
                while (j - D >= 0 && temp < arr[j - D]) {
                    arr[j] = arr[j - D];
                    j -= D;
                }
                arr[j] = temp;
            }
        }
    }
}
