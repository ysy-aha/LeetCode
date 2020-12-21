package pers.yshy.simple.question55;

/**
 * 循环，计算下标为i的元素前(包括i)的最大子序和
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.6 MB, 在所有 Java 提交中击败了48.72%的用户
 *
 * @Author:ysy
 * @Date:2020/12/21
 * @Package:pers.yshy.simple.question55
 **/
public class Solution03 {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], pre = 0;
        for (int i : nums) {
            pre = Math.max(pre + i, i);
            maxSum = Math.max(maxSum, pre);
        }
        return maxSum;
    }
}
