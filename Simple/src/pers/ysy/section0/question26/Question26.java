package pers.ysy.section0.question26;

/**
 * @author ysy
 * @date 2021/9/30
 */
public class Question26 {
	public static void main(String[] args) {
		Solution01 s = new Solution01();
		int res;
		int[] nums;

		nums = new int[]{1, 1, 2};
		res = s.removeDuplicates(nums);
		System.out.println(res);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();

		nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		res = s.removeDuplicates(nums);
		System.out.println(res);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();

		nums = new int[]{};
		res = s.removeDuplicates(nums);
		System.out.println(res);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();

		nums = new int[]{1,1,2};
		res = s.removeDuplicates(nums);
		System.out.println(res);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();

		nums = new int[]{1,1,1};
		res = s.removeDuplicates(nums);
		System.out.println(res);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();

		nums = new int[]{1,2,2};
		res = s.removeDuplicates(nums);
		System.out.println(res);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();
	}
}
