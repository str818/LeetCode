package com.str818.offer;

import java.util.PriorityQueue;

/**
 * 数据流中的中位数
 *
 * 标签：堆、设计
 *
 * Code It Now：https://leetcode-cn.com/problems/shu-ju-liu-zhong-de-zhong-wei-shu-lcof/
 *
 * Note：https://str818.github.io/2019/07/09/sword-refers-to-offer-middle.html#411-%E6%95%B0%E6%8D%AE%E6%B5%81%E4%B8%AD%E7%9A%84%E4%B8%AD%E4%BD%8D%E6%95%B0
 *
 * @author str818
 * @date 2020/4/16
 */
public class Solution_41 {

    PriorityQueue<Integer> left = new PriorityQueue<>((o1, o2) -> o2 - o1);
    PriorityQueue<Integer> right = new PriorityQueue<>();
    int N = 0;

    public void addNum(int num) {
        if (N % 2 == 0) {
            left.add(num);
            right.add(left.poll());
        } else {
            right.add(num);
            left.add(right.poll());
        }
        N++;
    }

    public double findMedian() {
        if (N % 2 == 0)
            return (left.peek() + right.peek()) / 2.0;
        else
            return (double) right.peek();
    }

}


