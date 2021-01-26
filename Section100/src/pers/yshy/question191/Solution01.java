package pers.yshy.question191;

/**
 * 将整数无符号往右移，每次移动之前判断最后一位是不是1，如果整数为0就退出循环
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了95.45%的用户
 * 内存消耗：35.2 MB, 在所有 Java 提交中击败了80.96%的用户
 *
 * @author ysy
 * @date 2021/1/22
 * @package pers.yshy.question191
 **/
public class Solution01 {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n = n >>> 1;
        }
        return count;
    }
}
