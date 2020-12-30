package pers.yshy.simple.question1;

import java.util.HashMap;

/**
 * 使用 map，循环，如果map k中不存在当前值
 * 将key设置为 target - nums[i]，value保存 i
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.6 MB, 在所有 Java 提交中击败了65.10%的用户
 *
 * @author ysy
 * @date 2020/12/30
 * @package pers.yshy.simple.question1
 **/
public class Solution01 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                res[0] = map.get(nums[i]);
                res[1] = i;
                break;
            }
            map.put(target - nums[i], i);
        }
        return res;
    }
}
