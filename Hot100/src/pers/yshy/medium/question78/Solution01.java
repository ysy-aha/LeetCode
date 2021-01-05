package pers.yshy.medium.question78;

import java.util.*;

/**
 * 循环，设置标记flag，计算flag前面部分数组的子集，flag增加的时候，只需要每个子集加上新的元素就好了
 *
 * 执行用时：3 ms, 在所有 Java 提交中击败了14.58%的用户
 * 内存消耗：38.7 MB, 在所有 Java 提交中击败了56.36%的用户
 *
 * @author ysy
 * @date 2021/1/5
 * @package pers.yshy.medium.question78
 **/
public class Solution01 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        Arrays.sort(nums);
        Set<String> set = new HashSet<>();
        int left = 0;
        while (left < nums.length) {
            int size = res.size();
            for (int i = 0; i < size; i++) {
                List<Integer> list = new ArrayList<>(res.get(i));
                StringBuilder num = new StringBuilder(list.size());
                for (int j = 0; j < list.size(); j++) {
                    num.append(list.get(j));
                }
                num.append(nums[left]);
                if (set.add(num.toString())) {
                    list.add(nums[left]);
                    res.add(list);
                }
            }
            left++;
        }
        return res;
    }
}
