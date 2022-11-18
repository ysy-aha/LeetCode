package pers.yshy.easy.q000119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 杨辉三角 II
 *
 * @author ysy
 * @since 2022/11/18
 */
public class Q000119 {

    public static void main(String[] args) {
        int rowIndex;
        List<Integer> resList;

        rowIndex = 3;
        resList = getRow(rowIndex);
        System.out.println(Arrays.toString(resList.toArray()));

        rowIndex = 0;
        resList = getRow(rowIndex);
        System.out.println(Arrays.toString(resList.toArray()));

        rowIndex = 1;
        resList = getRow(rowIndex);
        System.out.println(Arrays.toString(resList.toArray()));
    }

    /**
     * 观察规律：
     *  - 每一行第一和最后都是1
     *  - 第三行开始，除第一和最后，每个值都是上一行当前位和上一位之和
     * 所以：
     *  - 嵌套循环，外层是高度，没加一层高度，列表最后加个1
     *  - 内层倒循环，从i-1开始，1结束，每一个值都是上一层的当前位加上上一位
     *  - 倒叙保证上一层的上一位不会被覆盖
     *
     * 时间：1 ms，击败：77.11%
     * 内存：39.1 MB，击败：63.54%
     *
     * @param rowIndex
     * @return
     */
    private static List<Integer> getRow(int rowIndex) {
        List<Integer> resLis = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            resLis.add(1);
            for (int j = i - 1; j > 0; j--) {
                resLis.set(j, resLis.get(j) + resLis.get(j - 1));
            }
        }
        return resLis;
    }
}
// 6: 1,5,10,10,5,1