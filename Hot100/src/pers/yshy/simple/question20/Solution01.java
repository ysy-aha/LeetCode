package pers.yshy.simple.question20;


import java.util.Stack;

/**
 * 创建一个栈，循环字符串，将左括号存入栈中，遇到右括号就取一个出来，对的上就继续往后走，对不上返回false
 *
 * 执行用时：2 ms, 在所有 Java 提交中击败了73.67%的用户
 * 内存消耗：36.5 MB, 在所有 Java 提交中击败了77.12%的用户
 *
 * @author ysy
 * @date 2021/1/4
 * @package pers.yshy.simple.question20
 **/
public class Solution01 {
    public boolean isValid(String s) {
        if(s == null || s.length() < 2){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        String str = "([{";
        for (int i = 0; i < s.length(); i++) {
            if (str.indexOf(s.charAt(i)) != -1) {
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                char c = stack.pop();
                switch (s.charAt(i)) {
                    case ')': {
                        if (c != '(') {
                            return false;
                        }
                        break;
                    }
                    case ']': {
                        if (c != '[') {
                            return false;
                        }
                        break;
                    }
                    case '}': {
                        if (c != '{') {
                            return false;
                        }
                        break;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
