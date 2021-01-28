package pers.yshy.question228;

import java.util.ArrayList;
import java.util.List;

/**
 * 无重复的、有序的数组
 *
 * 设置两个指针，一个指向连续的左边，一个指向连续的右边
 * 只要没有断右边一直走，断了左边就要移动
 *
 * 执行用时：9 ms, 在所有 Java 提交中击败了21.92%的用户
 * 内存消耗：36.9 MB, 在所有 Java 提交中击败了24.40%的用户
 * @author ysy
 * @date 2021/1/28
 * @package pers.yshy.question228
 **/
public class Solution01 {
    public List<String> summaryRanges(int[] nums) {
        int left = 0, right = 1;
        List<String> list = new ArrayList<>();
        while (right <= nums.length) {
            if (right == nums.length || nums[right] - nums[right - 1] != 1) {
                if(left != right-1){
                    String str = nums[left] + "->" + nums[right - 1];
                    list.add(str);
                }
                else {
                    String str = nums[left] + "";
                    list.add(str);
                }
                left = right;
            }
            right++;
        }
        return list;
    }
}
