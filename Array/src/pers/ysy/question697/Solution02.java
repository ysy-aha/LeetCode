package pers.ysy.question697;

import java.util.HashMap;
import java.util.Map;

/**
 * 先循环找到度，然后通过循环找到最小字符串
 * 执行用时：101 ms, 在所有 Java 提交中击败了6.87%的用户
 * 内存消耗：44.1 MB, 在所有 Java 提交中击败了6.25%的用户
 * @Author ysy
 * @Date 2020/7/4
 **/
public class Solution02 {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        // 找到度
        int max_len = 1;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.replace(nums[i], map.get(nums[i]) + 1);
                if (max_len < map.get(nums[i])) {
                    max_len = map.get(nums[i]);
                }
            } else {
                map.put(nums[i], 1);
            }
        }
        int min_len = nums.length;
        for (Integer key : map.keySet()) {
            if (map.get(key) == max_len) {
                int left = 0;
                int right = nums.length - 1;
                // 分别从左右找到最大度数的值
                while (left < right) {
                    if (nums[left] != key) {
                        left++;
                    }
                    if (nums[right] != key) {
                        right--;
                    }
                    if (nums[left] == key && nums[right] == key) {
                        break;
                    }
                }
                if (min_len > right - left + 1) {
                    min_len = right - left + 1;
                }
            }
        }
        return min_len;
    }
}
