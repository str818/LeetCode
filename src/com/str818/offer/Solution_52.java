package com.str818.offer;

/**
 * 两个链表的第一个公共结点
 *
 * 标签：链表、双指针
 *
 * Code It Now：https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
 *
 * Note：https://str818.github.io/2019/07/10/sword-refers-to-offer-down.html#52-%E4%B8%A4%E4%B8%AA%E9%93%BE%E8%A1%A8%E7%9A%84%E7%AC%AC%E4%B8%80%E4%B8%AA%E5%85%AC%E5%85%B1%E7%BB%93%E7%82%B9
 *
 * @author str818
 * @date 2020/4/19
 */
public class Solution_52 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA, p2 = headB;
        while (p1 != p2) {
            p1 = p1 == null ? headB : p1.next;
            p2 = p2 == null ? headA : p2.next;
        }
        return p1;
    }

}


