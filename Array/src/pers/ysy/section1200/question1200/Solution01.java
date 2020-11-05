package pers.ysy.section1200.question1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 排序，创建新数组，存储每一个值与前一个值得差，选出最小差
 *
 * 执行用时：19 ms, 在所有 Java 提交中击败了58.09%的用户
 * 内存消耗：50.2 MB, 在所有 Java 提交中击败了12.61%的用户
 * @Author ysy
 * @Date 2020/11/4
 **/
public class Solution01 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int[] newArr = new int[arr.length];
        int min = Integer.MAX_VALUE; // arr[1] - arr[0];
        for (int i=1; i<arr.length; i++){
            int diff = arr[i] - arr[i-1];
            newArr[i] = diff;
            min = min < diff ? min : diff;
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1; i<newArr.length; i++){
            if(newArr[i] == min){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i-1]);
                list.add(arr[i]);
                res.add(list);
            }
        }
        return res;
    }
}
