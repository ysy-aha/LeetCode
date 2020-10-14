package pers.ysy.question977;

/**
 * 977. 有序数组的平方
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 *
 * 示例 1：
 *   输入：[-4,-1,0,3,10]
 *   输出：[0,1,9,16,100]
 * 示例 2：
 *   输入：[-7,-3,2,3,11]
 *   输出：[4,9,9,49,121]
 * 提示：
 *   1 <= A.length <= 10000
 *   -10000 <= A[i] <= 10000
 *   A 已按非递减顺序排序。
 * @Author ysy
 * @Date 2020/10/14
 **/
public class Question977 {
    public static void main(String[] args) {
        Solution02 s = new Solution02();
        int[] arr = new int[]{-4, -1, 0, 3, 10};
        int[] arr1 = new int[]{-7,-3,2,3,11};
        int[] arr2 = new int[]{-1};
        int[] arr3 = new int[]{1,2,3,4,5,6};
        int[] arr4 = new int[]{-6,-5,-4,-3,-2,-1};
        int[] arr5 = new int[]{-7, 1,2,3,4,5,6};
        int[] res = s.sortedSquares(arr5);
        for (int i : res) {
            System.out.print(i + "\t");
        }
    }
}
