package pers.ysy.section0.question07;

/**
 * @author ysy
 * @date 2021/9/27
 */
public class Question07 {
	public static void main(String[] args) {
		Solution01 s = new Solution01();
		int res;

		res = s.reverse(123);
		System.out.println(res);

		res = s.reverse(-120);
		System.out.println(res);

		res = s.reverse(-123);
		System.out.println(res);

		res = s.reverse(0);
		System.out.println(res);

		System.out.println(Integer.MAX_VALUE);
		res = s.reverse(Integer.MAX_VALUE);
		System.out.println(res);

		res = s.reverse(-2147483412);
		System.out.println(res);

		res = s.reverse(Integer.MIN_VALUE);
		System.out.println(res);
	}
}
