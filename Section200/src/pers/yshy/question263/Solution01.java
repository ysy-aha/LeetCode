package pers.yshy.question263;

/**
 * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：35.5 MB, 在所有 Java 提交中击败了37.07%的用户
 * @author ysy
 * @date 2021/2/4
 * @package pers.yshy.question263
 **/
public class Solution01 {
    public boolean isUgly(int num) {
        if(num < 1){
            return false;
        }
        while (num > 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if(num % 5 == 0){
                num /= 5;
            } else {
                return false;
            }
        }
        return true;
    }
}
