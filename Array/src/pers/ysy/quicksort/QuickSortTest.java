package pers.ysy.quicksort;

/**
 *
 * @Author:ysy
 * @Date:2020/12/14
 * @Package:pers.ysy.quicksort
 **/
public class QuickSortTest {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 6, 9, 8, 4, 1, 2, 3, 5, 7, 8, 6, 4, 3, 1, 9, 5, 7};
        quictSort(nums, 0, nums.length - 1);
        for (int i : nums) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    private static void quictSort(int[] nums, int begin, int end) {
        if (begin < end) {
            int temp = nums[begin];
            int i = begin;
            int j = end;
            while (i < j) {
                while (i < j && nums[j] > temp) {
                    j--;
                }
                nums[i] = nums[j];
                while (i < j && nums[i] <= temp) {
                    i++;
                }
                nums[j] = nums[i];
            }
            nums[i] = temp;
            quictSort(nums, begin, i - 1);
            quictSort(nums, i + 1, end);
        }
    }
}
