package pers.ysy.section800.question888;

import java.util.Arrays;

/**
 * 双标记循环，
 * 先分别求两个数组的和sum1、sum2，
 * 将两个数组排序，
 * 设置两个标记 a b，分别从两个数组起始开始移动，比较 sum1-A[a]+B[b] 和 sum2-B[b]+A[a]，左边小b向右移动，右边小a向右移动
 *
 * 执行用时：13 ms, 在所有 Java 提交中击败了57.53%的用户
 * 内存消耗：40.6 MB, 在所有 Java 提交中击败了53.80%的用户
 * @Author ysy
 * @Date 2020/10/10
 **/
public class Solution02 {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sum1 = 0, sum2 = 0;
        for (int i : A) {
            sum1 += i;
        }
        for (int i : B) {
            sum2 += i;
        }
        int a = 0, b = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        while (sum1 - A[a] + B[b] != sum2 - B[b] + A[a]) {
            if (sum1 - A[a] + B[b] < sum2 - B[b] + A[a]) {
                b++;
            } else {
                a++;
            }
        }
        int[] res = {A[a], B[b]};
        return res;
    }
}
