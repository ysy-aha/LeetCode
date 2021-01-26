package pers.yshy.question69;

/**
 * 抄的，直接计算公式
 *
 * 开平方是指 x^(1/2) = e ^(0.5 * lnx)
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：35.6 MB, 在所有 Java 提交中击败了38.89%的用户
 *
 * @author ysy
 * @date 2021/1/14
 * @package pers.yshy.question69
 **/
public class Solution02 {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int ans = (int) Math.exp(0.5 * Math.log(x));
        return (long) (ans + 1) * (ans + 1) <= x ? ans + 1 : ans;
    }
}
