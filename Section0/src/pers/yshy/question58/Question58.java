package pers.yshy.question58;

/**
 *
 * @author ysy
 * @date 2021/1/13
 * @package pers.yshy.question58
 **/
public class Question58 {
    public static void main(String[] args) {
        Solution02 s = new Solution02();

        System.out.println(s.lengthOfLastWord("Hello World"));
        System.out.println(s.lengthOfLastWord("Hello World "));
        System.out.println(s.lengthOfLastWord("Hello  "));
        System.out.println(s.lengthOfLastWord(" World "));
        System.out.println(s.lengthOfLastWord(" asd bc s "));
        System.out.println(s.lengthOfLastWord(""));
        System.out.println(s.lengthOfLastWord("     "));
    }
}
