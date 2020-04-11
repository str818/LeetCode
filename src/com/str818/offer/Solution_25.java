package com.str818.offer;

/**
 * 合并两个排序的链表
 *
 * 标签：链表
 *
 * Code It Now：https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
 *
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#25-%E5%90%88%E5%B9%B6%E4%B8%A4%E4%B8%AA%E6%8E%92%E5%BA%8F%E7%9A%84%E9%93%BE%E8%A1%A8
 *
 * @author str818
 * @date 2020/4/11
 */
public class Solution_25 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode cur = dummyNode;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                cur.next = l2;
                l2 = l2.next;
            } else {
                cur.next = l1;
                l1 = l1.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dummyNode.next;
    }
}
