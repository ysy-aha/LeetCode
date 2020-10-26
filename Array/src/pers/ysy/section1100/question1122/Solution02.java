package pers.ysy.section1100.question1122;

/**
 * 创建一个大小为1001的数组C，保存A数组中的所有值的频率
 * 循环B数组，找到对应的元素的频率，将其根据频率赋值给A数组，C数组对应元素归零
 * 循环C数组，将非零的下标按频率添加到A数组
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.6 MB, 在所有 Java 提交中击败了47.65%的用户
 * @Author ysy
 * @Date 2020/10/23
 **/
public class Solution02 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[1001];
        for (int i : arr1) {
            arr3[i]++;
        }
        int flag = 0;
        for (int i : arr2) {
            while (arr3[i] != 0) {
                arr1[flag] = i;
                arr3[i]--;
                flag++;
            }
        }
        for(int i=0; i<1001; i++){
            while (arr3[i]!=0){
                arr1[flag] = i;
                arr3[i]--;
                flag++;
            }
        }
        return arr1;
    }
}
