package pers.yshy.easy.q000118;

import java.util.*;

/**
 * 杨辉三角
 *
 * @author ysy
 * @since 2022-11-14
 */
public class Q000118 {

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> generate;
        generate = generate(5);
        System.out.println(generate);

        generate = generate(1);
        System.out.println(generate);
    }

    /**
     * 时间 1 ms，击败 85.66%
     * 内存 40 MB，击败53.96%
     *
     * @param numRows
     * @return
     */
    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    temp.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(temp);
        }
        return res;
    }
}
