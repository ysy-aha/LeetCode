package pers.ysy.question977;

import java.util.Arrays;

/**
 * 暴力破解法：先计算所有元素的平方值，然后排序
 *
 * 执行用时：3 ms, 在所有 Java 提交中击败了33.93%的用户
 * 内存消耗：40.8 MB, 在所有 Java 提交中击败了11.08%的用户
 * @Author ysy
 * @Date 2020/10/14
 **/
public class Solution01 {
    public int[] sortedSquares(int[] A) {
        for(int i=0; i<A.length; i++){
            A[i] = A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
