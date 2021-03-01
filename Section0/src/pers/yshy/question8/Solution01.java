package pers.yshy.question8;

/**
 * 遍历字符串
 *
 * 执行用时：3 ms, 在所有 Java 提交中击败了50.93%的用户
 * 内存消耗：38.5 MB, 在所有 Java 提交中击败了57.66%的用户
 *
 * @author ysy
 * @date 2021/3/1
 * @package pers.yshy.question8
 **/
public class Solution01 {
    public int myAtoi(String s) {
        boolean isMinus = false;
        boolean isHead = true;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ' && isHead) {
                continue;
            } else if (c != ' ' && isHead) {
                isHead = false;
                isMinus = c == '-';
                if(isMinus || c == '+'){
                    continue;
                }
            }
            if(c < '0' || c > '9'){
                break;
            }
            if(str.length() == 0 && c == '0'){
                continue;
            }
            str.append(c);
        }
        if(str.length() == 0){
            return 0;
        } else if(str.length() > 10){
            return isMinus ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        long l = isMinus ? - Long.parseLong(str.toString()) : Long.parseLong(str.toString());
        if(l < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        } else if(l > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        return (int) l;
    }
}
