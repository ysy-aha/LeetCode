package pers.yshy.medium.question22;

import java.util.List;

/**
 *  22. 括号生成
 *
 * @author ysy
 * @date 2021/1/7
 * @package pers.yshy.medium.question22
 **/
public class Question22 {
    public static void main(String[] args) {
        Solution02 s = new Solution02();
        List<String> res = null;

        res = s.generateParenthesis(3);
        res.stream().forEach(item -> {
            System.out.println(item);
        });
        System.out.println("\n");

        res = s.generateParenthesis(4);
        res.stream().forEach(item -> {
            System.out.println(item);
        });
        System.out.println("\n");

        res = s.generateParenthesis(0);
        res.stream().forEach(item -> {
            System.out.println(item);
        });
        System.out.println("\n");
    }
}
