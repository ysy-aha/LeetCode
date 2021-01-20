package pers.yshy.question171;

/**
 * 执行用时：2 ms, 在所有 Java 提交中击败了31.50%的用户
 * 内存消耗：38.6 MB, 在所有 Java 提交中击败了13.41%的用户
 *
 * @author ysy
 * @date 2021/1/20
 * @package pers.yshy.question171
 **/
public class Solution01 {
    public int titleToNumber(String s) {
        int pos = s.length()-1, sum = 0, power = 0;
        while(pos > -1){
            int n = (s.charAt(pos) - 'A' + 1) * (int) (Math.pow(26, power));
            sum += n;
            power++;
            pos--;
        }
        return sum;
    }
}
