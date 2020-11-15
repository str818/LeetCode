package com.str818.sort;

/**
 * 堆排序
 *
 * 通过建立最大/小堆 + 下沉元素找到最值。
 *
 * https://str818.github.io/2019/03/25/algorithm-sorting.html#%E5%85%AD%E5%BF%AB%E9%80%9F%E6%8E%92%E5%BA%8F
 *
 * @author str818
 * @date 2020/4/4
 */
public class HeapSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 建立最大堆
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int size = arr.length;
        Main.swap(arr, 0, --size);
        // 循环将最大元素下沉
        while (size > 0) {
            heapify(arr, 0, size);
            Main.swap(arr, 0, --size);
        }
    }

    // 将 index 位置的元素插入最大堆，并调整最大堆
    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            Main.swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    // 下沉元素
    public static void heapify(int[] arr, int index, int size) {
        int left = index * 2 + 1;
        // 若有左子节点
        while (left < size) {
            // 左子节点与右子节点中大的下标
            int largest = left + 1 < size && arr[left + 1] > arr[left]? left + 1 : left;
            // 若左右子节点都小于自己，则不用继续下沉
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            // 否则，与大的子节点交换
            Main.swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }
}
