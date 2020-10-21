package pers.ysy.section600.question661;

/**
 * 依次计算没一个点的平均灰度，遇到越界就用异常处理跳过
 * 执行用时：357 ms, 在所有 Java 提交中击败了5.89%的用户
 * 内存消耗：41.1 MB, 在所有 Java 提交中击败了71.43%的用户
 * @Author ysy
 * @Date 2020/7/2
 **/
public class Solution01 {
    public int[][] imageSmoother(int[][] M) {
        // 数组的列和行
        int col = M.length;
        int row = M[0].length;
        if(col == 1 && row == 1){
            return M;
        }
        int[][] N = new int[col][row];
        for(int i=0; i<M.length; i++){
            for(int j=0; j<M[i].length; j++){
                int sum = 0;
                int count = 0;
                for(int n=i-1; n<=i+1; n++){
                    for(int m=j-1; m<=j+1; m++){
                        try{
                            sum+=M[n][m];
                            count++;
                        }catch (ArrayIndexOutOfBoundsException e){
                            continue;
                        }
                    }
                }
                N[i][j] = sum/count;
            }
        }
        return N;
    }
}
