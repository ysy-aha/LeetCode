package pers.yshy.medium.question48;

import java.util.ArrayList;
import java.util.List;

/**
 * 将矩阵中的值按照从下往上从左往右的方向读取存入list
 * 然后读取list并按照从左往右从上往下的方向赋值
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.7 MB, 在所有 Java 提交中击败了14.02%的用户
 *
 * @author ysy
 * @date 2021/1/9
 * @package pers.yshy.medium.question48
 **/
public class Solution01 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                list.add(matrix[j][i]);
            }
        }
        int pos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = list.get(pos);
                pos++;
            }
        }
    }
}
