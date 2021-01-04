package pers.yshy.simple.question20;

/**
 * 20. 有效的括号
 *
 * @author ysy
 * @date 2021/1/4
 * @package pers.yshy.simple.question20
 **/
public class question20 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        boolean res;

        res = s.isValid("()");
        System.out.println(res);

        res = s.isValid("()[]{}");
        System.out.println(res);

        res = s.isValid("(]");
        System.out.println(res);

        res = s.isValid("([)]");
        System.out.println(res);

        res = s.isValid("{[]}");
        System.out.println(res);

        res = s.isValid("");
        System.out.println(res);

        res = s.isValid("(");
        System.out.println(res);

        res = s.isValid("(((");
        System.out.println(res);

        res = s.isValid(")))");
        System.out.println(res);
    }
}
