package com.str818.offer;

/**
 * 重建二叉树
 *
 * 标签：树、递归
 *
 * Code It Now：https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
 *
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#7-%E9%87%8D%E5%BB%BA%E4%BA%8C%E5%8F%89%E6%A0%91
 *
 * @author str818
 * @date 2020/4/6
 */
public class Solution_7 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, 0, inorder, 0, inorder.length);
    }

    public TreeNode helper(int[] preorder, int preIndex, int[] inorder, int inLeft, int inRight) {

        if (preIndex >= preorder.length || inLeft == inRight) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIndex]);
        for (int i = inLeft; i < inRight; i++) {
            if (inorder[i] == preorder[preIndex]) {
                root.left = helper(preorder, preIndex + 1, inorder, inLeft, i);
                root.right = helper(preorder, preIndex + i - inLeft + 1, inorder, i + 1, inRight);
            }
        }
        return root;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
