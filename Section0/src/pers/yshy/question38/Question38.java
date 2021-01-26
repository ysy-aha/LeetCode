package pers.yshy.question38;

/**
 * 38. 外观数列
 *
 * @author ysy
 * @date 2021/1/12
 * @package pers.yshy.question38
 **/
public class Question38 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        String res = "";

        res = s.countAndSay(1);
        System.out.println(res);

        res = s.countAndSay(2);
        System.out.println(res);

        res = s.countAndSay(3);
        System.out.println(res);

        res = s.countAndSay(4);
        System.out.println(res);

        res = s.countAndSay(5);
        System.out.println(res);

        res = s.countAndSay(30);
        System.out.println(res);
    }
}
