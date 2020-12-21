package pers.yshy.simple.question55;

import java.util.Arrays;

/**
 * 穷举法修改(超时)
 *
 * @Author:ysy
 * @Date:2020/12/19
 * @Package:pers.yshy.simple.question55
 **/
public class Solution02 {
    public int maxSubArray(int[] nums) {
        int left = 0;
        // 找到第一个正整数
        while (left < nums.length && nums[left] <= 0) {
            left++;
        }
        // 如果没有正整数
        if (left == nums.length) {
            return Arrays.stream(nums).max().getAsInt();
        }
        // 找到倒数第一个正整数，必定会有
        int right = nums.length - 1;
        while (right >= 0 && nums[right] <= 0) {
            right--;
        }
        // 如果只有一个正整数
        if (left == right) {
            return nums[left];
        }
        int res = Integer.MIN_VALUE;
        for (int i = left; i <= right; i++) {
            if(nums[i] > 0){
                for (int j = i; j <= right; j++) {
                    if(nums[j] > 0){
                        int sum = Arrays.stream(nums, i, j+1).sum();
                        if (res < sum) {
                            res = sum;
                        }
                    }
                }
            }
        }
        return res;
    }

}
