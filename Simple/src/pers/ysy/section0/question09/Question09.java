package pers.ysy.section0.question09;

/**
 * @author ysy
 * @date 2021/9/28
 */
public class Question09 {
	public static void main(String[] args) {
		Solution01 s = new Solution01();
		boolean res;

		res = s.isPalindrome(121);
		System.out.println(res);

		res = s.isPalindrome(-121);
		System.out.println(res);

		res = s.isPalindrome(10);
		System.out.println(res);

		res = s.isPalindrome(12321);
		System.out.println(res);

		res = s.isPalindrome(6512256);
		System.out.println(res);

		res = s.isPalindrome(11);
		System.out.println(res);

		res = s.isPalindrome(65122156);
		System.out.println(res);
	}
}
