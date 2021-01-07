package pers.yshy.medium.question22;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯法
 * 字符串的长度为 2n，添加的第一个字符的可以为左或右，
 * 当字符串中左括号的长度小于n的时候就可以添加左括号
 * 当字符串中右括号的长度小于等于左括号的时候，就可以添加左括号
 *
 *  执行用时：2 ms, 在所有 Java 提交中击败了32.71%的用户
 *  内存消耗：38.8 MB, 在所有 Java 提交中击败了29.77%的用户
 *
 * @author ysy
 * @date 2021/1/7
 * @package pers.yshy.medium.question22
 **/
public class Solution01 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        move(new StringBuilder(), res, 0, 0, n);
        return res;
    }

    private void move(StringBuilder str, List<String> out, int left, int right, int n) {
        if (str.length() == 2 * n) {
            out.add(str.toString());
            return;
        }
        str = new StringBuilder(str);
        if (left < n) {
            if (left > right) {
                str.append(")");
                right++;
                move(str, out, left, right, n);
                str = new StringBuilder(str.substring(0, str.length() - 1));
                right--;
            }
            str.append("(");
            left++;
            move(str, out, left, right, n);
        } else {
            str.append(")");
            right++;
            move(str, out, left, right, n);
        }
    }
}
