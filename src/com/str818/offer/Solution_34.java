package com.str818.offer;

import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树中和为某一值的路径
 *
 * 标签：树、深度优先搜索
 *
 * Code It Now：https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/
 *
 * Note：https://str818.github.io/2019/07/09/sword-refers-to-offer-middle.html#34-%E4%BA%8C%E5%8F%89%E6%A0%91%E4%B8%AD%E5%92%8C%E4%B8%BA%E6%9F%90%E4%B8%80%E5%80%BC%E7%9A%84%E8%B7%AF%E5%BE%84
 *
 * @author str818
 * @date 2020/4/13
 */
public class Solution_34 {

    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        recur(root, sum);
        return res;
    }
    void recur(TreeNode root, int tar) {
        if(root == null) return;
        path.add(root.val);
        tar -= root.val;
        if(tar == 0 && root.left == null && root.right == null)
            res.add(new LinkedList(path));
        recur(root.left, tar);
        recur(root.right, tar);
        path.removeLast();
    }

}
