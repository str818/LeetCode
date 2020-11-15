package com.str818.offer;


/**
 * 翻转单词顺序
 *
 * 标签：双指针、字符串
 *
 * Code It Now：https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/
 *
 * Note：https://str818.github.io/2019/07/10/sword-refers-to-offer-down.html#581-%E7%BF%BB%E8%BD%AC%E5%8D%95%E8%AF%8D%E9%A1%BA%E5%BA%8F
 *
 * @author str818
 * @date 2020/5/24
 */
public class Solution_58_1 {

    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder res = new StringBuilder();
        int r = s.length() - 1, l = r;
        while (l >= 0) {
            while (l >= 0 && s.charAt(l) != ' ') l--;
            res.append(s.substring(l + 1, r + 1) + " ");
            while (l >= 0 && s.charAt(l) == ' ') l--;
            r = l;
        }
        return res.toString().trim();
    }

}

