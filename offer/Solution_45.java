package com.str818.offer;

import java.util.Arrays;

/**
 * 把数组排成最小
 *
 * 标签：排序
 *
 * Code It Now：https://leetcode-cn.com/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/
 *
 * Note：https://str818.github.io/2019/07/09/sword-refers-to-offer-middle.html#45-%E6%8A%8A%E6%95%B0%E7%BB%84%E6%8E%92%E6%88%90%E6%9C%80%E5%B0%8F
 *
 * @author str818
 * @date 2020/4/16
 */
public class Solution_45 {

    public String minNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (a, b) -> (a + b).compareTo(b + a));
        String res = "";
        for(int i = 0; i < arr.length; i++){
            res += arr[i];
        }
        return res;
    }

}


