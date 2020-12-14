package pers.yshy.simple.question283;

/**
 * solution01 的改进
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.7 MB, 在所有 Java 提交中击败了76.45%的用户
 *
 * @Author:ysy
 * @Date:2020/12/14
 * @Package:pers.yshy.simple.question283
 **/
public class Solution02 {

    public void moveZeroes(int[] nums) {
        int x = 0, y = 0;
        while (y < nums.length) {
            if(nums[x] != 0 && nums[y] != 0){
                x++;
                y++;
            } else if(nums[x] == 0){
                if(nums[y] != 0){
                    nums[x] = nums[y];
                    nums[y] = 0;
                    x++;
                }
                y++;
            }
        }
    }

}
