package pers.yshy.section200.question00035;

public class Question00035 {
    public static void main(String[] args) {
        Solution01 s01 = new Solution01();
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 5;
        int res = s01.searchInsert(nums, target);
        System.out.println("期待至为 2 : " + res);

        nums = new int[]{1, 3, 5, 6};
        target = 2;
        res = s01.searchInsert(nums, target);
        System.out.println("期待至为 1 : " +res);

        nums = new int[]{1, 3, 5, 6};
        target = 7;
        res = s01.searchInsert(nums, target);
        System.out.println("期待至为 4 : " +res);

        nums = new int[]{1, 3, 5, 6};
        target = 0;
        res = s01.searchInsert(nums, target);
        System.out.println("期待至为 0 : " +res);

        nums = new int[]{1};
        target = 0;
        res = s01.searchInsert(nums, target);
        System.out.println("期待至为 0 : " +res);

        nums = new int[]{1};
        target = 1;
        res = s01.searchInsert(nums, target);
        System.out.println("期待至为 0 : " +res);

        nums = new int[]{1};
        target = 2;
        res = s01.searchInsert(nums, target);
        System.out.println("期待至为 1 : " +res);
    }
}
