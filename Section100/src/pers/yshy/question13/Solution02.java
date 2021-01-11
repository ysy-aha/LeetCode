package pers.yshy.question13;

/**
 * 执行用时：4 ms, 在所有 Java 提交中击败了99.93%的用户
 * 内存消耗：38.6 MB, 在所有 Java 提交中击败了57.30%的用户
 *
 * @author ysy
 * @date 2021/1/11
 * @package pers.yshy.question13
 **/
public class Solution02 {
    public int romanToInt(String s) {
        int num = 0, pos = 0, len = s.length();
        while (pos < s.length()) {
            char c1 = s.charAt(pos);
            if (c1 == 'I') {
                if (len - pos > 1 && s.charAt(pos + 1) == 'V') {
                    num += 4;
                } else if (len - pos > 1 && s.charAt(pos + 1) == 'X') {
                    num += 9;
                } else {
                    num++;
                    pos--;
                }
                pos++;
            } else if (c1 == 'V') {
                num += 5;
            } else if (c1 == 'X') {
                if (len - pos > 1 && s.charAt(pos + 1) == 'L') {
                    num += 40;
                } else if (len - pos > 1 && s.charAt(pos + 1) == 'C') {
                    num += 90;
                } else {
                    num += 10;
                    pos--;
                }
                pos++;
            } else if (c1 == 'L') {
                num += 50;
            } else if (c1 == 'C') {
                if (len - pos > 1 && s.charAt(pos + 1) == 'D') {
                    num += 400;
                } else if (len - pos > 1 && s.charAt(pos + 1) == 'M') {
                    num += 900;
                } else {
                    num += 100;
                    pos--;
                }
                pos++;
            } else if (c1 == 'D') {
                num += 500;
            } else if (c1 == 'M') {
                num += 1000;
            }
            pos++;
        }
        return num;
    }
}
