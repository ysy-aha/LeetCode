package pers.ysy.section0.question09;

/**
 * 设置左右起点l和r
 * l从左往右，r从右到左，在l<r的情况下，有一此两个值对不上，就不是回文数
 *
 * 执行用时：15 ms, 在所有 Java 提交中击败了14.34%的用户
 * 内存消耗：38.3 MB, 在所有 Java 提交中击败了10.21%的用户
 * @author ysy
 * @date 2021/9/28
 */
public class Solution01 {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		} else if (x < 10) {
			return true;
		}
		char[] chars = (x + "").toCharArray();
		int l = 0;
		int r = chars.length - 1;
		while (l < r) {
			if (chars[l] != chars[r]) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}
