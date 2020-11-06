package pers.ysy.section1200.question1252;

/**
 * 先加上，然后循环统计奇数
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了72.89%的用户
 * 内存消耗：36.7 MB, 在所有 Java 提交中击败了59.88%的用户
 * @Author ysy
 * @Date 2020/11/6
 **/
public class Solution01 {
    public int oddCells(int n, int m, int[][] indices) {
        // 创建矩阵
        int[][] matrix = new int[n][m];
        // 循环indices数组，将matrix对应位置数字增加
        for (int i = 0; i < indices.length; i++) {
            // 横向相加
            int x = indices[i][0];
            for (int j = 0; j < m; j++) {
                matrix[x][j]++;
            }
            // 纵向相加
            int y = indices[i][1];
            for (int j = 0; j < n; j++) {
                matrix[j][y]++;
            }
        }
        //展示数组，提交得时候记得删除
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + ",\t");
            }
            System.out.print("\b\b\n");
        }
        // 计算奇数
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
