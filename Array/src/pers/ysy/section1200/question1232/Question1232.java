package pers.ysy.section1200.question1232;

/**
 * 1232. 缀点成线
 * 在一个 XY 坐标系中有一些点，我们用数组 coordinates 来分别记录它们的坐标，
 *   其中 coordinates[i] = [x, y] 表示横坐标为 x、纵坐标为 y 的点。
 * 请你来判断，这些点是否在该坐标系中属于同一条直线上，是则返回 true，否则请返回 false。
 *
 * 示例 1：
 *   输入：coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
 *   输出：true
 * 示例 2：
 *   输入：coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
 *   输出：false
 *
 * 提示：
 *   2 <= coordinates.length <= 1000
 *   coordinates[i].length == 2
 *   -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
 *   coordinates 中不含重复的点
 *
 * @Author ysy
 * @Date 2020/11/5
 **/
public class Question1232 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int[][] arr = new int[][]{{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        boolean res = s.checkStraightLine(arr);
        System.out.println(res);

        arr = new int[][]{{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        res = s.checkStraightLine(arr);
        System.out.println(res);

        arr = new int[][]{{1,0},{2,0},{3,0},{4,0},{5,0},{7,0}};
        res = s.checkStraightLine(arr);
        System.out.println(res);

        arr = new int[][]{{0,1},{0,2},{0,4},{0,5},{0,6},{0,7}};
        res = s.checkStraightLine(arr);
        System.out.println(res);

        arr = new int[][]{{0,1},{1,3},{-4,-7},{5,11}};
        res = s.checkStraightLine(arr);
        System.out.println(res);

        arr = new int[][]{{2,1},{4,2},{6,3}};
        res = s.checkStraightLine(arr);
        System.out.println(res);

    }
}
