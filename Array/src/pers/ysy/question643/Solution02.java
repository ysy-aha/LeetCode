package pers.ysy.question643;

/**
 * 遍历数组，将数组上的每个值都变成其前面所有值的和
 * 将某个值减去当前下标k个之前的值，就是k个数的总数，取最大总数，获取最大平均数
 *
 * 执行用时：3 ms, 在所有 Java 提交中击败了84.17%的用户
 * 内存消耗：43.3 MB, 在所有 Java 提交中击败了16.67%的用户
 * @Author ysy
 * @Date 2020/6/30
 **/
public class Solution02 {
    public double findMaxAverage(int[] nums, int k) {
        // 遍历数组，将当前值与前面的值相加
        for(int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }
        double max_sum = nums[k-1];
        for(int i=k; i<nums.length; i++){
            int sum = nums[i] - nums[i-k];
            if(max_sum < sum){
                max_sum = sum;
            }
        }
        return max_sum/k;
    }
}
