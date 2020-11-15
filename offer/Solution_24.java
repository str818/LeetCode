package com.str818.offer;

/**
 * 反转链表
 *
 * 标签：链表
 *
 * Code It Now：https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 *
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#24-%E5%8F%8D%E8%BD%AC%E9%93%BE%E8%A1%A8
 *
 * @author str818
 * @date 2020/4/11
 */
public class Solution_24 {

    // 解法一：递归
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode next = head.next;
        head.next = null;
        ListNode newHead = reverseList(next);
        next.next = head;
        return newHead;
    }


    // 解法二：头插法
    public ListNode reverseList2(ListNode head) {
        ListNode newList = new ListNode(-1);
        while (head != null) {
            ListNode next = head.next;
            head.next = newList.next;
            newList.next = head;
            head = next;
        }
        return newList.next;
    }
}
