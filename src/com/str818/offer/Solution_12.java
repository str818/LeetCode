package com.str818.offer;

/**
 * 矩阵中的路径
 *
 * 标签：回溯
 *
 * Code It Now：https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/
 *
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#12-%E7%9F%A9%E9%98%B5%E4%B8%AD%E7%9A%84%E8%B7%AF%E5%BE%84
 *
 * @author str818
 * @date 2020/4/7
 */
public class Solution_12 {

    int[][] directions = { {0, 1}, {0, -1}, {1, 0}, {-1, 0} };
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean flag = backtrack(board, word, 0, i, j, new boolean[board.length][board[0].length]);
                if (flag) return true;
            }
        }
        return false;
    }

    public boolean backtrack(char[][] board, String word, int index, int r, int c, boolean[][] marked) {

        if (index == word.length()) {
            return true;
        }

        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || marked[r][c] || word.charAt(index) != board[r][c]) {
            return false;
        }

        marked[r][c] = true;
        for (int[] direction: directions) {
            boolean flag = backtrack(board, word, index + 1, r + direction[0], c + direction[1], marked);
            if (flag) return true;
        }
        marked[r][c] = false;
        return false;
    }

}
