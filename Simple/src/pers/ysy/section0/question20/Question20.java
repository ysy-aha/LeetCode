package pers.ysy.section0.question20;

/**
 * @author ysy
 * @date 2021/9/29
 */
public class Question20 {
	public static void main(String[] args) {
		Solution20 s = new Solution20();
		boolean res;

		res = s.isValid("()");
		System.out.println(res);

		res = s.isValid("()[]{}");
		System.out.println(res);

		res = s.isValid("(]");
		System.out.println(res);

		res = s.isValid("([)]");
		System.out.println(res);

		res = s.isValid("{[]}");
		System.out.println(res);

		res = s.isValid("{");
		System.out.println(res);
	}
}
