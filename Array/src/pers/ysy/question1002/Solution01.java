package pers.ysy.question1002;

import java.util.ArrayList;
import java.util.List;

/**
 * 循环数组，从第一个元素开始读取字符，然后使用 indexof判断是否存在该字符，使用replace替换字符
 *
 * 执行用时：50 ms, 在所有 Java 提交中击败了5.40%的用户
 * 内存消耗：39.6 MB, 在所有 Java 提交中击败了6.95%的用户
 * @Author ysy
 * @Date 2020/10/15
 **/
public class Solution01 {
    public List<String> commonChars(String[] A) {
        // 取出数组中的第一个字符串
        String str = A[0];
        // 将其修改为字符数组
        char[] chars = str.toCharArray();
        // 返回结果集合
        List<String> list = new ArrayList<>();
        // 循环字符数组，然后在A数组中的其他元素中查找是否存在该字符，存在就替换掉第一个
        for (int i = 0; i < chars.length; i++) {
            // 不存在标记
            int flag = 0;
            for (int j = 1; j < A.length; j++) {
                if (A[j].indexOf(chars[i]) == -1){
                    flag = -1;
                    break;
                }else {
                    A[j] = A[j].replaceFirst(chars[i]+"", ".");
                }
            }
            if(flag == 0){
                list.add(chars[i]+"");
            }
        }
        return list;
    }
}
