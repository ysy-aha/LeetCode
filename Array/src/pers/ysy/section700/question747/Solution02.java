package pers.ysy.section700.question747;

/**
 * 暴力破解
 * 先循环查找最大值，然后循环判断是否是其他数字得两倍
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：37 MB, 在所有 Java 提交中击败了36.32%的用户
 * @Author ysy
 * @Date 2020/10/9
 **/
public class Solution02 {
    public int dominantIndex(int[] nums){
        int num = 0;
        for (int i=0; i<nums.length; i++){
            if(nums[i] > nums[num]){
                num = i;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(i == num){
                continue;
            }
            if(nums[i]*2 > nums[num]){
                return -1;
            }
        }
        return num;
    }
}
