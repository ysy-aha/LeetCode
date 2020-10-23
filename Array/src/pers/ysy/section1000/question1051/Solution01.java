package pers.ysy.section1000.question1051;

import java.util.Arrays;

/**
 * 先创建复制数组B，然后将数组B排序，再与原数组进行比较，有多少个元素发生了变化
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了84.35%的用户
 * 内存消耗：36.1 MB, 在所有 Java 提交中击败了98.38%的用户
 * @Author ysy
 * @Date 2020/10/22
 **/
public class Solution01 {
    public int heightChecker(int[] heights) {
        int[] copy = heights.clone();
        Arrays.sort(copy);
        int count = 0;
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
