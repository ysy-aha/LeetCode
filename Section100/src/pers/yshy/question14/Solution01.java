package pers.yshy.question14;

/**
 * 嵌套循环
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了85.81%的用户
 * 内存消耗：36.4 MB, 在所有 Java 提交中击败了74.01%的用户
 *
 * @author ysy
 * @date 2021/1/11
 * @package pers.yshy.question14
 **/
public class Solution01 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return str.toString();
                }
            }
            str.append(strs[0].charAt(i));
        }
        return str.toString();
    }
}
