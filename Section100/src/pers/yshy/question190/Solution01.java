package pers.yshy.question190;

/**
 * (抄的)
 * 先将 n 的最后一位移到新数字的 31位，n无符号右移一位，
 * 再将 n 的最后一位移到新数字的 30位，n无符号右移一位，
 * ...
 * 最后将 n反转
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.2 MB, 在所有 Java 提交中击败了43.43%的用户
 *
 * @author ysy
 * @date 2021/1/22
 * @package pers.yshy.question190
 **/
public class Solution01 {
    public int reverseBits(int n) {
        int ans = 0;
        for (int bitsSize = 31; n != 0; n = n >>> 1, bitsSize--) {
            ans += (n & 1) << bitsSize;
        }
        return ans;
    }
}

