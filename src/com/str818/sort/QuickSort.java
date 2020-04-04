package com.str818.sort;

/**
 * 快速排序
 *
 * 选择一个基准数，使得基准数左边小右面大，左右再次迭代。
 *
 * https://str818.github.io/2019/03/25/algorithm-sorting.html#%E5%85%AD%E5%BF%AB%E9%80%9F%E6%8E%92%E5%BA%8F
 *
 * @author str818
 * @date 2020/4/4
 */
public class QuickSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            // 随机选取一个基准数
            Main.swap(arr, l + (int)(Math.random() * (r - l + 1)), r);
            // 小于区域[0,p[0]) 大于区域(p[1],r]
            int[] partition = partition(arr, l, r);
            quickSort(arr, l, partition[0] - 1);
            quickSort(arr, partition[1] + 1, r);
        }
    }

    // 以基准数为界，大的在右边，小的在左边   基准数放置在数组的最后一位
    public static int[] partition(int[] arr, int l, int r) {
        int less = l - 1;
        int more = r;
        while (l < more) {
            if (arr[l] < arr[r]) {
                Main.swap(arr, ++less, l++);
            } else if (arr[l] > arr[r]) {
                Main.swap(arr, --more, l);
            } else {
                l++;
            }
        }
        Main.swap(arr, more, r);
        // 返回值分别为小于序列与大于序列的分界线
        return new int[]{less + 1, more};
    }

}
