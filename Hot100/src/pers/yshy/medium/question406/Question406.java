package pers.yshy.medium.question406;

import java.util.Arrays;

/**
 * 406. 根据身高重建队列
 * @author ysy
 * @date 2021/1/11
 * @package pers.yshy.medium.question406
 **/
public class Question406 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int[][] res = null;

        res = s.reconstructQueue(new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}});
        for (int[] p : res) {
            System.out.print(Arrays.toString(p) + "\t");
        }
        System.out.println();

        res = s.reconstructQueue(new int[][]{{6, 0}, {5, 0}, {4, 0}, {3, 2}, {2, 2}, {1, 4}});
        for (int[] p : res) {
            System.out.print(Arrays.toString(p) + "\t");
        }
        System.out.println();

        res = s.reconstructQueue(new int[][]{{9, 0}, {7, 0}, {1, 9}, {3, 0}, {2, 7}, {5, 3}, {6, 0}, {3, 4}, {6, 2}, {5, 2}});
        for (int[] p : res) {
            System.out.print(Arrays.toString(p) + "\t");
        }
        System.out.println();
    }
}
