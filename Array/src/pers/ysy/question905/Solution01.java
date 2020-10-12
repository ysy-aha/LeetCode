package pers.ysy.question905;

/**
 * 创建一个相同大小的数组，遇到奇数从左边插入，遇到偶数从右边插入
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：39.5 MB, 在所有 Java 提交中击败了88.60%的用户
 * @Author ysy
 * @Date 2020/10/12
 **/
public class Solution01 {

    public int[] sortArrayByParity(int[] A) {
        int[] B = new int[A.length];
        int left = 0, right = A.length - 1;
        for (int i : A) {
            if (i % 2 != 0) {
                B[right] = i;
                right--;
            } else {
                B[left] = i;
                left++;
            }
        }
        return B;
    }

}
