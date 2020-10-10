package pers.ysy.question867;

/**
 * 相对 n*m 的矩阵，创建 m*n 的矩阵
 * 然后将 x，y 轴互换
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了47.24%的用户
 * 内存消耗：39.8 MB, 在所有 Java 提交中击败了48.33%的用户
 * @Author ysy
 * @Date 2020/10/10
 **/
public class Solution01 {

    public int[][] transpose(int[][] A) {
        int[][] res = new int[A[0].length][A.length];
        for(int x=0; x<A.length; x++){
            for (int y=0; y<A[x].length; y++){
                res[y][x] = A[x][y];
            }
        }
        return res;
    }

}
