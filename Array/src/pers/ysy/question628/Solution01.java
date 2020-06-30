package pers.ysy.question628;

import java.util.Arrays;

/**
 * 分析：将数组排序之后，如果是无负数数组，那么三个数字积最大值必定是最后的三个数字，
 *      如果存在负数，那么就需要和最左边两个负数相比较了
 * 执行用时：12 ms, 在所有 Java 提交中击败了70.71%的用户
 * 内存消耗：41.9 MB, 在所有 Java 提交中击败了7.69%的用户
 * @Author ysy
 * @Date 2020/6/30
 **/
public class Solution01 {
    public int maximumProduct(int[] nums) {
        // 先将数组排序
        Arrays.sort(nums);
        int len = nums.length;
        // 如果数组左边不存在负数
        if(nums[0]>=0){
            return nums[len-1]*nums[len-2]*nums[len-3];
        }
        // 如果数组左边存在负数
        else{
            int sum1 = nums[len-1]*nums[len-2]*nums[len-3];
            int sum2 = nums[len-1]*nums[0]*nums[1];
            return sum1>sum2?sum1:sum2;
        }
    }
}
