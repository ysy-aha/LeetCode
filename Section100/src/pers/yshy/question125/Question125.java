package pers.yshy.question125;

/**
 * 125. 验证回文串
 * @author ysy
 * @date 2021/1/20
 * @package pers.yshy.question125
 **/
public class Question125 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        boolean res = false;

        res = s.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(res);

        res = s.isPalindrome("race a car");
        System.out.println(res);

        res = s.isPalindrome("a");
        System.out.println(res);
    }
}
