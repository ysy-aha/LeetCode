package pers.ysy.section0.question26;

/**
 * 循环，当前元素与前一元素是否相同，如果相同，就将后面的元素往前移一位
 *
 * 执行用时：395 ms, 在所有 Java 提交中击败了5.05%的用户
 * 内存消耗：39.9 MB, 在所有 Java 提交中击败了38.50%的用户
 *
 * @author ysy
 * @date 2021/9/30
 */
public class Solution01 {
	public int removeDuplicates(int[] nums) {
		int count = 0;
		int i = 1;
		while (i + count < nums.length) {
			if (nums[i] == nums[i - 1]) {
				count++;
				for (int j = i; j < nums.length - count; j++) {
					nums[j] = nums[j + 1];
				}
			} else {
				i++;
			}
		}
		return nums.length - count;
	}
}
