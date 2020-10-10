package pers.ysy.question888;

/**
 * 计算两个数组的总和，然后除以二的平均数，再分别计算两个数组的和，将两个和与平均数计算差
 * 循环两个数组，计算a数据减去某个值加上b数组中的某个值等于平均值
 *
 * 执行用时：1168 ms, 在所有 Java 提交中击败了6.11%的用户
 * 内存消耗：40.5 MB, 在所有 Java 提交中击败了65.50%的用户
 * @Author ysy
 * @Date 2020/10/10
 **/
public class Solution01 {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0, sumB = 0;
        int[] res = new int[2];
        for (int i : A) {
            sumA += i;
        }
        for (int i : B) {
            sumB += i;
        }
        int average = (sumA + sumB) / 2;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (sumA - A[i] + B[j] == average) {
                    res[0] = A[i];
                    res[1] = B[j];
                }
            }
        }
        return res;
    }
}
