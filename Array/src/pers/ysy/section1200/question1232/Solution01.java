package pers.ysy.section1200.question1232;

/**
 * 第一个和第二个计算公式，然后循环判断其他的点是否在这个公式上
 * 注意与坐标轴平行的直线，注意小数
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.2 MB, 在所有 Java 提交中击败了87.33%的用户
 *
 * @Author ysy
 * @Date 2020/11/5
 **/
public class Solution01 {
    public boolean checkStraightLine(int[][] coordinates) {
        // x1 = ky1 + z / x2 - ky2 = z / x1 = ky1 + x2 - ky2 / x1 - x2 = k(y1-y2)
        int flag = 0;
        for (int i=1; i<coordinates.length; i++){
            if(coordinates[i][0] != coordinates[i-1][0]){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            return true;
        }
        flag = 0;
        for (int i=1; i<coordinates.length; i++){
            if(coordinates[i][1] != coordinates[i-1][1]){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            return true;
        }
        double k = (coordinates[0][1] -coordinates[1][1]) / (double)(coordinates[0][0] -coordinates[1][0]);
        double z = coordinates[0][1] - k * coordinates[0][0];
        for(int i=0; i<coordinates.length; i++){
            if(coordinates[i][1] != k * coordinates[i][0] + z){
                return false;
            }
        }
        return true;
    }
}
