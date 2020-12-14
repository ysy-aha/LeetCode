package pers.ysy.section200.question204;

/**
 * 循环穷举法(超时)
 *
 * @Author:ysy
 * @Date:2020/12/3
 * @Package:pers.ysy.section200.question204
 **/
public class Solution01 {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(isPrimeNumber(i)){
                count++;
            }
        }
        return count;
    }

    private boolean isPrimeNumber(int n) {
        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }

}
