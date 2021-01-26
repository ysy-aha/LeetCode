package pers.yshy.question13;

/**
 * 递归 分别盘算所有的可能性，然后将字符串剪切之后递归
 *
 * 执行用时：6 ms, 在所有 Java 提交中击败了51.49%的用户
 * 内存消耗：39.1 MB, 在所有 Java 提交中击败了19.43%的用户
 *
 * @author ysy
 * @date 2021/1/11
 * @package pers.yshy.question13
 **/
public class Solution01 {
    public int romanToInt(String s) {
        if (s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {
            return getNum(s);
        }
        int num = 0;
        if (s.charAt(0) == 'I') {
            if (s.charAt(1) == 'V') {
                num = 4;
                s = s.substring(2);
            } else if (s.charAt(1) == 'X') {
                num = 9;
                s = s.substring(2);
            } else {
                num = 1;
                s = s.substring(1);
            }
        } else if (s.charAt(0) == 'V') {
            num = 5;
            s = s.substring(1);
        } else if (s.charAt(0) == 'X') {
            if (s.charAt(1) == 'L') {
                num = 40;
                s = s.substring(2);
            } else if (s.charAt(1) == 'C') {
                num = 90;
                s = s.substring(2);
            } else {
                num = 10;
                s = s.substring(1);
            }
        } else if (s.charAt(0) == 'L') {
            num = 50;
            s = s.substring(1);
        } else if (s.charAt(0) == 'C') {
            if (s.charAt(1) == 'D') {
                num = 400;
                s = s.substring(2);
            } else if (s.charAt(1) == 'M') {
                num = 900;
                s = s.substring(2);
            } else {
                num = 100;
                s = s.substring(1);
            }
        } else if (s.charAt(0) == 'D') {
            num = 500;
            s = s.substring(1);
        } else if (s.charAt(0) == 'M') {
            num = 1000;
            s = s.substring(1);
        }
        num += romanToInt(s);
        return num;
    }

    private int getNum(String s) {
        int num = 0;
        switch (s) {
            case "I":
                num = 1;
                break;
            case "V":
                num = 5;
                break;
            case "X":
                num = 10;
                break;
            case "L":
                num = 50;
                break;
            case "C":
                num = 100;
                break;
            case "D":
                num = 500;
                break;
            case "M":
                num = 1000;
        }
        return num;
    }
}
