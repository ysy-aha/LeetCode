package pers.ysy.section0.question01;

import java.util.HashMap;
import java.util.Map;

/**
 * 循环
 * 用map作为存储，当map中不存在当前元素时，存入map，key时目标值减去当前元素的值，value是当前下标
 * 当某个元素存在map时，就意味着找到了
 *
 * 执行用时：2 ms, 在所有 Java 提交中击败了87.28%的用户
 * 内存消耗：38.5 MB, 在所有 Java 提交中击败了75.88%的用户
 * @author ysy
 * @date 2021/9/27
 */
public class Solution01 {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(target - nums[i], i);
			} else {
				return new int[]{map.get(nums[i]), i};
			}
		}
		return null;
	}
}
