package pers.yshy.question28;

/**
 * 28. 实现 strStr()
 * @author ysy
 * @date 2021/1/12
 * @package pers.yshy.question28
 **/
public class Question28 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int res = 0;

        res = s.strStr("", "");
        System.out.println(res);

        res = s.strStr("", "abc");
        System.out.println(res);

        res = s.strStr("hello", "ll");
        System.out.println(res);

        res = s.strStr("hello", "abc");
        System.out.println(res);

        res = s.strStr("aabaa", "aa");
        System.out.println(res);
    }
}
