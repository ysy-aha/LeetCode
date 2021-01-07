package pers.yshy.medium.question338;

/**
 * 由实例可知
 * 0-1的结果为 [0,1]
 * 0-3的结果为 [0,1,1,2]，2-3的值是0-1的值加一，由此可推断出后面的值
 *
 * 执行用时：4 ms, 在所有 Java 提交中击败了14.02%的用户
 * 内存消耗：42.7 MB, 在所有 Java 提交中击败了36.22%的用户
 *
 * @author ysy
 * @date 2021/1/7
 * @package pers.yshy.medium.question338
 **/
public class Solution02 {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        int flag = 0;
        for (int i = 1; i <= num; i++) {
            int pow = (int)Math.pow(2, flag);
            if (i < pow) {
                res[i] = res[i-(pow/2)]+1;
            } else if (i == pow) {
                res[i] = 1;
                flag++;
            }
        }
        return res;
    }
}