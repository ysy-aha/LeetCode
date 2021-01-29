package pers.yshy.question231;

/**
 * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：35.4 MB, 在所有 Java 提交中击败了74.17%的用户
 *
 * @author ysy
 * @date 2021/1/29
 * @package pers.yshy.question231
 **/
public class Solution01 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1) {
            if (n % 2 == 1) {
                return false;
            }
            n /= 2;
        }
        return true;
    }
}
