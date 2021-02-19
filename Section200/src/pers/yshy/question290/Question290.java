package pers.yshy.question290;

/**
 * 290. 单词规律
 * @author ysy
 * @date 2021/2/19
 * @package pers.yshy.question290
 **/
public class Question290 {
    public static void main(String[] args) {
        Solution02 s = new Solution02();
        boolean res = false;

        res = s.wordPattern("abba", "dog cat cat dog");
        System.out.println(res);

        res = s.wordPattern("abba", "dog cat cat fish");
        System.out.println(res);

        res = s.wordPattern("aaaa", "dog cat cat dog");
        System.out.println(res);

        res = s.wordPattern("abba", "dog dog dog dog");
        System.out.println(res);

        res = s.wordPattern("abbz", "dog cat cat dog");
        System.out.println(res);

        res = s.wordPattern("abbz", "dog cat cat fish");
        System.out.println(res);

        res = s.wordPattern("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd", "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t");
        System.out.println(res);
    }
}
/*

"ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd"
"s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t"
 */