package pers.yshy.easy.test;

import java.util.*;

/**
 * @author ysy
 * @since 2023/3/10
 */
public class Test01 {

    public static void main(String[] args) {
        int[] a;
        int[] b;

        a = new int[]{1, 2, 3};
        b = new int[]{2, 3, 4, 3};
        System.out.println(Arrays.toString(test(a, b)));

        a = new int[]{1, 2, 3, 3};
        b = new int[]{2, 3, 4, 3};
        System.out.println(Arrays.toString(test(a, b)));

    }

    private static Integer[] test(int[] a, int[] b) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>(a.length);

        for (int item : a) {
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }

        for (int item : b) {
            if (map.containsKey(item) && map.get(item) > 0) {
                map.put(item, map.get(item) - 1);
                res.add(item);
            }
        }

        return res.toArray(new Integer[res.size()]);
    }
}
