package pers.yshy.simple.question198;

/**
 * 创建一个数组，记录每个位置前面的最大值
 * 每个位置的最大值都需要比较 当前值和到上上个元素的最大值之和 和 到上个元素的最大值 的大小
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：35.7 MB, 在所有 Java 提交中击败了77.74%的用户
 *
 * @author ysy
 * @date 2020/12/31
 * @package pers.yshy.simple.question198
 **/
public class Solution02 {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }

}
