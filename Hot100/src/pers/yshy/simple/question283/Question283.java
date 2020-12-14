package pers.yshy.simple.question283;

/**
 * 283. 移动零
 *
 * @Author:ysy
 * @Date:2020/12/14
 * @Package:pers.yshy.simple.question283
 **/
public class Question283 {
    public static void main(String[] args) {
        Solution02 s = new Solution02();
        int[] nums = {0, 1, 0, 3, 12};
        s.moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i + "\t");
        }
        System.out.println();

        nums = new int[]{};
        s.moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i + "\t");
        }
        System.out.println();

        nums = new int[]{1, 1};
        s.moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i + "\t");
        }
        System.out.println();

        nums = new int[]{1, 4, 0, 3, 2, 0};
        s.moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i + "\t");
        }
        System.out.println();

        nums = new int[]{0, 0};
        s.moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
