package pers.ysy.section1100.question1184;

/**
 * 正着数和倒着数
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.1 MB, 在所有 Java 提交中击败了93.85%
 *
的用户
 * @Author ysy
 * @Date 2020/11/2
 **/
public class Solution01 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum1 = 0, sum2 = 0;
        // 起点一定小于终点
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }
        // 顺时针计数
        for (int i = start; i < destination; i++) {
            sum1 += distance[i];
        }
        // 逆时针计数
        while (start > 0 || destination < distance.length) {
            if (start > 0) {
                sum2 += distance[start-1];
                start--;
            }
            if (destination < distance.length) {
                sum2 += distance[destination];
                destination++;
            }
        }
        return sum1 > sum2 ? sum2 : sum1;
    }
}
