package pers.yshy.simple.section50.question00026;

/**
 * 执行用时：491 ms, 在所有 Java 提交中击败了5.09%的用户
 * 内存消耗：42.9 MB, 在所有 Java 提交中击败了71.08%的用户
 */
public class Solution01 {
    public int removeDuplicates(int[] nums) {
        // 第一次循环，比较两个数，把相同的两个数的前一个改为int最大值
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                nums[i - 1] = Integer.MAX_VALUE;
                count++;
            }
        }
        // 第二次循环，排序
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums.length - count;
    }
}
