package com.str818.offer;

/**
 * 二叉树的镜像
 *
 * 标签：树
 *
 * Code It Now：https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
 *
 * Note：https://str818.github.io/2019/07/09/sword-refers-to-offer-middle.html#27-%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E9%95%9C%E5%83%8F
 *
 * @author str818
 * @date 2020/4/12
 */
public class Solution_27 {

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);
        return root;
    }
}
