package pers.ysy.section1100.question1122;

import java.util.Arrays;

/**
 * 创建一个新的数组，循环A数组，查找B数组中的元素，按顺序排列赋值给新数组，A数组值改为-1
 * 然后A数组排序，将非-1的值赋值给新数组
 *
 * 执行用时：5 ms, 在所有 Java 提交中击败了22.83%的用户
 * 内存消耗：38.4 MB, 在所有 Java 提交中击败了52.64%的用户
 * @Author ysy
 * @Date 2020/10/23
 **/
public class Solution01 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        int flag = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    arr3[flag] = arr1[j];
                    flag++;
                    arr1[j] = -1;
                }
            }
        }
        Arrays.sort(arr1);
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != -1){
                arr3[flag] = arr1[i];
                flag++;
            }
        }
        return arr3;
    }
}
