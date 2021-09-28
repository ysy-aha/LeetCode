package pers.ysy.section0.question13;

import java.util.*;

/**
 * 列出所有的13可能性，独立出一个switch方法
 * 将所有的13中可能存入list
 * 循环，先取两个字符，判断list是否存在，如果存在，直接计算，不存在就取一个字符，然后计算
 *
 * 执行用时：11 ms, 在所有 Java 提交中击败了9.68%的用户
 * 内存消耗：38.8 MB, 在所有 Java 提交中击败了42.05%的用户
 *
 * @author ysy
 * @date 2021/9/28
 */
public class Solution01 {
	public int romanToInt(String s) {
		int sum = 0;
		int len = s.length();
		List<String> list = Arrays.asList(new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"});
		for (int i = 0; i < len; i++) {
			if (i + 1 < len) {
				String str = s.substring(i, i+2);
				if (list.contains(str)) {
					sum += getSum(str);
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
