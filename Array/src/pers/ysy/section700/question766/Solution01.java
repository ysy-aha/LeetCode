package pers.ysy.section700.question766;

/**
 * 一个 M*N 的矩阵，存在 M+N-1 条对角线
 * 起始坐标为 [M-1, 0], [M-2, 0], ..., [0,0], ..., [0, N-2], [0, N-1]
 * 第二个点为为第一个点的 x、y 坐标加一，直到 x,y 坐标某一个值为边界(x=M-1 或者 y=N-1)
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.8 MB, 在所有 Java 提交中击败了74.58%的用户
 * @Author ysy
 * @Date 2020/10/10
 **/
public class Solution01 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int x = matrix.length-1, y = 0;
        while(x>=0 && y< matrix[0].length){
            for(int i=x,j=y; i<=matrix.length-1 && j<=matrix[0].length-1; i++, j++){
                if(matrix[x][y] != matrix[i][j]){
                    return false;
                }
            }
            if(y==0 && x>0){
                x--;
            }else if(x==0){
                y++;
            }
        }
        return true;
    }
}
