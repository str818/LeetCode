package com.str818.offer;

/**
 * 二叉搜索树与双向链表
 *
 * 标签：树
 *
 * Code It Now：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/
 *
 * Note：https://str818.github.io/2019/07/09/sword-refers-to-offer-middle.html#36-%E4%BA%8C%E5%8F%89%E6%90%9C%E7%B4%A2%E6%A0%91%E4%B8%8E%E5%8F%8C%E5%90%91%E9%93%BE%E8%A1%A8
 *
 * @author str818
 * @date 2020/4/14
 */
public class Solution_36 {

    Node head, pre;
    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        recur(root);
        pre.right = head;
        head.left = pre;
        return head;
    }

    public void recur(Node root) {
        if (root == null) return;
        recur(root.left);
        root.left = pre;
        if (pre != null) {
            pre.right = root;
        } else {
            head = root;
        }
        pre = root;
        recur(root.right);
    }

    static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };

}


