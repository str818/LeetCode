package com.str818.offer;

/**
 * 序列化二叉树
 *
 * 标签：树、设计
 *
 * Code It Now：https://leetcode-cn.com/problems/xu-lie-hua-er-cha-shu-lcof/
 *
 * Note：https://str818.github.io/2019/07/09/sword-refers-to-offer-middle.html#37-%E5%BA%8F%E5%88%97%E5%8C%96%E4%BA%8C%E5%8F%89%E6%A0%91
 *
 * @author str818
 * @date 2020/4/14
 */
public class Solution_37 {

    String deserializeStr;
    public String serialize(TreeNode root) {
        if (root == null) return "#";
        return root.val + " " + serialize(root.left) + " " + serialize(root.right);
    }

    public TreeNode deserialize(String data) {
        deserializeStr = data;
        return deserialize();
    }

    public TreeNode deserialize() {
        if (deserializeStr.length() == 0) return null;
        int index = deserializeStr.indexOf(" ");
        String node = index == -1 ? deserializeStr : deserializeStr.substring(0, index);
        deserializeStr = index == -1 ? "" : deserializeStr.substring(index + 1);
        if (node.equals("#")) return null;
        int val = Integer.parseInt(node);
        TreeNode t = new TreeNode(val);
        t.left = deserialize();
        t.right = deserialize();
        return t;
    }

}


