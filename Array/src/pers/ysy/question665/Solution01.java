package pers.ysy.question665;

/**
 * 抄袭
 * 执行用时：1 ms, 在所有 Java 提交中击败了99.90%的用户
 * 内存消耗：40.9 MB, 在所有 Java 提交中击败了16.67%的用户
 * @Author ysy
 * @Date 2020/7/2
 **/
public class Solution01 {
    public boolean checkPossibility(int[] nums) {
        int cnt = 0;
        for(int i = 1; i < nums.length && cnt<=1 ; i++){
            if(nums[i-1] > nums[i]){
                cnt++;
                if(i-2>=0 && nums[i-2] > nums[i]) {
                    nums[i] = nums[i-1];
                }
            }
        }
        return cnt<=1;
    }
}
