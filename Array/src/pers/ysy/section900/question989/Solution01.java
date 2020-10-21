package pers.ysy.section900.question989;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 将数组转换为整数，然后相加再将结果修改为数组
 *
 * 错误
 * 数组长度超过了基本数据类型的长度
 * @Author ysy
 * @Date 2020/10/14
 **/
public class Solution01 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        // 数组原整数
        int num = 0;
        // 循环将数组还原成整数
        for (int i = 0; i < A.length; i++) {
            num += A[i] * Math.pow(10, A.length - i -1);
        }
        // 原整数与k相加
        num += K;
        // 结果列表
        List<Integer> list = new ArrayList<>();
        // 将整数拆解为数组
        while(num > 0){
            list.add(num%10);
            num = num /10;
        }
        // 倒置集合
        Collections.reverse(list);
        return list;
    }
}
