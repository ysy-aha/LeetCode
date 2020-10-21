package pers.ysy.section600.question643;

/**
 * 超时
 * @Author ysy
 * @Date 2020/6/30
 **/
public class Solution01 {
    public double findMaxAverage(int[] nums, int k) {
        // 遍历数组，依次取k大小的字数组，判断平均数
        double max_average = 0;
        double sum = nums[0];
        for(int i=1; i<k; i++){
            sum += nums[i];
        }
        max_average = sum/k;
        for(int i=k-1; i<nums.length; i++){
            sum = nums[i];
            for(int j=k-1; j>0; j--){
                sum += nums[i-j];
            }
            max_average = max_average>(sum/k)?max_average:(sum/k);
        }
        return max_average;
    }
}
