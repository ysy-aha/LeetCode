package pers.yshy.simple.section50.question00027;

/**
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：40.3 MB, 在所有 Java 提交中击败了10.94%的用户
 */
public class Solution01 {
    public int removeElement(int[] nums, int val) {
        int fast = 0, slow = 0;
        int count = 0;
        while (fast < nums.length) {
            // 如果快指针等于val，就 +1
            if (nums[fast] == val) {
                fast++;
                count++;
                continue;
            } else {
                if (fast != slow) {
                    nums[slow] = nums[fast];
                    nums[fast] = val;
                }
                fast++;
                slow++;
            }
        }
        return nums.length - count;
    }
}
