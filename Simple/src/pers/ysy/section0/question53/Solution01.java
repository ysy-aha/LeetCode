package pers.ysy.section0.question53;

/**
 * 从1开始遍历数组，判断前一个值是正数还是负数，如果是正数，就加上，如果是负数，就不动
 * 遍历的同时使用一个整数记录最大值
 *
 * 执行用时：2 ms, 在所有 Java 提交中击败了10.93%的用户
 * 内存消耗：48.6 MB, 在所有 Java 提交中击败了5.02%的用户
 *
 * @author ysy
 * @date 2021/9/26
 */
public class Solution01 {
	public int maxSubArray(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] > 0) {
				nums[i] += nums[i - 1];
			}
			if (max < nums[i]) {
				max = nums[i];
			}
		}
		return max;
	}
}
