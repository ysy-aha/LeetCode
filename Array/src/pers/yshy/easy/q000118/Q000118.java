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
     * 时间：0 ms，击败：100%
     * 内存：39.2 MB，击败：54.68%
     *
     * @param numRows
     * @return
     */
    private static List<List<Integer>> generate(int numRows) {
        int height = 1;
        List<List<Integer>> res = new ArrayList<>();

        while (height <= numRows) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < height; i++) {
                if (i == 0 || i == height - 1) {
                    list.add(1);
                } else {
                    List<Integer> temp = res.get(height - 2);
                    list.add(temp.get(i - 1) + temp.get(i));
                }
            }
            res.add(list);
            height++;
        }
        return res;
    }
}
