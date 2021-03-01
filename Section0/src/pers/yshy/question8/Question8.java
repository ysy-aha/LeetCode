package pers.yshy.question8;

/**
 * 8. 字符串转换整数 (atoi)
 * @author ysy
 * @date 2021/3/1
 * @package pers.yshy.question8
 **/
public class Question8 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int res = 0;

        res = s.myAtoi("42");
        System.out.println(res);

        res = s.myAtoi("   -42");
        System.out.println(res);

        res = s.myAtoi("4193 with words");
        System.out.println(res);

        res = s.myAtoi("words and 987");
        System.out.println(res);

        res = s.myAtoi("-91283472332");
        System.out.println(res);

        res = s.myAtoi("+123");
        System.out.println(res);

        res = s.myAtoi("+20000000000000000000");
        System.out.println(res);

        res = s.myAtoi("-20000000000000000000");
        System.out.println(res);

        res = s.myAtoi("  0000000000012345678");
        System.out.println(res);
    }
}
