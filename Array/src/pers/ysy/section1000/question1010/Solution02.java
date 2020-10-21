package pers.ysy.section1000.question1010;

/**
 * 创建一个大小为60的数组remainder，遍历time数组，将元素%60取余作为下标存入remainder,
 * 然后根据 下标和为60(比如 remainder[1],remainder[59])的元素进行组合计算
 * 下标为0和下标为30的进行特殊计算
 *
 * 执行用时：2 ms, 在所有 Java 提交中击败了99.68%的用户
 * 内存消耗：43.6 MB, 在所有 Java 提交中击败了98.32%的用户
 * @Author ysy
 * @Date 2020/10/16
 **/
public class Solution02 {
    public int numPairsDivisibleBy60(int[] time) {
        // 创建余数数组
        int[] remainder = new int[60];
        // 遍历time，将元素%60的结果作为下标使得remainder数量添加
        for (int i : time) {
            remainder[i % 60]++;
        }
        // 最后结果
        int count = 0;
        // 计算下标除 0 和 30 之外的数组的集合
        for (int i = 1, j = 59; i < 30 && j > 30; i++, j--) {
            count += remainder[i] * remainder[j];
        }
        count += remainder[0] * (remainder[0] - 1) / 2;
        count += remainder[30] * (remainder[30] - 1) / 2;
        return count;
    }
}
