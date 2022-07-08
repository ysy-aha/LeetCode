package pers.yshy.section200.question00001;

import java.util.Arrays;

public class Question00001 {

    public static void main(String[] args) {
        Solution01 s01 = new Solution01();

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] res = s01.twoSum(nums, target);
        System.out.println(Arrays.toString(res));

        nums = new int[]{3, 2, 4};
        target = 6;
        res = s01.twoSum(nums, target);
        System.out.println(Arrays.toString(res));

        nums = new int[]{3, 3};
        target = 6;
        res = s01.twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
