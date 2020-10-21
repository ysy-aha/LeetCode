package pers.ysy.section900.question941;

/**
 * 循环，设置标记初始为0，修改一次加一，大于2就返回false，遇到相等的也直接返回false
 *
 * 执行用时：2 ms, 在所有 Java 提交中击败了43.21%的用户
 * 内存消耗：39.4 MB, 在所有 Java 提交中击败了94.78%的用户
 *
 * @Author ysy
 * @Date 2020/10/13
 **/
public class Solution01 {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int flag = 0;
        for (int i = 1; i < A.length; i++) {
            if(flag == 0 && A[i] > A[i-1]){
                flag = 1;
            }
            if (flag == 1 && A[i] < A[i - 1]) {
                flag = 2;
            } else if (flag == 0 && A[i] <= A[i - 1]) {
                return false;
            } else if (flag == 2 && A[i] >= A[i - 1]) {
                return false;
            }
        }
        return flag == 2 ? true : false;
    }
}
