package pers.ysy.section0.question53;

/**
 * @author ysy
 * @date 2021/9/26
 */
public class Question35 {
	public static void main(String[] args) {
		Solution01 s = new Solution01();
		int[] nums;
		int res;

		nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
		res = s.maxSubArray(nums);
		System.out.println(res);

		nums = new int[]{1};
		res = s.maxSubArray(nums);
		System.out.println(res);

		nums = new int[]{0};
		res = s.maxSubArray(nums);
		System.out.println(res);

		nums = new int[]{-1};
		res = s.maxSubArray(nums);
		System.out.println(res);

		nums = new int[]{-100000};
		res = s.maxSubArray(nums);
		System.out.println(res);
	}
}
