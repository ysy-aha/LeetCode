package pers.ysy.section0.question35;

/**
 * @author ysy
 * @date 2021/9/26
 */
public class Question35 {
	public static void main(String[] args) {
		Solution01 s = new Solution01();
		int[] nums;
		int res;

		nums = new int[]{1,3,5,6};
		res = s.searchInsert(nums, 5);
		System.out.println(res);

		res = s.searchInsert(nums, 2);
		System.out.println(res);

		res = s.searchInsert(nums, 7);
		System.out.println(res);

		res = s.searchInsert(nums, 0);
		System.out.println(res);

		nums = new int[]{1};
		res = s.searchInsert(nums, 0);
		System.out.println(res);
	}
}
