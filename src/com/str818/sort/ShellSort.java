package com.str818.sort;

/**
 * 希尔排序
 *
 * 通过粗粒度的插入排序改善数列的有序程序，逐步细化，直到间隔为 1。
 *
 * https://str818.github.io/2019/03/25/algorithm-sorting.html#%E5%9B%9B%E5%B8%8C%E5%B0%94%E6%8E%92%E5%BA%8F
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
