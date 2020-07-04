package pers.ysy.question674;

/**
 * 执行用时：1 ms, 在所有 Java 提交中击败了99.78%的用户
 * 内存消耗：40.4 MB, 在所有 Java 提交中击败了12.50%的用户
 * @Author ysy
 * @Date 2020/7/3
 **/
public class Solution01 {
    public int findLengthOfLCIS(int[] nums) {
        int len = 1;
        int max_Len = 0;
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i]>nums[i-1]){
                len++;
            }else if(i>0 && nums[i]<=nums[i-1]){
                len = 1;
            }
            if(max_Len<len){
                max_Len = len;
            }
        }
        return max_Len;
    }
}
