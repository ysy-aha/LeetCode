package pers.ysy.section1100.question1128;

/**
 * 查看他人答案
 * 创建一个大小未100的数组
 * 将 dominoes 中的数组的两个元素按照大小排列成 十位数字，作为下标计算频率，存入新数组
 * 循环新数组，计算频率超过1的元素，公式为 n*(n-1)/2
 *
 * 执行用时：4 ms, 在所有 Java 提交中击败了71.00%的用户
 * 内存消耗：47.2 MB, 在所有 Java 提交中击败了98.37%的用户
 * @Author ysy
 * @Date 2020/10/26
 **/
public class Solution02 {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] res = new int[100];
        for (int i = 0; i < dominoes.length; i++) {
            int index = Math.min(dominoes[i][0], dominoes[i][1]) * 10 + Math.max(dominoes[i][0], dominoes[i][1]);
            res[index]++;
        }
        int count = 0;
        for (int i : res) {
            count = count + (i * (i - 1) / 2);
        }
        return count;
    }
}
