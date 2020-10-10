package pers.ysy.question766;

/**
 * 766. 托普利茨矩阵
 * 如果矩阵上每一条由左上到右下的对角线上的元素都相同，那么这个矩阵是 托普利茨矩阵 。
 * 给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True。
 *
 * 示例 1:
 *  输入:
 *  matrix = [
 *    [1,2,3,4],
 *    [5,1,2,3],
 *    [9,5,1,2]
 *  ]
 *  输出: True
 *  解释:
 *   在上述矩阵中, 其对角线为:
 *   "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]"。
 *   各条对角线上的所有元素均相同, 因此答案是True。
 *
 *  示例 2:
 *   输入:
 *   matrix = [
 *     [1,2],
 *     [2,2]
 *   ]
 *   输出: False
 *   解释:
 *   对角线"[1, 2]"上的元素不同。
 *
 *  说明:
 *    matrix 是一个包含整数的二维数组。
 *    matrix 的行数和列数均在 [1, 20]范围内。
 *    matrix[i][j] 包含的整数在 [0, 99]范围内。
 * @Author ysy
 * @Date 2020/10/10
 **/
public class Question766 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int[][] arr = new int[][]{
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };
        int[][] arr2 = {
                {1, 2},
                {2, 2}
        };
        int[][] arr3 = {{1}};
        int[][] arr4 = {
                {1,2,3},
                {3,1,2},
                {2,3,2}
        };
        boolean res = s.isToeplitzMatrix(arr4);
        System.out.println(res);
    }
}
