package pers.yshy.question168;

/**
 * 168. Excel表列名称
 *
 * @author ysy
 * @date 2021/1/20
 * @package pers.yshy.question168
 **/
public class Question168 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        String res = "";

        res = s.convertToTitle(1);
        System.out.println(res);

        res = s.convertToTitle(26);
        System.out.println(res);

        res = s.convertToTitle(28);
        System.out.println(res);

        res = s.convertToTitle(52);
        System.out.println(res);

        res = s.convertToTitle(701);
        System.out.println(res);

        res = s.convertToTitle(17588);
        System.out.println(res);
    }
}
