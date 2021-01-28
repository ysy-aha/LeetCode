package pers.yshy.question205;

import java.util.ArrayList;
import java.util.List;

/**
 * 长度要一样
 * 字符的位置和频率要一样比如把 egg看作122，那么同构字符串 add也要是122，egg和dad就不是同构字符串了
 *
 * 创建两个list，依次循环s和t，取出一个字符，两个字符串会同时出现以下效果：
 *  1. 这个字符不存在，添加进list
 *  2. 这个字符存在，且在list中的位置都是相同的
 *
 * 执行用时：43 ms, 在所有 Java 提交中击败了5.15%的用户
 * 内存消耗：38.6 MB, 在所有 Java 提交中击败了19.23%的用户
 *
 * @author ysy
 * @date 2021/1/28
 * @package pers.yshy.question205
 **/
public class Solution01 {
    public boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        if (s != null && t == null || s == null && t != null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        List<Character> listS = new ArrayList<>();
        List<Character> listT = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int posS = listS.indexOf(s.charAt(i)),
                    posT = listT.indexOf(t.charAt(i));
            if (posS == -1 && posT == -1) {
                listS.add(s.charAt(i));
                listT.add(t.charAt(i));
                continue;
            } else if (posS == posT) {
                continue;
            }
            return false;
        }
        return true;
    }
}
