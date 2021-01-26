package pers.yshy.question14;

/**
 * 14. 最长公共前缀
 *
 * @author ysy
 * @date 2021/1/11
 * @package pers.yshy.question14
 **/
public class Question14 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();

        System.out.println(s.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(s.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(s.longestCommonPrefix(new String[]{}));
        System.out.println(s.longestCommonPrefix(new String[]{"ab", "a"}));
        System.out.println(s.longestCommonPrefix(new String[]{"a", "an"}));
        System.out.println(s.longestCommonPrefix(new String[]{"", "an"}));
        System.out.println(s.longestCommonPrefix(new String[]{"asd", ""}));
    }
}
