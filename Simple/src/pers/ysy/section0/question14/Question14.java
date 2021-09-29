package pers.ysy.section0.question14;

/**
 * @author ysy
 * @date 2021/9/29
 */
public class Question14 {
	public static void main(String[] args) {
		Solution01 s = new Solution01();
		String res;
		String[] strs;

		strs = new String[]{"flower", "flow", "flight"};
		res = s.longestCommonPrefix(strs);
		System.out.println(res);

		strs = new String[]{"dog", "racecar", "car"};
		res = s.longestCommonPrefix(strs);
		System.out.println(res);

		strs = new String[]{"dog", "", "car"};
		res = s.longestCommonPrefix(strs);
		System.out.println(res);

		strs = new String[]{"", "sads", "car"};
		res = s.longestCommonPrefix(strs);
		System.out.println(res);
	}
}
