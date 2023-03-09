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
     * 双指针，
     * 同时出发，第一个a停在第一个重复的数据处，第二个b往后走
     * b遇到与前一个值不同的就替换a，然后a++，b继续往后走
     * <p>
     * 时间 0 ms, 击败 100%
     * 内存 43.2 MB, 击败 44%
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int font = 1;
        int behind = 1;
        while (font < nums.length) {
            if (nums[font] != nums[font - 1]) {
                if (font != behind) {
                    nums[behind] = nums[font];
                }
                behind++;
            }
            font++;
        }
        return behind;
    }
}
