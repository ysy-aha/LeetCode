package pers.ysy.section700.question746;

/**
 *
 * @Author ysy
 * @Date 2020/9/28
 **/
public class Solution02 {

    /**
     * 错误
     * 计算后三个数(1、2、3)，判断 2 与 1+3 的大小
     * @param cost
     * @return
     */
    public int minCostClimbingStairs(int[] cost) {
        // 长度等于2可以直接通过比较获得结果
        if (cost.length == 2) {
            return cost[0] > cost[1] ? cost[1] : cost[0];
        }
        // 循环，设置当前位置，计算当前位置后的三位数
        int position = -1;
        int sum = 0;
        while (position < cost.length - 2) {
            if (position == cost.length - 3) {
                sum = sum + (cost[position + 1] > cost[position + 2] ? cost[position + 2] : cost[position + 1]);
                break;
            } else if (cost[position + 2] > cost[position + 1] + cost[position + 3]) {
                position++;
            } else {
                position += 2;
            }
            sum += cost[position];
        }
        return sum;
    }

}
