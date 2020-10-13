package pers.ysy.question922;

/**
 * 新建一个数组，设置奇数和偶数的标记，循环，分别将奇数偶数存入对应位置
 *
 * 执行用时：3 ms, 在所有 Java 提交中击败了79.77%的用户
 * 内存消耗：41.5 MB, 在所有 Java 提交中击败了33.21%的用户
 * @Author ysy
 * @Date 2020/10/13
 **/
public class Solution01 {
    public int[] sortArrayByParityII(int[] A) {
        int[] B = new int[A.length];
        int oddNum = 1, evenNum = 0;
        for (int i : A) {
            if (i % 2 == 0) {
                B[evenNum] = i;
                evenNum += 2;
            }else {
                B[oddNum] = i;
                oddNum += 2;
            }
        }
        return B;
    }
}
