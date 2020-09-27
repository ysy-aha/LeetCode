package pers.ysy.question724;

/**
 * 724. 寻找数组的中心索引
 * 给定一个整数类型的数组 nums，请编写一个能够返回数组 “中心索引” 的方法。
 * 我们是这样定义数组 中心索引 的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
 * 示例 1：
 *  输入：
 *  nums = [1, 7, 3, 6, 5, 6]
 *  输出：3
 *  解释：
 *  索引 3 (nums[3] = 6) 的左侧数之和 (1 + 7 + 3 = 11)，与右侧数之和 (5 + 6 = 11) 相等。
 *  同时, 3 也是第一个符合要求的中心索引。
 * 示例 2：
 *  输入：
 *  nums = [1, 2, 3]
 *  输出：-1
 *  解释：
 *  数组中不存在满足此条件的中心索引。
 * 说明：
 *  nums 的长度范围为 [0, 10000]。
 *  任何一个 nums[i] 将会是一个范围在 [-1000, 1000]的整数。
 * @Author ysy
 * @Date 2020/7/4
 **/
public class Question724 {

    /**
     * 错误答案
     *
     * 从左右两边开始计算，那边小那边相加，知道中间某个地方左右相等
     * 1. 中心索引两边是负数，比大就不现实
     * 2. 有一边大数很大小数很小，绝对值不现实
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums) {
        if (nums.length < 3) {
            return nums.length == 1 ? 0 : -1;
        }
        // 左右的下标和左右和
        int left = 0,
                leftCount = nums[0],
                right = nums.length - 1,
                rightCount = nums[right];
        while (right - left > 2) {
            if (Math.abs(leftCount) > Math.abs(rightCount)) {
                right--;
                rightCount += nums[right];
            } else {
                left++;
                leftCount += nums[left];
            }
        }
        return leftCount == rightCount ? left + 1 : -1;
    }

    /**
     * 创建两个数组，一个存得是从左往右的元素的和，一个存从右往左的元素的和
     * 然后进行比较
     *
     * 执行用时：3 ms, 在所有 Java 提交中击败了25.18%的用户
     * 内存消耗：39.2 MB, 在所有 Java 提交中击败了93.37%的用户
     * @param nums
     * @return
     */
    public int pivotIndex1(int[] nums) {
        int len = nums.length;
        if (len < 3) {
            return nums.length == 1 ? 0 : -1;
        }
        int[] leftCounts = new int[len],
                rightCounts = new int[len];
        leftCounts[0] = nums[0];
        rightCounts[len - 1] = nums[len - 1];
        for (int i = 1; i < len; i++) {
            leftCounts[i] = leftCounts[i - 1] + nums[i];
            rightCounts[len - 1 - i] = rightCounts[len - i] + nums[len - 1 - i];
        }
        if (rightCounts[1] == 0) {
            return 0;
        }
        for (int i = 0; i < len - 2; i++) {
            if (leftCounts[i] == rightCounts[i + 2]) {
                return i + 1;
            }
        }
        if (leftCounts[len - 2] == 0) {
            return len - 1;
        }
        return -1;
    }

    public int pivotIndex2(int[] nums) {
        int len = nums.length;
        int sum = 0;
        int leftSum = 0;
        for (int i : nums) {
            sum += i;
        }
        for (int i = 0; i < len; i++) {
            if(sum - nums[i] - leftSum == 0) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
