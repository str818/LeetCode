package com.str818.offer;

/**
 * 二叉树的深度
 *
 * 标签：树、层次遍历、深度优先
 *
 * Code It Now：https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
 *
 * Note：https://str818.github.io/2019/07/10/sword-refers-to-offer-down.html#551-%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E6%B7%B1%E5%BA%A6
 *
 * @author str818
 * @date 2020/5/14
 */
public class Solution_55_1 {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}


