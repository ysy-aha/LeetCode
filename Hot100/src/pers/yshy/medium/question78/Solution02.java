package pers.yshy.medium.question78;

import java.util.*;

/**
 * 位操作，将存入了数组的值设置为1，未存入的值设置为0
 *
 * 执行用时：37 ms, 在所有 Java 提交中击败了14.58%的用户
 * 内存消耗：39.4 MB, 在所有 Java 提交中击败了5.09%的用户
 *
 * @author ysy
 * @date 2021/1/5
 * @package pers.yshy.medium.question78
 **/
public class Solution02 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        double num = Math.pow(2, len);
        Set<String> set = new HashSet<>();
        for (int i = 0; i < num; i++) {
             String binary = String.format("%" + len + "s", Integer.toBinaryString(i)).replaceAll(" ", "0");
            StringBuilder str = new StringBuilder(len);
            List<Integer> part = new ArrayList<>();
            for (int j = 0; j < len; j++) {
                if (binary.charAt(j) == '1') {
                    str.append(nums[j]);
                    part.add(nums[j]);
                }
            }
            if (set.add(str.toString())) {
                res.add(part);
            }
        }
        return res;
    }
}
