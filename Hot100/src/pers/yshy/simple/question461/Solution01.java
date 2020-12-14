package pers.yshy.simple.question461;

/**
 * 直接两个数异或计算，然后转化为二进制计算1的个数
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：35.3 MB, 在所有 Java 提交中击败了67.14%的用户
 *
 * @Author:ysy
 * @Date:2020/12/9
 * @Package:pers.yshy.simple.question461
 **/
public class Solution01 {

    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int count = 0;
        while (z != 0) {
            if (z % 2 == 1) {
                count++;
            }
            z = z / 2;
        }
        return count;
    }

}
