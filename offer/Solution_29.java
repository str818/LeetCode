package com.str818.offer;

/**
 * 顺时针打印矩阵
 *
 * 标签：数组
 *
 * Code It Now：https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/
 *
 * Note：https://str818.github.io/2019/07/09/sword-refers-to-offer-middle.html#29-%E9%A1%BA%E6%97%B6%E9%92%88%E6%89%93%E5%8D%B0%E7%9F%A9%E9%98%B5
 *
 * @author str818
 * @date 2020/4/12
 */
public class Solution_29 {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int m = matrix.length, n = matrix[0].length;
        int[] ans = new int[m * n];
        int r1 = 0, r2 = matrix.length - 1, c1 = 0, c2 = matrix[0].length - 1;
        int index = 0;
        while (r1 <= r2 && c1 <= c2) {
            for (int i = c1; i <= c2; i++) {
                ans[index++] = matrix[r1][i];
            }
            for (int i = r1 + 1; i <= r2; i++) {
                ans[index++] = matrix[i][c2];
            }
            if (r1 != r2) {
                for (int i = c2 - 1; i >= c1; i--) {
                    ans[index++] = matrix[r2][i];
                }
            }
            if (c1 != c2) {
                for (int i = r2 - 1; i > r1; i--) {
                    ans[index++] = matrix[i][c1];
                }
            }
            r1++; r2--; c1++; c2--;
        }
        return ans;
    }
}
