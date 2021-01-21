package pers.yshy.question172;

import java.math.BigInteger;

/**
 * 想要判断末尾有多少个0主要依靠最后一位非零数字的乘积(这个想法是错误的)
 *
 * 官方答案1：计算阶乘
 * 使用BigInteger对象
 * (超时)
 *
 * @author ysy
 * @date 2021/1/21
 * @package pers.yshy.question172
 **/
public class Solution01 {
    public int trailingZeroes(int n) {
        BigInteger product = BigInteger.ONE;
        for(int i=2; i<=n; i++){
            product = product.multiply(BigInteger.valueOf(i));
        }
        int count = 0;
        while (product.mod(BigInteger.TEN).equals(BigInteger.ZERO)){
            product = product.divide(BigInteger.TEN);
            count++;
        }
        return count;
    }
}
