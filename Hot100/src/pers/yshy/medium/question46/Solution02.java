package pers.yshy.medium.question46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 回溯(抄的)
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了97.49%的用户
 * 内存消耗：38.7 MB, 在所有 Java 提交中击败了60.14%的用户
 *
 * @author ysy
 * @date 2021/1/6
 * @package pers.yshy.medium.question46
 **/
public class Solution02 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        recall(list, 0, res);
        return res;
    }

    private void recall(List<Integer> list, int pos, List<List<Integer>> out) {
        if (pos == list.size()) {
            out.add(new ArrayList<>(list));
        }
        for (int i = pos; i < list.size(); i++) {
            Collections.swap(list, i, pos);
            recall(list, pos + 1, out);
            Collections.swap(list, i, pos);
        }
    }
}


