package pers.yshy.question231;

/**
 * 231. 2的幂
 *
 * @author ysy
 * @date 2021/1/29
 * @package pers.yshy.question231
 **/
public class Question231 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        boolean res = false;

        res = s.isPowerOfTwo(128);
        System.out.println(res);

        res = s.isPowerOfTwo(127);
        System.out.println(res);
    }
}
