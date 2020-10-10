package pers.ysy.question832;

/**
 * 832. 翻转图像
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 * 示例 1:
 *  输入: [[1,1,0],[1,0,1],[0,0,0]]
 *  输出: [[1,0,0],[0,1,0],[1,1,1]]
 *  解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
 *      然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
 *
 * 示例 2:
 *  输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 *  输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 *  解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
 *       然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 *
 * 说明:
 *   1 <= A.length = A[0].length <= 20
 *   0 <= A[i][j] <= 1
 *
 * @Author ysy
 * @Date 2020/10/10
 **/
public class Question832 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int[][] arr = new int[][]{
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        int[][] arr1 = new int[][]{
                {1, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 0, 1, 0}
        };
        int[][] arr2 = new int[][]{
                {1}
        };
        int[][] arr3 = new int[][]{
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1}
        };
        int[][] res = s.flipAndInvertImage(arr3);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }
}