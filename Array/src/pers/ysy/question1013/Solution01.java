package pers.ysy.question1013;

/**
 * 创建一个相同大小的数组B，B中的每个元素都是A中相同位置的前面的元素的和
 * 遍历B，查找大小等于B最后一个元素的 1/3 和 2/3 的值
 *
 * 执行用时：2 ms, 在所有 Java 提交中击败了40.18%的用户
 * 内存消耗：45.8 MB, 在所有 Java 提交中击败了99.16%的用户
 * @Author ysy
 * @Date 2020/10/16
 **/
public class Solution01 {
    public boolean canThreePartsEqualSum(int[] A) {
        // 数组长度
        int len = A.length;
        // 创建元素值为A相同位置前面元素和的数组B
        int[] B = new int[len];
        // 初始化B数组第一个值为A数组的第一个值
        B[0] = A[0];
        // 遍历A数组，为B数组赋值
        for (int i = 1; i < len; i++) {
            B[i] = B[i - 1] + A[i];
        }
        // 标记是否找到了 B[B.legth-1] 的值的 2/3值
        int flag = 0;
        // 倒历B数组，分别查找 B[B.legth-1] 的值的 2/3值 和 1/3值的元素
        for (int i = len - 2; i >= 0; i--) {
            // 如果最后一个元素为0，则需要另外两个值也为0
            if (B[len - 1] == 0) {
                if (flag == 0 && B[i] == 0) {
                    flag = 1;
                } else if(flag == 1 && B[i] == 0) {
                    return true;
                }
            } else {
                if (flag == 0 && B[i] / 2 * 3 == B[len - 1]) {
                    flag = 1;
                } else if (flag == 1 && B[i] * 3 == B[len - 1]) {
                    return true;
                }
            }
        }
        return false;
    }
}
