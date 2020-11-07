package pers.ysy.section1200.question1260;

import java.util.ArrayList;
import java.util.List;

/**
 * 根据移动的规律，直接将移动后的值放在对应位置
 *
 * 执行用时：7 ms, 在所有 Java 提交中击败了64.63%的用户
 * 内存消耗：39.4 MB, 在所有 Java 提交中击败了64.56%的用户
 *
 * @Author ysy
 * @Date 2020/11/7
 **/
public class Solution02 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        int len = n * m;
        k = k % len;
        List<List<Integer>> res = new ArrayList<>();
        int count = 0;
        List<Integer> li = new ArrayList<>(m);
        while (count < len) {
            int row = (len - k + count) % len / m;
            int col = (len - k + count) % len % m;
            if (count > 0 && count % m == 0) {
                res.add(li);
                li = new ArrayList<>(m);
            }
            li.add(grid[row][col]);
            count++;
        }
        res.add(li);
        return res;
    }
}
