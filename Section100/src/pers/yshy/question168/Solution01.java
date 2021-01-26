package pers.yshy.question168;

/**
 * 超过26往前进一位
 *
 * 执行用时：8 ms, 在所有 Java 提交中击败了11.31%的用户
 * 内存消耗：36.3 MB, 在所有 Java 提交中击败了7.65%的用户
 *
 * @author ysy
 * @date 2021/1/20
 * @package pers.yshy.question168
 **/
public class Solution01 {
    public String convertToTitle(int n) {
        char remainder;
        String s = "";
        while (n > 0) {
            n--;
            remainder = (char) (n % 26 + 'A');
            s = remainder + s;
            n = n / 26;
        }
        return s;
    }
}
/*
701

 */
