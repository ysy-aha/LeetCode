package pers.yshy.section200.question00035;

public class Solution01 {

    /**
     * 二分查找法
     *
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了28.88%的用户
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        // 左右两边判断
        if (nums[left] == target) {
            return left;
        } else if (nums[left] > target) {
            return 0;
        } else if (nums[right] == target) {
            return right;
        } else if (nums[right] < target) {
            return right + 1;
        }
        while (left < right - 1) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return nums[left] > target ? left : left + 1;
    }

}
