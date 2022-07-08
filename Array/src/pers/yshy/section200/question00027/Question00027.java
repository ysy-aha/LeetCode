package pers.yshy.section200.question00027;

import java.util.Arrays;

public class Question00027 {

    public static void main(String[] args) {
        Solution01 s01 = new Solution01();
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        int res = s01.removeElement(nums, val);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        val = 2;
        res = s01.removeElement(nums, val);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{};
        val = 2;
        res = s01.removeElement(nums, val);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{2};
        val = 2;
        res = s01.removeElement(nums, val);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));
    }

}
