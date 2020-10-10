package pers.ysy.question832;

/**
 * 循环 设置左右坐标，将小数组先水平翻转，然后图片翻转
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：39.2 MB, 在所有 Java 提交中击败了17.57%的用户
 * @Author ysy
 * @Date 2020/10/10
 **/
public class Solution01 {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int l = 0, r = A[i].length - 1; l <= r; l++, r--) {
                int temp = A[i][l];
                A[i][l] = A[i][r] == 1 ? 0 : 1;
                A[i][r] = temp == 1 ? 0 : 1;
            }
        }
        return A;
    }
}
