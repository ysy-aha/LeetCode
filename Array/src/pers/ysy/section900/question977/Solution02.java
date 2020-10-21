package pers.ysy.section900.question977;

/**
 * 双指针算法：
 *   分割数组的正数和负数，设置两个标记，一个正向走正数，一个逆向走负数，
 *   新建一个数组，从标记出发，从小到大将原数组的元素平方值加入新建数组
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：40.5 MB, 在所有 Java 提交中击败了68.58%的用户
 * @Author ysy
 * @Date 2020/10/14
 **/
public class Solution02 {
    public int[] sortedSquares(int[] A) {
        // 正数起点
        int right = 0;
        // 计算正数的起点，不能大于A的长度
        while (right < A.length && A[right] < 0) {
            right++;
        }
        // 设置负数起点，小心值未负数
        int left = right - 1;
        // 返回结果数组
        int[] res = new int[A.length];
        // res数组的下标
        int flag = 0;
        // 先假设 right < A.length 并且 left >= 0
        // 从两个方向读取A数组的元素，并判断大小，存入res数组，flag增加
        while (left >= 0 && right < A.length) {
            if (A[left] * A[left] > A[right] * A[right]) {
                res[flag] = A[right] * A[right];
                right++;
            } else {
                res[flag] = A[left] * A[left];
                left--;
            }
            flag++;
        }
        // 如果 right < A.length 并且 left < 0
        while (right < A.length && left < 0) {
            res[flag] = A[right] * A[right];
            right++;
            flag++;
        }
        // 如果 left >= 0 并且 right >= A.length
        while (left >= 0 && right >= A.length) {
            res[flag] = A[left] * A[left];
            left--;
            flag++;
        }
        return res;
    }
}
