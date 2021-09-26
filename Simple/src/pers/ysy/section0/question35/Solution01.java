package pers.ysy.section0.question35;

/**
 * 二分法
 * 设定两个左右边界值l,r，一个中间值m
 * 1. 初始如果左边的值大就返回0，右边的值小就返回n，否则进行步骤2
 * 2. 取数组中间值与目标进行比较，如果m较大，r=m，如果m较小，l=m，如果m与目标值相等，返回目标值下标
 * 3. 循环进行步骤2，直到l!<r，此时有两种可能，如果m等于目标，返回m下标。否则返回m下标+1
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：37.8 MB, 在所有 Java 提交中击败了91.31%的用户
 *
 * @author ysy
 * @date 2021/9/26
 */
public class Solution01 {
	public int searchInsert(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;
		if (target <= nums[0]) {
			return 0;
		} else if (target >= nums[r]) {
			return target == nums[r] ? r : r + 1;
		}
		int m = (r + l) / 2;
		while (m > l && m < r) {
			if (nums[m] == target) {
				return m;
			} else if (nums[m] < target) {
				l = m;
			} else {
				r = m;
			}
			m = (r + l) / 2;
		}
		return nums[m] == target ? m : m + 1;
	}
}
