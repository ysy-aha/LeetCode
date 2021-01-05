package pers.yshy.medium.question78;

import java.util.*;

/**
 * 位操作，将存入了数组的值设置为1，未存入的值设置为0（Solution02的改进）
 *
 * 执行用时：3 ms, 在所有 Java 提交中击败了14.58%的用户
 * 内存消耗：38.4 MB, 在所有 Java 提交中击败了95.41%的用户
 *
 * @author ysy
 * @date 2021/1/5
 * @package pers.yshy.medium.question78
 **/
public class Solution03 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        double num = Math.pow(2, len);
        Set<String> set = new HashSet<>();
        for (int i = 0; i < num; i++) {
            String binary = Integer.toBinaryString(i);
            StringBuilder str = new StringBuilder(len);
            List<Integer> part = new ArrayList<>();
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '1') {
                    str.append(nums[len - binary.length() + j]);
                    part.add(nums[len - binary.length() + j]);
                }
            }
            if (set.add(str.toString())) {
                res.add(part);
            }
        }
        return res;
    }
}
