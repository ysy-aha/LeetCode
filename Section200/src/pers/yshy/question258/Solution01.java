package pers.yshy.question258;

/**
 * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：35.6 MB, 在所有 Java 提交中击败了55.51%的用户
 *
 * @author ysy
 * @date 2021/2/3
 * @package pers.yshy.question258
 **/
public class Solution01 {
    public int addDigits(int num) {
        while (num > 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
