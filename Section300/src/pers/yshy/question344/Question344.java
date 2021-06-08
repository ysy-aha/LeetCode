package pers.yshy.question344;

import java.util.Arrays;

/**
 * @author ysy
 * @date 2021/6/8
 */
public class Question344 {
	public static void main(String[] args) {
		Solution01 s = new Solution01();
		char[] arr = new char[]{'h', 'e', 'l', 'l', 'o'};
		s.reverseString(arr);
		System.out.println(Arrays.toString(arr));
	}
}
