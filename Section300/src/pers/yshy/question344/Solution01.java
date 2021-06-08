package pers.yshy.question344;

/**
 * 左右两个指针，然后交换
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：44.8 MB, 在所有 Java 提交中击败了89.09%的用户
 *
 * @author ysy
 * @date 2021/6/8
 */
public class Solution01 {

	public void reverseString(char[] s) {
		if (s.length < 2) {
			return;
		}
		int left = 0;
		int right = s.length - 1;
		while(left < right){
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
		}
	}

}
