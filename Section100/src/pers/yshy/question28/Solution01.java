package pers.yshy.question28;

/**
 * 循环 haystack，取needle第一个元素在haystack上面找，找到第一个就开始判断后面的时候相同
 *
 * 执行用时：3 ms, 在所有 Java 提交中击败了35.28%的用户
 *
 *
 * @author ysy
 * @date 2021/1/12
 * @package pers.yshy.question28
 **/
public class Solution01 {
    public int strStr(String haystack, String needle) {
        if(needle == null || needle.length() == 0 || haystack == needle){
            return 0;
        }
        for (int i = 0; i < haystack.length() - needle.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)){
                int j = 1;
                for(; j<needle.length(); j++){
                    if(haystack.charAt(i+j) != needle.charAt(j)){
                        break;
                    }
                }
                if(j == needle.length()){
                    return i;
                }
            }
        }
        return -1;
    }
}

