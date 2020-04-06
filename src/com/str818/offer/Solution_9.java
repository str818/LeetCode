package com.str818.offer;

import java.util.Stack;

/**
 * 用两个栈实现队列
 *
 * 标签：栈
 *
 * Code It Now：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 *
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#9-%E7%94%A8%E4%B8%A4%E4%B8%AA%E6%A0%88%E5%AE%9E%E7%8E%B0%E9%98%9F%E5%88%97
 *
 * @author str818
 * @date 2020/4/6
 */
public class Solution_9 {

    Stack<Integer> in;
    Stack<Integer> out;

    public Solution_9() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void appendTail(int value) {
        in.push(value);
    }

    public int deleteHead() {
        if (out.isEmpty()) {
            if (in.isEmpty()) return -1;
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.pop();
    }

}
