package src.pers.yshy.simple.question169;

/**
 * 169. 多数元素
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 示例 1:
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 *
 * @author ysy
 * @date 2020/12/13
 */
public class Question169 {
	public static void main(String[] args) {
		Solution01 s = new Solution01();
		int[] nums = new int[]{3, 2, 3};
		int res = s.majorityElement(nums);
		System.out.println(res);

		nums = new int[]{2, 2, 1, 1, 1, 2, 2};
		res = s.majorityElement(nums);
		System.out.println(res);
	}
}
