package com.str818.offer;

/**
 * 平衡二叉树
 *
 * 标签：树、深度优先
 *
 * Code It Now：https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/
 *
 * Note：https://str818.github.io/2019/07/10/sword-refers-to-offer-down.html#552-%E5%B9%B3%E8%A1%A1%E4%BA%8C%E5%8F%89%E6%A0%91
 *
 * @author str818
 * @date 2020/5/14
 */
public class Solution_55_2 {

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return recur(root) != -1;
    }

    int recur(TreeNode root){
        if(root == null) return 0;
        int left = recur(root.left);
        if(left == -1) return -1;
        int right = recur(root.right);
        if(right == -1) return -1;
        return Math.abs(left - right) <= 1 ? Math.max(left, right) + 1 : -1;
    }

}


