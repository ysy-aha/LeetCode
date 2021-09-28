package pers.ysy.section0.question13;

import java.util.Arrays;
import java.util.List;

/**
 * 在solution01的基础上，不使用list
 *
 * 执行用时：10 ms, 在所有 Java 提交中击败了11.39%的用户
 * 内存消耗：38.9 MB, 在所有 Java 提交中击败了30.05%的用户
 *
 * @author ysy
 * @date 2021/9/28
 */
public class Solution02 {
	public int romanToInt(String s) {
		int sum = 0;
		int len = s.length();
		for (int i = 0; i < len; i++) {
			if (i + 1 < len) {
				String str = s.substring(i, i + 2);
				int num = getSum(str);
				if (num != 0) {
					sum += num;
					i++;
					continue;
				}

			}
			sum += getSum(s.charAt(i) + "");
		}
		return sum;
	}

	private int getSum(String str) {
		int num = 0;
		switch (str) {
			case "I": {
				num = 1;
				break;
			}
			case "IV": {
				num = 4;
				break;
			}
			case "V": {
				num = 5;
				break;
			}
			case "IX": {
				num = 9;
				break;
			}
			case "X": {
				num = 10;
				break;
			}
			case "XL": {
				num = 40;
				break;
			}
			case "L": {
				num = 50;
				break;
			}
			case "XC": {
				num = 90;
				break;
			}
			case "C": {
				num = 100;
				break;
			}
			case "CD": {
				num = 400;
				break;
			}
			case "D": {
				num = 500;
				break;
			}
			case "CM": {
				num = 900;
				break;
			}
			case "M": {
				num = 1000;
				break;
			}
		}
		return num;
	}

}
