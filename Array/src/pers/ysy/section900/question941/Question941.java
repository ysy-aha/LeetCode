package pers.ysy.section900.question941;

/**
 * 941.有效的山脉数组
 * 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
 * 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：
 *   A.length >= 3
 *   在 0 < i < A.length - 1 条件下，存在 i 使得：
 *     A[0] < A[1] < ... A[i-1] < A[i]
 *     A[i] > A[i+1] > ... > A[A.length - 1]
 *
 * 示例 1：
 *   输入：[2,1]
 *   输出：false
 * 示例 2：
 *   输入：[3,5,5]
 *   输出：false
 * 示例 3：
 *   输入：[0,3,2,1]
 *   输出：true
 *
 * 提示：
 *   0 <= A.length <= 10000
 *   0 <= A[i] <= 10000
 * @Author ysy
 * @Date 2020/10/13
 **/
public class Question941 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int[] arr = new int[]{2,1};
        int[] arr1 = new int[]{1,2,1};
        int[] arr2 = new int[]{3,5,5};
        int[] arr3 = new int[]{0,3,2,1};
        int[] arr4 = new int[]{};
        int[] arr5 = new int[]{0,1,2,3,4,5,6,7,8,9};
        int[] arr6 = new int[]{9,8,7,6,5,4,3,2,1};
        int[] arr7 = new int[]{9,8,7,6,5,4,3,2,1,2};
        boolean res = s.validMountainArray(arr1);
        System.out.println("1"+res);
        res = s.validMountainArray(arr2);
        System.out.println("2"+res);
        res = s.validMountainArray(arr3);
        System.out.println("3"+res);
        res = s.validMountainArray(arr4);
        System.out.println("4"+res);
        res = s.validMountainArray(arr5);
        System.out.println("5"+res);
        res = s.validMountainArray(arr6);
        System.out.println("6"+res);
        res = s.validMountainArray(arr7);
        System.out.println("7"+res);

    }
}
