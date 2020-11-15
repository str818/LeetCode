package com.str818.offer;

/**
 * 第一个只出现一次的字符位置
 *
 * 标签：哈希
 *
 * Code It Now：https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 *
 * Note：https://str818.github.io/2019/07/10/sword-refers-to-offer-down.html#50-%E7%AC%AC%E4%B8%80%E4%B8%AA%E5%8F%AA%E5%87%BA%E7%8E%B0%E4%B8%80%E6%AC%A1%E7%9A%84%E5%AD%97%E7%AC%A6%E4%BD%8D%E7%BD%AE
 *
 * @author str818
 * @date 2020/4/18
 */
public class Solution_50 {

    public char firstUniqChar(String s) {
        int[] cnts = new int[256];
        for (int i = 0; i < s.length(); i++) {
            cnts[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (cnts[s.charAt(i)] == 1)
                return s.charAt(i);
        }
        return ' ';
    }

}


