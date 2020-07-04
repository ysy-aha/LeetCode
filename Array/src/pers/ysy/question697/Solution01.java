package pers.ysy.question697;

/**
 * 第一次循环，找到数组的度，第二次循环，找到最小数组
 * (超时)
 * @Author ysy
 * @Date 2020/7/3
 **/
public class Solution01 {
    public int findShortestSubArray(int[] nums) {
        int max_len = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            int len = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    len++;
                }
            }
            if (max_len < len) {
                max_len = len;
            }
        }
        int count = nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            int len = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    len++;
                    if (max_len == len && count > j - i + 1) {
                        count = j - i + 1;
                    }
                }
            }
        }
        return count;
    }
}
