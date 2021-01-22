package pers.yshy.question190;

/**
 * 190. 颠倒二进制位
 *
 * @author ysy
 * @date 2021/1/22
 * @package pers.yshy.question190
 **/
public class Question190 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int res = 0;

        res = s.reverseBits(43261596);
        System.out.println(res);
    }
}
