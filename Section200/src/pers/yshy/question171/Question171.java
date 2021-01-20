package pers.yshy.question171;

/**
 * 171. Excel表列序号
 *
 * @author ysy
 * @date 2021/1/20
 * @package pers.yshy.question171
 **/
public class Question171 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int res = 0;

        res = s.titleToNumber("A");
        System.out.println(res);

        res = s.titleToNumber("AB");
        System.out.println(res);

        res = s.titleToNumber("ZY");
        System.out.println(res);

        res = s.titleToNumber("YZL");
        System.out.println(res);
    }
}
