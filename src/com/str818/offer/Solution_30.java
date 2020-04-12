package com.str818.offer;

import java.util.Stack;

/**
 * 包含min函数的栈
 *
 * 标签：栈
 *
 * Code It Now：https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/
 *
 * Note：https://str818.github.io/2019/07/09/sword-refers-to-offer-middle.html#30-%E5%8C%85%E5%90%AB-min-%E5%87%BD%E6%95%B0%E7%9A%84%E6%A0%88
 *
 * @author str818
 * @date 2020/4/12
 */
public class Solution_30 {

    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        mainStack.push(x);
        minStack.push(minStack.isEmpty() ? x : Math.min(minStack.peek(), x));
    }

    public void pop() {
        mainStack.pop();
        minStack.pop();
    }

    public int top() {
        return mainStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
