package pers.yshy.question303;

/**
 * 执行用时：80 ms, 在所有 Java 提交中击败了16.18%的用户
 * 内存消耗：41.6 MB, 在所有 Java 提交中击败了14.30%的用户
 *
 * @author ysy
 * @date 2021/3/2
 * @package pers.yshy.question303
 **/
public class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for (; i <= j; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
