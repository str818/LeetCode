package com.str818.sort;

/**
 * 归并排序
 *
 * 先拆分，后按顺序合并。
 *
 * https://str818.github.io/2019/03/25/algorithm-sorting.html#%E4%BA%94%E5%BD%92%E5%B9%B6%E6%8E%92%E5%BA%8F
 *
 * @author str818
 * @date 2020/4/4
 */
public class MergeSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        separate(arr, 0, arr.length - 1);
    }

    // 分治
    public static void separate(int[] arr, int l, int r) {
        if (l == r) return;
        int mid = l + (r - l) / 2;
        System.out.println(l + " " + mid + " " + r);
        separate(arr, l, mid);
        separate(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    // 合并
    public static void merge(int[] arr, int l, int mid, int r) {
        int[] helper = new int[r - l + 1];
        int index = 0;
        int p1 = l;
        int p2 = mid + 1;

        while (p1 <= mid && p2 <= r) {
            helper[index++] = arr[p1] > arr[p2] ? arr[p2++] : arr[p1++];
        }
        while (p1 <= mid) {
            helper[index++] = arr[p1++];
        }
        while (p2 <= r) {
            helper[index++] = arr[p2++];
        }
        for (int i = 0; i < helper.length; i++) {
            arr[l + i] = helper[i];
        }
    }

}
