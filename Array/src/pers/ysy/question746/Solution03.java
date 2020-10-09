package pers.ysy.question746;

/**
 * (官方解法)动态规划
 * 倒叙比较大小相加
 * @Author ysy
 * @Date 2020/9/30
 **/
public class Solution03 {
    public int minCostClimbingStairs(int[] cost) {
        int n1 = 0, n2 = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            int n0 = cost[i] + Math.min(n1, n2);
            n2 = n1;
            n1 = n0;
        }
        return Math.min(n1, n2);
    }
}
