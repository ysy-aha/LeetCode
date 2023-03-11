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
     * 循环
     * 设置双指针，一个在前，记录最近的指定值下标，一个在后，记录未移动的数据
     * <p>
     * 时间 0 ms, 击败 100%
     * 内存 40.2 MB, 击败 28.26%
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = 0;
        int count = 0;
        while (right < nums.length) {
            if (nums[right] != val) {
                if (left != right) {
                    nums[left] = nums[right];
                }
                left++;
            } else {
                count++;
            }
            right++;
        }
        return nums.length - count;
    }

    /**
     * 时间 0 ms, 击败 100%
     * 内存 40.3 MB, 击败 19.70%
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement1(int[] nums, int val) {
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] != val) {
                if (left != right) {
                    nums[left] = nums[right];
                }
                left++;
            }
            right++;
        }
        return left;
    }

}
