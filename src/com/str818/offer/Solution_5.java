package com.str818.offer;

/**
 * 替换空格
 *
 * 标签：字符串
 *
 * Code It Now：https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 *
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#5-%E6%9B%BF%E6%8D%A2%E7%A9%BA%E6%A0%BC
 *
 * @author str818
 * @date 2020/4/6
 */
public class Solution_5 {

    public String replaceSpace(String s) {

        StringBuilder sb = new StringBuilder(s);
        int p1 = sb.length() - 1;
        for (int i = 0; i <= p1; i++) {
            if (sb.charAt(i) == ' ') {
                sb.append("  ");
            }
        }

        int p2 = sb.length() - 1;
        while (p1 >= 0 && p2 > p1) {
            char c = sb.charAt(p1--);
            if (c == ' ') {
                sb.setCharAt(p2--, '0');
                sb.setCharAt(p2--, '2');
                sb.setCharAt(p2--, '%');
            } else {
                sb.setCharAt(p2--, c);
            }
        }

        return sb.toString();
    }
}
