package pers.yshy.question204;

/**
 * 204. 计数质数
 *
 * @author ysy
 * @date 2021/1/27
 * @package pers.yshy.question204
 **/
public class Question204 {
    public static void main(String[] args) {
        Solution01 s= new Solution01();
        int res = 0;

        res = s.countPrimes(10);
        System.out.println(res);

        res = s.countPrimes(3);
        System.out.println(res);

        res = s.countPrimes(0);
        System.out.println(res);

        res = s.countPrimes(5000000);
        System.out.println(res);
    }
}
