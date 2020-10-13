package pers.ysy.question914;

/**
 * 使用数组，计算每个数字的个数，然后取最大公约数
 *
 * 执行用时：3 ms, 在所有 Java 提交中击败了84.49%的用户
 * 内存消耗：39.1 MB, 在所有 Java 提交中击败了79.55%的用户
 * @Author ysy
 * @Date 2020/10/12
 **/
public class Solution01 {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for (int i : deck) {
            count[i]++;
        }
        int num = count[deck[0]];
        for(int i=0; i<count.length; i++){
            if(count[i] == 1){
                return false;
            }
            if(count[i] >=2 ){
                num = gcd(num, count[i]);
            }
            if(num == 1){
                return false;
            }
        }

        return true;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
