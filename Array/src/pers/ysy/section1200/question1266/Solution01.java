package pers.ysy.section1200.question1266;

/**
 * 以第一个和第二个为例，第一个坐标大的值(x与y比较)，增加到第二个坐标小的值，然后计算另一个值得差
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了97.69%的用户
 * 内存消耗：38.4 MB, 在所有 Java 提交中击败了61.67%的用户
 *
 * @Author ysy
 * @Date 2020/11/9
 **/
public class Solution01 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int len = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int def_x = Math.abs(points[i][0] - points[i + 1][0]);
            int def_y = Math.abs(points[i][1] - points[i + 1][1]);
            len += def_x > def_y ? def_x : def_y;
        }
        return len;
    }
}
