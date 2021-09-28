package pers.ysy.section0.question07;

/**
 * 将Integer.MAX_VALUE和Integer.MIN_VALUE转换成字符串
 * 判断目标值是否是负数，如果不是，将其转换为正数(如果目标值为 -2^31，就无法转换成正数)
 * 将目标值转换成StringBuilder并反转为str
 * 如果反转后的字符串长度大于Integer.MAX_VALUE字符串的长度，返回0，等于进入下一步
 * 如果目标值是负数，依次比较字符大小，如果max的某个字符小于str的对应字符，返回0，如果大于，说明目标数字小于max
 * 如果目标值是正数，同理负数
 *
 * 执行用时：7 ms, 在所有 Java 提交中击败了7.38%的用户
 * 内存消耗：36.2 MB, 在所有 Java 提交中击败了5.54%的用户
 * @author ysy
 * @date 2021/9/27
 */
public class Solution01 {
	public int reverse(int x) {
		String max = Integer.MAX_VALUE + "";
		String min = Integer.MIN_VALUE + "";
		boolean minus = x < 0;
		if (minus) {
			x = -x;
		}
		StringBuilder str = new StringBuilder((x + ""));
		str = str.reverse();
		if (str.length() == max.length()) {
			if (minus) {
				for (int i = 1; i < min.length(); i++) {
					if (min.charAt(i) < str.charAt(i - 1)) {
						return 0;
					}
					if (min.charAt(i) > str.charAt(i - 1)) {
						break;
					}
				}
			} else {
				for (int i = 0; i < max.length(); i++) {
					if (max.charAt(i) < str.charAt(i)) {
						return 0;
					}
					if (max.charAt(i) > str.charAt(i)) {
						break;
					}
				}
			}
		}
		else if(str.length() > max.length()){
			return 0;
		}
		x = Integer.parseInt(str.toString());
		if (minus) {
			x = -x;
		}
		return x;
	}
}

/*
0000 0000 0000 0000 0000 0000 0000 0000
123 0000 0000 0000 0000 0000 0000 0111 1011
321 0000 0000 0000 0000 0000 0001 0100 0001


 */


