package pers.yshy.question263;

/**
 * 263. 丑数
 * @author ysy
 * @date 2021/2/4
 * @package pers.yshy.question263
 **/
public class Question263 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        boolean res = false;

        res = s.isUgly(6);
        System.out.println(res);

        res = s.isUgly(8);
        System.out.println(res);

        res = s.isUgly(14);
        System.out.println(res);
    }
}
