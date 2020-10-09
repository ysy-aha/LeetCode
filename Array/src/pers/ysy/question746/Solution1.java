package pers.ysy.question746;

/**
 *
 * @Author ysy
 * @Date 2020/9/27
 **/
public class Solution1 {

    /**
     * 递归算法，计算所有的路径
     * 超时
     * @param cost
     * @return
     */
    public int minCostClimbingStairs(int[] cost) {
        int res = recursion(-1, cost);
        return res;
    }

    private int recursion(int num, int[] cost) {
        if (num >= 0 && cost.length - num <= 2) {
            return cost[num];
        }
        int res1 = recursion(num + 1, cost);
        int res2 = recursion(num + 2, cost);
        int res = 0;
        if (num >= 0) {
            res = cost[num];
        }
        return res1 < res2 ? res1 + res : res2 + res;
    }
}
