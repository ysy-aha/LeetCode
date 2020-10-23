package pers.ysy.section1000.question1089;

/**
 * 循环朝朝数组中的0，如果遇到0，从倒数第二个元素开始循环，将数组中的元素后移
 * 这里先返回数组，判断结果是否正确
 *
 * 执行用时：26 ms, 在所有 Java 提交中击败了5.19%的用户
 * 内存消耗：38.4 MB, 在所有 Java 提交中击败了96.61%的用户
 * @Author ysy
 * @Date 2020/10/22
 **/
public class Solution01 {
    public int[] duplicateZeros(int[] arr) {
        for (int i=0; i<arr.length-1; i++){
            if(arr[i] == 0){
                for(int j=arr.length-2; j>i; j--){
                    arr[j+1] = arr[j];
                }
                arr[i+1] = 0;
                i++;
            }
        }
        return arr;
    }
}
