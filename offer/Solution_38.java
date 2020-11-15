package com.str818.offer;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * 字符串的排列
 *
 * 标签：回溯
 *
 * Code It Now：https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/
 *
 * Note：https://str818.github.io/2019/07/09/sword-refers-to-offer-middle.html#38-%E5%AD%97%E7%AC%A6%E4%B8%B2%E7%9A%84%E6%8E%92%E5%88%97
 *
 * @author str818
 * @date 2020/4/14
 */
public class Solution_38 {

    List<String> res = new LinkedList<>();
    char[] c;
    public String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }
    void dfs(int x) {
        if(x == c.length - 1) {
            res.add(String.valueOf(c)); // 添加排列方案
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for(int i = x; i < c.length; i++) {
            if(set.contains(c[i])) continue; // 重复，因此剪枝
            set.add(c[i]);
            swap(i, x);         // 交换，固定此位为 c[i]
            dfs(x + 1);      // 开启固定第 x + 1 位字符
            swap(i, x);         // 恢复交换
        }
    }

    void swap(int a, int b) {
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }

}


