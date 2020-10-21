package pers.ysy.section1000.question1018;

import java.util.ArrayList;
import java.util.List;

/**
 * 根据答案，使用动态规划的思想
 *
 * 执行用时：4 ms, 在所有 Java 提交中击败了96.33%的用户
 * 内存消耗：38.9 MB, 在所有 Java 提交中击败了96.22%的用户
 * @Author ysy
 * @Date 2020/10/19
 **/
public class Solution01 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<>();
        int num = 0;
        // 循环
        for (int i : A){
            num = (num * 2 + i) % 5;
            list.add(num == 0);
        }
        return list;
    }
}
