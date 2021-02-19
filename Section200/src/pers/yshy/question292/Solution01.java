package pers.yshy.question292;

/**
 * 用递归是最好解决的，可以计算出所有的可能性，但是明显会超时
 * (抄的)
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：35.2 MB, 在所有 Java 提交中击败了61.84%的用户
 *
 * @author ysy
 * @date 2021/2/19
 * @package pers.yshy.question292
 **/
public class Solution01 {
    public boolean canWinNim(int n) {
        return (n % 4 != 0);
    }
}
