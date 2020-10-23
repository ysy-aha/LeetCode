package pers.ysy.section1000.question1089;

/**
 * 1089. 复写零
 * 给你一个长度固定的整数数组 arr，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。
 * 注意：请不要在超过该数组长度的位置写入元素。
 * 要求：请对输入的数组 就地 进行上述修改，不要从函数返回任何东西。
 *
 * 示例 1：
 *   输入：[1,0,2,3,0,4,5,0]
 *   输出：null
 *   解释：调用函数后，输入的数组将被修改为：[1,0,0,2,3,0,0,4]
 * 示例 2：
 *   输入：[1,2,3]
 *   输出：null
 *   解释：调用函数后，输入的数组将被修改为：[1,2,3]
 *
 *  提示：
 *   1 <= arr.length <= 10000
 *   0 <= arr[i] <= 9
 *
 * @Author ysy
 * @Date 2020/10/22
 **/
public class Question1089 {
    public static void main(String[] args) {
        Solution02 s = new Solution02();

        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        s.duplicateZeros(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();

        arr = new int[]{1, 2, 3};
        s.duplicateZeros(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();

        arr = new int[]{1, 0, 3};
        s.duplicateZeros(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();

        arr = new int[]{0, 0};
        s.duplicateZeros(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();

        arr = new int[]{1, 0};
        s.duplicateZeros(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();

        arr = new int[]{0};
        s.duplicateZeros(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();

        arr = new int[]{1};
        s.duplicateZeros(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();

        arr = new int[]{9,9,9,4,8,0,0,3,7,2,0,0,0,0,9,1,0,0,1,1,0,5,6,3,1,6,0,0,2,3,4,7,0,3,9,3,6,5,8,9,1,1,3,2,0,0,7,3,3,0,5,7,0,8,1,9,6,3,0,8,8,8,8,0,0,5,0,0,0,3,7,7,7,7,5,1,0,0,8,0,0};
        s.duplicateZeros(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
