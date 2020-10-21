package pers.ysy.section900.question922;

/**
 * 922. 按奇偶排序数组 II
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 * 你可以返回任何满足上述条件的数组作为答案。
 *
 * 示例：
 *   输入：[4,2,5,7]
 *   输出：[4,5,2,7]
 *   解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 *
 * 提示：
 *   2 <= A.length <= 20000
 *   A.length % 2 == 0
 *   0 <= A[i] <= 1000
 *
 * @Author ysy
 * @Date 2020/10/13
 **/
public class Question922 {

    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int[] arr = new int[]{4, 2, 5, 7};
        int[] arr1 = new int[]{4, 3};
        int[] res = s.sortArrayByParityII(arr1);
        for (int i : res) {
            System.out.print(i + "\t");
        }
    }

}
