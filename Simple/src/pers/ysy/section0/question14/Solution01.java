package pers.ysy.section0.question14;

/**
 * 取第一个字符串作为循环根
 * 使用一个StringBuilder记录公共的字符
 * 嵌套循环，遇到第一个不是所有字符串通用的字符时返回
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了73.06%的用户
 * 内存消耗：36.5 MB, 在所有 Java 提交中击败了52.30%的用户
 *
 * @author ysy
 * @date 2021/9/29
 */
public class Solution01 {
	public String longestCommonPrefix(String[] strs) {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < strs[0].length(); i++) {
			for (int j = 1; j < strs.length; j++) {
				if(strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)){
					return res.toString();
				}
			}
			res.append(strs[0].charAt(i));
		}
		return res.toString();
	}
}
