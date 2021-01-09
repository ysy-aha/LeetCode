package pers.yshy.medium.question48;

/**
 * a → b
 * ↑   ↓
 * d ← c
 * 循环，每次循环移动四个值，按照对角线从上往下，同一层从左往右
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.4 MB, 在所有 Java 提交中击败了82.37%的用户
 *
 * @author ysy
 * @date 2021/1/9
 * @package pers.yshy.medium.question48
 **/
public class Solution02 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                // 参考上图，a的值暂存
                int temp = matrix[i][j];
                // d赋值给a
                matrix[i][j] = matrix[n - j - 1][i];
                // c赋值给d
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                // b赋值给c
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                // a赋值给b
                matrix[j][n - i - 1] = temp;
            }
        }
    }

    private static void out(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
