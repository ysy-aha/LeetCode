package pers.yshy.simple.section50.question00026;

import java.util.Arrays;

public class question00026 {
    public static void main(String[] args) {
        Solution01 s01 = new Solution01();

        int[] nums = new int[]{1, 1, 2};
        int res = s01.removeDuplicates(nums);
        System.out.println("res = " + res);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        res = s01.removeDuplicates(nums);
        System.out.println("res = " + res);
        System.out.println(Arrays.toString(nums));
    }
}
