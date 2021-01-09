package pers.yshy.medium.question48;

/**
 * 48. 旋转图像
 * @author ysy
 * @date 2021/1/9
 * @package pers.yshy.medium.question48
 **/
public class Question48 {
    public static void main(String[] args) {
        Solution02 s = new Solution02();
        int[][] matrix;

        matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        out(matrix);
        System.out.println();
        s.rotate(matrix);
        out(matrix);

        matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        out(matrix);
        System.out.println();
        s.rotate(matrix);
        out(matrix);

    }

    private static void out(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
