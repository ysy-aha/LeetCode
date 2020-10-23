package pers.ysy.section1000.question1089;

/**
 * 答案的思路：
 *  设置标记flag，初始为数组最后一位，循环，数组中有一个0存在就将标记往前移一位，知道标记与循环标记位置相同
 *  倒序循环，将标记flag位置的非零元素移到后面，flag--，直到倒序标记与flag相等
 *
 *  错误
 * @Author ysy
 * @Date 2020/10/22
 **/
public class Solution02 {
    public int[] duplicateZeros(int[] arr) {
        int flag = arr.length - 1;
        for (int i = 0; i < flag; i++) {
            if (arr[i] == 0) {
                flag--;
            }
        }
        for (int i = arr.length - 1; i > flag; i--) {
            arr[i] = arr[flag];
            if (arr[flag] == 0) {
                i--;
                arr[i] = 0;
            }
            flag--;
        }
        return arr;
    }
}
