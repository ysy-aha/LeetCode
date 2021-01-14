package pers.yshy.question69;

/**
 * (超时)
 * 循环，从零开始，只要某个数的平方大于x，那就返回上一个数
 * @author ysy
 * @date 2021/1/14
 * @package pers.yshy.question69
 **/
public class Solution01 {

    public int mySqrt(int x) {
        for (int i = 1; i <= x; i++) {
            if (i * i == x) {
                return i;
            } else if (i * i > x) {
                return i - 1;
            }
        }
        return 0;
    }

}
