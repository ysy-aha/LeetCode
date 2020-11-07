package pers.ysy.section1200.question1260;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个list，将二维数组中的值按照顺序存进list，然后再按移动的算法，将值存入结果
 *
 * 执行用时：7 ms, 在所有 Java 提交中击败了64.63%的用户
 * 内存消耗：39.4 MB, 在所有 Java 提交中击败了55.02%的用户
 *
 * @Author ysy
 * @Date 2020/11/7
 **/
public class Solution01 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        List<Integer> list = new ArrayList<>(n * m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                list.add(grid[i][j]);
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        int count = 0;
        int len = list.size();
        List<Integer> li = new ArrayList<>(m);
        k = k % len;
        while (count < len) {
            if (count > 0 && count % m == 0) {
                res.add(li);
                li = new ArrayList<>(m);
            }
            li.add(list.get((len - k + count) % len));
            count++;
        }
        res.add(li);
        return res;
    }
}
