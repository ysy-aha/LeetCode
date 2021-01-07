package pers.yshy.medium.question338;

/**
 * 获取二进制字符串，然后循环获取 1的个数
 *
 * 执行用时：20 ms, 在所有 Java 提交中击败了5.13%的用户
 * 内存消耗：43.9 MB, 在所有 Java 提交中击败了5.06%的用户
 *
 * @author ysy
 * @date 2021/1/7
 * @package pers.yshy.medium.question338
 **/
public class Solution01 {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            String binary = Integer.toBinaryString(i);
            int count = 0;
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '1') {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
}
