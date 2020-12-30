package pers.yshy.simple.question70;

/**
 * 设置三个标记分别记录 次数(sum)，上个阶梯的次数(big)，上上个接替的次数(small)
 * 循环
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：35.2 MB, 在所有 Java 提交中击败了63.35%的用户
 *
 * @Author:ysy
 * @Date:2020/12/28
 * @Package:pers.yshy.simple.question70
 **/
public class Solution02 {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int sum = 3, small = 1, big = 2;
        for (int i=3; i<=n; i++){
            sum = small + big;
            small = big;
            big = sum;
        }
        return sum;
    }
}
