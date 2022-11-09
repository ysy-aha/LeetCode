package pers.yshy.easy.q000027;

import java.util.Arrays;

/**
 * 移除元素
 *
 * @author ysy
 * @since 2022/11/9
 */
public class Q000027 {

    public static void main(String[] args) {
        int[] nums;
        int val;
        int res;

        nums = new int[]{3, 2, 2, 3};
        val = 3;
        res = removeElement(nums, val);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        val = 2;
        res = removeElement(nums, val);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{0};
        val = 2;
        res = removeElement(nums, val);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{0};
        val = 0;
        res = removeElement(nums, val);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 循环，设置双指针，l,r
     * l=0,r=0,如果nums[r]!=val,l++,r++
     * 如果nums[r]==val,r++,nums[l]=nums[r],l++,r++
     * <p>
     * 时间：0 ms，击败：100%
     * 内存：40.1 MB，击败：37.14%
     *
     * @param nums
     * @param val
     * @return
     */
    private static int removeElement(int[] nums, int val) {
        int l = 0;
        int r = 0;
        while (r < nums.length) {
            if (nums[r] == val) {
                r++;
                continue;
            }
            nums[l] = nums[r];
            l++;
            r++;
        }
        return l;
    }

}
