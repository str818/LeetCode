package com.str818.offer;

/**
 * 二叉搜索树的第 K 大节点
 *
 * 标签：树
 *
 * Code It Now：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/
 *
 * Note：https://str818.github.io/2019/07/10/sword-refers-to-offer-down.html#54-%E4%BA%8C%E5%8F%89%E6%90%9C%E7%B4%A2%E6%A0%91%E7%9A%84%E7%AC%AC-k-%E5%A4%A7%E8%8A%82%E7%82%B9
 *
 * @author str818
 * @date 2020/5/14
 */
public class Solution_54 {

    int res, k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        helper(root);
        return res;
    }

    public void helper(TreeNode root) {
        if (root == null) return;
        helper(root.right);
        if (k == 0) return;
        if (--k == 0) res = root.val;
        helper(root.left);
    }

}


