package pers.yshy.medium.question406;

import java.util.Arrays;

/**
 * 先排队再插队(抄的)
 *
 * 执行用时：20 ms, 在所有 Java 提交中击败了20.45%的用户
 * 内存消耗：39.2 MB, 在所有 Java 提交中击败了91.66%的用户
 *
 * @author ysy
 * @date 2021/1/11
 * @package pers.yshy.medium.question406
 **/
public class Solution01 {
    public int[][] reconstructQueue(int[][] people) {
        // 将数组按第一个元素的值从小到大排列
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });
        print(people);
        int len = people.length;
        int[][] newPeople = new int[len][];
        for (int[] p : people) {
            int count = p[1] + 1;
            for (int j = 0; j < len; j++) {
               if(newPeople[j] == null){
                   count--;
                   if(count == 0){
                       newPeople[j] = p;
                       break;
                   }
               }
            }

        }
        return newPeople;
    }

    private void print(int[][] people) {
        for (int[] p : people) {
            System.out.print(Arrays.toString(p) + "\t");
        }
        System.out.println();
    }
}

/*
[3, 0]	[6, 0]	[7, 0]	[5, 2]	[3, 4]	[5, 3]	[6, 2]	[2, 7]	[9, 0]	[1, 9]
[3,0]   [6,0]   [7,0]   [5,2]   [3,4]   [5,3]   [6,2]   [2,7]   [9,0]   [1,9]
 */