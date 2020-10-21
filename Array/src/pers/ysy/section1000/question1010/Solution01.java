package pers.ysy.section1000.question1010;

/**
 * 暴力破解：直接循环将前面和后面的元素相加 % 60
 *
 * 超时
 *
 * @Author ysy
 * @Date 2020/10/15
 **/
public class Solution01 {
    public int numPairsDivisibleBy60(int[] time) {
        // 符合条件的个数
        int count = 0;
        for (int i = 0; i < time.length - 1; i++) {
            for (int j = i + 1; j < time.length; j++) {
                if ((time[i] + time[j]) % 60 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
