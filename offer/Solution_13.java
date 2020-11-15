package com.str818.offer;

/**
 * 机器人的运动范围
 *
 * 标签：深度优先搜索
 *
 * Code It Now：https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/
 *
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#13-%E6%9C%BA%E5%99%A8%E4%BA%BA%E7%9A%84%E8%BF%90%E5%8A%A8%E8%8C%83%E5%9B%B4
 *
 * @author str818
 * @date 2020/4/7
 */
public class Solution_13 {

    int[][] next = { {1, 0}, {-1, 0}, {0, 1}, {0, -1} };
    int[][] digitSum;
    int count = 0;
    int rows, cols, threshold;

    public int movingCount(int m, int n, int k) {
        this.rows = m;
        this.cols = n;
        this.threshold = k;
        initStatus(rows, cols);
        boolean[][] marked = new boolean[rows][cols];
        dfs(marked, 0, 0);
        return count;
    }

    private void dfs(boolean[][] marked, int r, int c) {
        if (r < 0 || r >= rows || c < 0 || c >= cols || marked[r][c]) return;

        marked[r][c] = true;
        if (digitSum[r][c] > threshold) return;
        count++;
        for (int[] n : next) {
            dfs(marked, r + n[0], c + n[1]);
        }
    }

    private void initStatus(int rows, int cols) {
        int n = Math.max(rows, cols);
        int[] digitSum = new int[n];
        for (int i = 0; i < n; i++) {
            int tmp = i;
            while (tmp != 0) {
                digitSum[i] += tmp % 10;
                tmp /= 10;
            }
        }

        this.digitSum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.digitSum[i][j] = digitSum[i] + digitSum[j];
            }
        }
    }

}
