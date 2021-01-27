package pers.yshy.question204;

/**
 * 先排除双数
 * 创建一个n大小的数组nums，从三开始计算，
 * 在小于n的情况下，
 *  nums[3*3]++, nums[3*5]++ ...
 *  nums[5*5]++, nums[5*7]++ ...
 *
 * 执行用时：21 ms, 在所有 Java 提交中击败了67.32%的用户
 * 内存消耗：42.8 MB, 在所有 Java 提交中击败了27.25%的用户
 *
 * @author ysy
 * @date 2021/1/27
 * @package pers.yshy.question204
 **/
public class Solution01 {
    public int countPrimes(int n) {
        int[] nums = new int[n + 1];
        int count = n > 2 ? 1 : 0, num = (int) Math.sqrt(n);
        for (int i = 3; i < n; i += 2) {
            if (nums[i] == 0) {
                count++;
            }
            int m = i;
            while (i <= num && m * i < n) {
                nums[i * m]++;
                m = m + 2;
            }
        }
        return count;
    }
}
