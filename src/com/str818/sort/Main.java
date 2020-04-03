package com.str818.sort;

import java.util.Arrays;

/**
 * 排序测试类
 *
 * @author str818
 * @date 2020/4/3
 */
public class Main {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[][] arrays = {
                null,
                {},
                {1,2,3,4,4,5},
                {5,4,3,2,1,0},
                {1,1,1,1,1,1},
                {-4,99,-23,9999,234}
        };
        for (int[] arr: arrays) {
            SelectionSort.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
