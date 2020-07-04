package pers.ysy.question717;

import java.util.Arrays;

/**
 * 回溯
 * 执行用时：2 ms, 在所有 Java 提交中击败了17.42%的用户
 * 内存消耗：40.5 MB, 在所有 Java 提交中击败了20.00%的用户
 * @Author ysy
 * @Date 2020/7/4
 **/
public class Solution01 {
    public boolean isOneBitCharacter(int[] bits) {
        boolean result = backtracking(Arrays.copyOf(bits, bits.length - 1));
        return result;
    }

    public boolean backtracking(int[] nums) {
        int len = nums.length;
        boolean result = false;
        // 如果数组长度为0，或是长度为1但值为1，直接返回false
        if ((len == 1 && nums[0] == 1)) {
            return false;
        }else if(len == 0){
            return true;
        }
        // 先判断是不是单比特
        if (nums[len - 1] == 0) {
            result = backtracking(Arrays.copyOf(nums, len - 1));
        }
        // 如果result=false，说明不能为单比特，判断是否可以为11双比特
        if (!result && nums[len - 1] == 1 && nums[len - 2] == 1) {
            result = backtracking(Arrays.copyOf(nums, len - 2));
        }
        // 如果result=false，说明不能为单比特，也不是11双比特，判断是否可以为10双比特
        if (!result && nums[len - 1] == 0 && nums[len - 2] == 1) {
            result = backtracking(Arrays.copyOf(nums, len - 2));
        }
        return result;
    }
}
