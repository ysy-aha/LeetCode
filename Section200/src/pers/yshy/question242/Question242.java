package pers.yshy.question242;

/**
 * 242. 有效的字母异位词
 * @author ysy
 * @date 2021/2/2
 * @package pers.yshy.question242
 **/
public class Question242 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        boolean res = false;

        res = s.isAnagram("anagram", "nagaram");
        System.out.println(res);

        res = s.isAnagram("rat", "car");
        System.out.println(res);
    }
}
