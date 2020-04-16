package com.str818.offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 字符流中第一个不重复的字符
 *
 * 标签：队列、设计
 *
 * Code It Now：https://www.nowcoder.com/practice/00de97733b8e4f97a3fb5c680ee10720?tpId=13&tqId=11207&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 *
 * Note：https://str818.github.io/2019/07/09/sword-refers-to-offer-middle.html#412-%E5%AD%97%E7%AC%A6%E6%B5%81%E4%B8%AD%E7%AC%AC%E4%B8%80%E4%B8%AA%E4%B8%8D%E9%87%8D%E5%A4%8D%E7%9A%84%E5%AD%97%E7%AC%A6
 *
 * @author str818
 * @date 2020/4/16
 */
public class Solution_41_2 {

    int[] cnts = new int[256];
    Queue<Character> queue = new LinkedList<>();
    public void insert(char ch) {
        cnts[ch]++;
        queue.offer(ch);
        while (!queue.isEmpty() && cnts[queue.peek()] > 1) {
            queue.poll();
        }
    }
    public char firstAppearingOnce() {
        return queue.isEmpty() ? '#' : queue.peek();
    }

}


