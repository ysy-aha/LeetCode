package pers.ysy.section0.question20;

import java.util.Stack;

/**
 * 使用栈，遇到一个左符号入栈，遇到一个右符号出栈，遇到不匹配的推出
 *
 * 执行用时：2 ms, 在所有 Java 提交中击败了60.93%的用户
 * 内存消耗：36.5 MB, 在所有 Java 提交中击败了60.61%的用户
 *
 * @author ysy
 * @date 2021/9/29
 */
public class Solution20 {
	public boolean isValid(String s) {
		if (s.length() % 2 != 0) {
			return false;
		}
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				Character c = stack.pop();
				char ch = s.charAt(i);
				if (ch == ')' && c != '(' || ch == '}' && c != '{' || ch == ']' && c != '[') {
					return false;
				}
			}
		}
		return stack.isEmpty() ? true : false;
	}
}
