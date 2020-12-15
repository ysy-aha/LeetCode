package pers.yshy.simple.question448;

import java.util.ArrayList;
import java.util.List;

/**
 * 循环一次，将处于元素 n 实际位置的数标记为负数
 * 二次循环，找出所有位置为正数的数
 *
 * 执行用时：8 ms, 在所有 Java 提交中击败了37.79%的用户
 * 内存消耗：47.4 MB, 在所有 Java 提交中击败了55.11%的用户
 *
 * @Author:ysy
 * @Date:2020/12/15
 * @Package:pers.yshy.simple.question448
 **/
public class Solution01 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]) - 1;
            nums[num] = Math.abs(nums[num]) * -1;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }
}

