package com.str818.sort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 桶排序
 *
 * 划分多个范围相同的区间，每个自区间自排序，最后合并。
 *
 * https://str818.github.io/2019/03/25/algorithm-sorting.html#%E4%B9%9D%E6%A1%B6%E6%8E%92%E5%BA%8F
 *
 * @author str818
 * @date 2020/4/5
 */
public class BucketSort {

    public static void sort(int[] arr) {

        if (arr == null || arr.length < 2) {
            return;
        }

        // 计算最大值与最小值
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int value : arr) {
            max = Math.max(max, value);
            min = Math.min(min, value);
        }

        // 计算桶的数量
        int bucketNum = (max - min) / arr.length + 1;
        ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketNum);
        for(int i = 0; i < bucketNum; i++){
            bucketArr.add(new ArrayList<>());
        }

        // 将每个元素放入桶
        for (int value : arr) {
            int num = (value - min) / (arr.length);
            bucketArr.get(num).add(value);
        }

        // 对每个桶进行排序
        for (ArrayList<Integer> integers : bucketArr) {
            Collections.sort(integers);
        }

        // 将桶中的元素赋值到原序列
        int index = 0;
        for (ArrayList<Integer> integers : bucketArr) {
            for (Integer integer : integers) {
                arr[index++] = integer;
            }
        }
    }
}
