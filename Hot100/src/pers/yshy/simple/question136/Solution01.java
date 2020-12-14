package pers.yshy.simple.question136;

/**
 * 嵌套循环
 * 第一层循环 i，第二层循环 查找 i相同的数字j，然后将i的下一个数字与j替换
 * 某个数字在后面没找到，返回它
 *
 * 执行用时：112 ms, 在所有 Java 提交中击败了6.24%的用户
 * 内存消耗：38.6 MB, 在所有 Java 提交中击败了82.36%的用户
 *
 * @Author:ysy
 * @Date:2020/12/11
 * @Package:pers.yshy.simple.question104
 **/
public class Solution01 {
    public int singleNumber(int[] nums) {
        int i = 0;
        for (; i < nums.length - 1; i++) {
            int j = i + 1;
            for (; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[j];
                    nums[j] = temp;
                    i++;
                    break;
                }
            }
            if (j == nums.length) {
                break;
            }
        }
        return nums[i];
    }
}
