package com.str818.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头打印链表
 *
 * 标签：链表
 *
 * Code It Now：https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 *
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#6-%E4%BB%8E%E5%B0%BE%E5%88%B0%E5%A4%B4%E6%89%93%E5%8D%B0%E9%93%BE%E8%A1%A8
 *
 * @author str818
 * @date 2020/4/6
 */
public class Solution_6 {

    // 解法一：递归
    ArrayList<Integer> res = new ArrayList<>();
    public int[] reversePrint_1(ListNode head) {
        helper(head);
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
    public void helper(ListNode cur) {
        if (cur == null) return;
        helper(cur.next);
        res.add(cur.val);
    }

    // 解法二：栈
    Stack<Integer> stack = new Stack<>();
    public int[] reversePrint_2(ListNode head) {
        ListNode cur = head;
        while(cur != null) {
            stack.push(cur.val);
            cur = cur.next;
        }
        int[] res = new int[stack.size()];
        int index = 0;
        while(!stack.isEmpty()) {
            res[index++] = stack.pop();
        }
        return res;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
