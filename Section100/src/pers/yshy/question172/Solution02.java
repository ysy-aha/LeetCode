package pers.yshy.question172;

/**
 * 2*5=10
 * 4*5=2*2*5=20
 * 4*25=2*2*5*5=100
 * 想要计算有多少个0，只需要计算有多少个5就好了
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了94.45%的用户
 * 内存消耗：35.6 MB, 在所有 Java 提交中击败了11.56%的用户
 *
 * @author ysy
 * @date 2021/1/21
 * @package pers.yshy.question172
 **/
public class Solution02 {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            count += n / 5;
            n = n / 5;
        }
        return count;
    }
}
