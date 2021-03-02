package pers.yshy.question303;

/**
 * 执行用时：10 ms, 在所有 Java 提交中击败了76.97%的用户
 * 内存消耗：41.2 MB, 在所有 Java 提交中击败了83.30%的用户
 *
 * @author ysy
 * @date 2021/3/2
 * @package pers.yshy.question303
 **/
public class NumArray1 {

    private int[] nums;

    public NumArray1(int[] nums) {
        this.nums = new int[nums.length+1];
        this.nums[0] = 0;
        for(int i=0; i< nums.length; i++){
            this.nums[i+1] = this.nums[i] + nums[i];
        }

    }

    public int sumRange(int i, int j) {
        return nums[j+1] - nums[i];
    }
}
