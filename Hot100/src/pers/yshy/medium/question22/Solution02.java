package pers.yshy.medium.question22;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯法 (Solution01的优化)
 *
 *  执行用时：1 ms, 在所有 Java 提交中击败了95.54%的用户
 *  内存消耗：38.6 MB, 在所有 Java 提交中击败了64.60%的用户
 *
 * @author ysy
 * @date 2021/1/7
 * @package pers.yshy.medium.question22
 **/
public class Solution02 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        move("", res, 0, 0, n);
        return res;
    }

    private void move(String str, List<String> out, int left, int right, int n) {
        if (str.length() == 2 * n) {
            out.add(str);
            return;
        }
        if (right > left) {
            return;
        }
        if (left < n) {
            move(str + "(", out, left + 1, right, n);
        }
        if (right < n) {
            move(str + ")", out, left, right + 1, n);
        }
    }
}
