package pers.yshy.easy.q000026;

import java.util.Arrays;

/**
 * 删除有序数组中的重复项
 *
 * @author ysy
 * @since 2022/11/8
 */
public class Q000026 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        int res = removeDuplicates(nums);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        res = removeDuplicates(nums);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 双指针：l，r，t
     * 假如 t=nums[0]，如果nums[1]=t，l=1，r从l+1往后走，
     * 遇到nums[r]>t，nums[l]与nums[r]交换，t=nums[l]，l往后走，遇到nums[l]<=t就停下，继续上面的操作
     * <p>
     * 时间：0 ms，击败：100%
     * 内存：43.1 MB，击败：43.77%
     *
     * @param nums
     * @return
     */
    private static int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int l = 1;
        int r = 1;
        int t = nums[0];
        while (r < nums.length) {
            if (nums[r] > t) {
                nums[l] = nums[r];
                t = nums[r];
                l++;
            }
            r++;
        }
        return l;
    }
}
