package pers.ysy.section800.question830;

import java.util.ArrayList;
import java.util.List;

/**
 * 设置位置记录 pos 和 长度计算 len
 * 当 pos 后第二位值与他相同时，长度len从2开始计算
 * 如果pos后一位值与他不相同，pos加一
 *
 * 执行用时：2 ms, 在所有 Java 提交中击败了60.10%的用户
 * 内存消耗：39 MB, 在所有 Java 提交中击败了53.61%的用户
 * @Author ysy
 * @Date 2020/10/10
 **/
public class Solution01 {
    public List<List<Integer>> largeGroupPositions(String s) {
        List res = new ArrayList<List<Integer>>();
        char[] charArr = s.toCharArray();
        int pos = 0, len = 2;
        while (pos < charArr.length) {
            for (int i = 0; i < charArr.length - pos; i++) {
                if (charArr[pos + i] != charArr[pos]) {
                    break;
                }
                if (i >= 2) {
                    len++;
                }
            }
            if (len > 2) {
                List list = new ArrayList<Integer>(2);
                list.add(pos);
                list.add(len + pos - 1);
                res.add(list);
                pos = pos + len - 1;
                len = 2;
            }
            pos++;
        }
        return res;
    }
}
