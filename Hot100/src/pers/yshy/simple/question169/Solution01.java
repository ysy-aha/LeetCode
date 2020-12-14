package src.pers.yshy.simple.question169;

import java.util.Arrays;

/**
 * 给数组排序，然后中位数一定是多数元素
 *
 * 执行用时：2 ms, 在所有 Java 提交中击败了75.79%的用户
 * 内存消耗：41.8 MB, 在所有 Java 提交中击败了69.84%的用户
 *
 * @author ysy
 * @date 2020/12/13
 */
public class Solution01 {
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		return nums[len/2];
	}
}
