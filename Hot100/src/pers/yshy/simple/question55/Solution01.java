package pers.yshy.simple.question55;

import java.util.Arrays;

/**
 * 穷举法(超时)
 *
 * @Author:ysy
 * @Date:2020/12/19
 * @Package:pers.yshy.simple.question55
 **/
public class Solution01 {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <= nums.length; j++) {
                int sum = Arrays.stream(nums, i, j).sum();
                if(res < sum){
                    res = sum;
                }
            }

        }
        return res;
    }
}
