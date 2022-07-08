package pers.yshy.section200.question00001;

public class Solution01 {
    /**
     * 思路：
     * 1. 数组不是顺序的
     * 2. 同一个元素不会多次出现，同一个位置的元素
     * 3. 使用循环，但是可能会超出 O(n^2) 时间
     * 4. 不能排序，不能打乱数组
     *
     * 执行用时：54 ms, 在所有 Java 提交中击败了26.05%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了11.92%的用户
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int i, j = 0;
        outline:
        for (i = 0; i < nums.length - 1; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    break outline;
                }
            }
        }
        // 因为一定会有结果，所以可以直接输出
        return new int[]{i, j};
    }
}
