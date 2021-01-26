package pers.yshy.question69;

/**
 * 69. x 的平方根
 * @author ysy
 * @date 2021/1/14
 * @package pers.yshy.question69
 **/
public class Question69 {
    public static void main(String[] args) {
        Solution02 s = new Solution02();
        int res = 0;

        res = s.mySqrt(0);
        System.out.println(res);

        res = s.mySqrt(1);
        System.out.println(res);

        res = s.mySqrt(2);
        System.out.println(res);

        res = s.mySqrt(4);
        System.out.println(res);

        res = s.mySqrt(8);
        System.out.println(res);

        res = s.mySqrt(16);
        System.out.println(res);
    }
}
