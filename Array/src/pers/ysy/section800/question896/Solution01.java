package pers.ysy.section800.question896;

/**
 * 设置标记 flag，标记为0是未定，标记为1是递增，标记为2是递减
 * 循环，根据前面的值设置标记
 *
 * 执行用时：2 ms, 在所有 Java 提交中击败了46.10%的用户
 * 内存消耗：46.4 MB, 在所有 Java 提交中击败了82.46%的用户
 * @Author ysy
 * @Date 2020/10/12
 **/
public class Solution01 {
    public boolean isMonotonic(int[] A) {
        int flag = 0;
        for (int i = 1; i < A.length; i++) {
            if (flag == 0) {
                if (A[i] > A[i - 1]) {
                    flag = 1;
                } else if (A[i] < A[i - 1]) {
                    flag = 2;
                }
            } else {
                if (flag == 1 && A[i] < A[i - 1]) {
                    return false;
                } else if (flag == 2 && A[i] > A[i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
