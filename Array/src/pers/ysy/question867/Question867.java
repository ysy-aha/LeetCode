package pers.ysy.question867;

/**
 * 867.转置矩阵
 * 给定一个矩阵 A， 返回 A 的转置矩阵。
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 *
 * 示例 1：
 *  输入：[[1,2,3],[4,5,6],[7,8,9]]
 *  输出：[[1,4,7],[2,5,8],[3,6,9]]
 * 示例 2：
 *  输入：[[1,2,3],[4,5,6]]
 *  输出：[[1,4],[2,5],[3,6]]
 *
 * 提示：
 *  1 <= A.length <= 1000
 *  1 <= A[0].length <= 1000
 * @Author ysy
 * @Date 2020/10/10
 **/
public class Question867 {

    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] arr2 = {
                {1, 2}
        };
        int[][] arr3 = {
                {1}
        };
        int[][] arr4 = {
                {1},
                {2}
        };
        int[][] res = s.transpose(arr4);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
