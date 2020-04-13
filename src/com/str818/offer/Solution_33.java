package com.str818.offer;

/**
 * 二叉搜索树的后序遍历序列
 *
 * 标签：树
 *
 * Code It Now：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/
 *
 * Note：https://str818.github.io/2019/07/09/sword-refers-to-offer-middle.html#33-%E4%BA%8C%E5%8F%89%E6%90%9C%E7%B4%A2%E6%A0%91%E7%9A%84%E5%90%8E%E7%BB%AD%E9%81%8D%E5%8E%86%E5%BA%8F%E5%88%97
 *
 * @author str818
 * @date 2020/4/13
 */
public class Solution_33 {

    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    boolean recur(int[] postorder, int i, int j) {
        if(i >= j) return true;
        int p = i;
        while(postorder[p] < postorder[j]) p++;
        int m = p;
        while(postorder[p] > postorder[j]) p++;
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }

}
