package pers.yshy.question205;

/**
 * 205. 同构字符串
 *
 * @author ysy
 * @date 2021/1/28
 * @package pers.yshy.question205
 **/
public class Question205 {
    public static void main(String[] args) {
        Solution03 s = new Solution03();
        boolean res = false;

        res = s.isIsomorphic("egg", "add");
        System.out.println(res);

        res = s.isIsomorphic("geg", "add");
        System.out.println(res);

        res = s.isIsomorphic("foo", "bar");
        System.out.println(res);

        res = s.isIsomorphic("title", "paper");
        System.out.println(res);
    }
}
