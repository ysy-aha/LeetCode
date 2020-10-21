package pers.ysy.section900.question989;

import java.util.ArrayList;
import java.util.List;

/**
 * 数组A倒循环，设置进位标记 carry，将A最后一个元素与K相加，将结果 % 10，作为A的最后一个元素，结果 / 10 作为进位，进位不为0时，
 *  循环进一位继续相加
 *
 * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：39.8 MB, 在所有 Java 提交中击败了95.25%的用户
 * @Author ysy
 * @Date 2020/10/14
 **/
public class Solution02 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        // 设置进位
        int carry = K;
        // 倒循环 A
        for (int i = A.length - 1; i >= 0; i--) {
            // 进位与当前元素相加
            int sum = carry + A[i];
            A[i] = sum % 10;
            carry = sum / 10;
            if (carry == 0) {
                break;
            }
        }
        // 结果集合
        List<Integer> res = new ArrayList<>();
        // 如果进位不为零，还需要继续计算
        if (carry > 0) {
            while (carry > 0) {
                res.add(0, (carry % 10));
                carry = carry / 10;
            }
        }
        // 将A数组中的数据加入结果集合
        for(int i: A){
            res.add(i);
        }
        return res;
    }
}
