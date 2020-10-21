package pers.ysy.section900.question905;

/**
 * 905. 按奇偶排序数组
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 * 你可以返回满足此条件的任何数组作为答案。
 *
 * 示例：
 *   输入：[3,1,2,4]
 *   输出：[2,4,3,1]
 *   输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 *
 * 提示：
 *   1 <= A.length <= 5000
 *   0 <= A[i] <= 5000
 *
 * @Author ysy
 * @Date 2020/10/12
 **/
public class Question905 {

    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int[] arr = new int[]{3};
        int[] res = s.sortArrayByParity(arr);
        for(int r : res){
            System.out.print(r+"\t");
        }
    }

}
