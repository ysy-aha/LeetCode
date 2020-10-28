package pers.ysy.section1100.question1170;

/**
 * 分别嵌套循环两个数组，用一个新的数组标记最小字符和其频率
 *
 * 执行用时：47 ms, 在所有 Java 提交中击败了19.85%的用户
 * 内存消耗：38.4 MB, 在所有 Java 提交中击败了97.40%的用户
 *
 * @Author ysy
 * @Date 2020/10/28
 **/
public class Solution01 {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] que = computed(queries);
        int[] wo = computed(words);
        int[] res = new int[que.length];
        for (int i = 0; i < que.length; i++) {
            int count = 0;
            for (int j : wo) {
                if (que[i] < j) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }

    private int[] computed(String[] str) {
        int[] res = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            int[] arr = new int[]{str[i].charAt(0), 0};
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) < arr[0]) {
                    arr[0] = str[i].charAt(j);
                    arr[1] = 1;
                } else if (str[i].charAt(j) == arr[0]) {
                    arr[1]++;
                }
            }
            res[i] = arr[1];
        }
        return res;
    }
}
