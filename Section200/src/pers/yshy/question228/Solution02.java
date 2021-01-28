package pers.yshy.question228;

import java.util.ArrayList;
import java.util.List;

/**
 * solution01优化，每次使用字符串相加太浪费时间了，改用StringBuilder
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：36.7 MB, 在所有 Java 提交中击败了59.79%的用户
 *
 * @author ysy
 * @date 2021/1/28
 * @package pers.yshy.question228
 **/
public class Solution02 {
    public List<String> summaryRanges(int[] nums) {
        int left = 0, right = 1;
        List<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        while (right <= nums.length) {
            if (right == nums.length || nums[right] - nums[right - 1] != 1) {
                str.append(String.valueOf(nums[left]));
                if (left != right - 1) {
                    str.append("->");
                    str.append(String.valueOf(nums[right - 1]));
                }
                list.add(str.toString());
                str = new StringBuilder();
                left = right;
            }
            right++;
        }
        return list;
    }
}
