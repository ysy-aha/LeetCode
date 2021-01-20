package pers.yshy.question168;

/**
 * 超过26往前进一位
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：35.9 MB, 在所有 Java 提交中击败了14.21%的用户
 *
 * @author ysy
 * @date 2021/1/20
 * @package pers.yshy.question168
 **/
public class Solution02 {
    public String convertToTitle(int n) {
        StringBuilder s = new StringBuilder();
        while (n > 0) {
            n--;
            s.append((char) (n % 26 + 'A'));
            n = n / 26;
        }
        return s.reverse().toString();
    }
}
/*
701

 */
