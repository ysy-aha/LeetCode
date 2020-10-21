package pers.ysy.section700.question747;

/**
 * 先设置最大值下标为max = 0，标记为flage = 0
 * 循环，如果存在某个元素是nums[max]的两倍，就将max更换为该元素的下标，并且标记设置为flag = 0
 *     如果存在元素的两倍大于 nums[max]，就将标记设置为 flag = 0
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了56.19%的用户
 * 内存消耗：37.1 MB, 在所有 Java 提交中击败了26.97%的用户
 * @Author ysy
 * @Date 2020/10/9
 **/
public class Solution01 {

    public int dominantIndex(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int max = 0, flag = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == 0){
                continue;
            }
            if (nums[max] * 2 <= nums[i]) {
                max = i;
                flag = 0;
            }else if(nums[max] < nums[i]){
                max = i;
                flag = -1;
            } else if (nums[i] * 2 > nums[max]) {
                flag = -1;
            }
        }
        return flag == 0 ? max : -1;
    }

}
