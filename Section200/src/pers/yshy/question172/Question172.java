package pers.yshy.question172;

/**
 * 172. 阶乘后的零
 *
 * @author ysy
 * @date 2021/1/21
 * @package pers.yshy.question172
 **/
public class Question172 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        Solution02 s2 = new Solution02();
        int res = 0;

        res = s.trailingZeroes(100);
        System.out.println(res);
        res = s2.trailingZeroes(100);
        System.out.println(res);
    }
}
