package com.str818.offer;

/**
 * 链表中倒数第k个节点
 *
 * 标签：链表、双指针
 *
 * Code It Now：https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 *
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#22-%E9%93%BE%E8%A1%A8%E4%B8%AD%E5%80%92%E6%95%B0%E7%AC%AC-k-%E4%B8%AA%E8%8A%82%E7%82%B9
 *
 * @author str818
 * @date 2020/4/11
 */
public class Solution_22 {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p1 = head, p2 = head;
        while (k-- > 0) {
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
