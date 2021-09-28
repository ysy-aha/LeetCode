package pers.ysy.section0.question13;

/**
 * @author ysy
 * @date 2021/9/28
 */
public class Question13 {
	public static void main(String[] args) {
		Solution02 s = new Solution02();
		int res;

		res = s.romanToInt("III");
		System.out.println(res);

		res = s.romanToInt("IV");
		System.out.println(res);

		res = s.romanToInt("IX");
		System.out.println(res);

		res = s.romanToInt("LVIII");
		System.out.println(res);

		res = s.romanToInt("MCMXCIV");
		System.out.println(res);

		res = s.romanToInt("CMXCIX");
		System.out.println(res);
	}
}
