package pers.yshy.simple.question198;

/**
 * 递归，每次过一个或者过两个加上(超时)
 *
 * @author ysy
 * @date 2020/12/31
 * @package pers.yshy.simple.question198
 **/
public class Solution01 {
    public int rob(int[] nums) {
        int first = recursion(nums, 0);
        int second = recursion(nums, 1);
        return Math.max(first, second);
    }

    private int recursion(int[] nums, int pos){
        if (pos >= nums.length) {
            return 0;
        } else if (nums.length - pos <= 2) {
            return nums[pos];
        }
        int first = recursion(nums, pos + 2);
        int second = recursion(nums, pos + 3);
        return nums[pos] + Math.max(first, second);
    }
}
