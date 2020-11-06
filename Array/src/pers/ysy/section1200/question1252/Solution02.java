package pers.ysy.section1200.question1252;

/**
 * 抄袭大佬思路
 *   分别用col和row数组记录每行每列的增加数量，下标表示行数或列数，值表示增加了多少
 *   然后循环col和row数组，计算奇数值
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：36.6 MB, 在所有 Java 提交中击败了70.60%的用户
 *
 * @Author ysy
 * @Date 2020/11/6
 **/
public class Solution02 {
    public int oddCells(int n, int m, int[][] indices) {
        int[] col = new int[n];
        int[] row = new int[m];
        for (int i = 0; i < indices.length; i++) {
            col[indices[i][0]]++;
            row[indices[i][1]]++;
        }
        int colNum = 0;
        int rowNum = 0;
        // 循环rol和row数组，分别计算其奇数个数，相交点另算
        for (int i = 0; i < n; i++) {
            if (col[i] % 2 != 0) {
                colNum++;
            }
        }
        for (int i = 0; i < m; i++) {
            if (row[i] % 2 != 0) {
                rowNum++;
            }
        }
        return colNum * m + rowNum * n - colNum * rowNum * 2;
    }
}
