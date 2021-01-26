package pers.yshy.question13;

/**
 * 13. 罗马数字转整数
 *
 * @author ysy
 * @date 2021/1/11
 * @package pers.yshy.question13
 **/
public class Question13 {
    public static void main(String[] args) {
        Solution02 s = new Solution02();
        int res = 0;

        res = s.romanToInt( "III");
        System.out.println(res);

        res = s.romanToInt( "IV");
        System.out.println(res);

        res = s.romanToInt( "VIII");
        System.out.println(res);

        res = s.romanToInt( "IX");
        System.out.println(res);

        res = s.romanToInt( "LVIII");
        System.out.println(res);

        res = s.romanToInt( "MCMXCIV");
        System.out.println(res);

        res = s.romanToInt( "MDCCCLXXXIV");
        System.out.println(res);
    }
}
