package com.str818.offer;

/**
 * 对称的二叉树
 *
 * 标签：树
 *
 * Code It Now：https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/
 *
 * Note：https://str818.github.io/2019/07/09/sword-refers-to-offer-middle.html#28-%E5%AF%B9%E7%A7%B0%E7%9A%84%E4%BA%8C%E5%8F%89%E6%A0%91
 *
 * @author str818
 * @date 2020/4/12
 */
public class Solution_28 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSame(root.left, root.right);
    }

    public boolean isSame(TreeNode A, TreeNode B) {
        if (A == null && B == null) return true;
        if (A == null || B == null || A.val != B.val) return false;
        return isSame(A.right, B.left) && isSame(A.left, B.right);
    }
}
