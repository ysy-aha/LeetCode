package pers.ysy.section0.question01;

/**
 * @author ysy
 * @date 2021/9/27
 */
public class Question01 {
	public static void main(String[] args) {
		Solution01 s = new Solution01();
		int[] nums;
		int[] res;

		nums = new int[]{2, 7, 11, 15};
		res = s.twoSum(nums, 9);
		System.out.println(res[0] + " :: " + res[1]);

		nums = new int[]{3, 2, 4};
		res = s.twoSum(nums, 6);
		System.out.println(res[0] + " :: " + res[1]);

		nums = new int[]{3, 3};
		res = s.twoSum(nums, 6);
		System.out.println(res[0] + " :: " + res[1]);

		nums = new int[]{0, 3, 4, 0};
		res = s.twoSum(nums, 0);
		System.out.println(res[0] + " :: " + res[1]);

		nums = new int[]{-1,-2,-3,-4,-5};
		res = s.twoSum(nums, -8);
		System.out.println(res[0] + " :: " + res[1]);
	}
}
