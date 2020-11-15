package com.str818.offer;

/**
 * 树的子结构
 *
 * 标签：树
 *
 * Code It Now：https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/
 *
 * Note：https://str818.github.io/2019/07/09/sword-refers-to-offer-middle.html#26-%E6%A0%91%E7%9A%84%E5%AD%90%E7%BB%93%E6%9E%84
 *
 * @author str818
 * @date 2020/4/12
 */
public class Solution_26 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;
        return isSameTree(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    public boolean isSameTree(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null) return false;
        if (A.val != B.val) return false;
        return isSameTree(A.left, B.left) && isSameTree(A.right, B.right);
    }
}
