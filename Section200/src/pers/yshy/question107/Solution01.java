package pers.yshy.question107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 想要将每层的存起来，就要知道当前是在哪层
 * 如果每次将每一层存起来，然后取值
 *
 * 执行用时：2 ms, 在所有 Java 提交中击败了16.78%的用户
 * 内存消耗：39.1 MB, 在所有 Java 提交中击败了5.05%的用户
 *
 * @author ysy
 * @date 2021/1/15
 * @package pers.yshy.question107
 **/
public class Solution01 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<TreeNode> stack = new ArrayList<>();
        stack.add(root);
        List<TreeNode> list = new ArrayList<>();
        while (true) {
            List<Integer> vals = new ArrayList<>();
            for (TreeNode tree : stack) {
                if (tree.left != null) {
                    list.add(tree.left);
                }
                if (tree.right != null) {
                    list.add(tree.right);
                }
                vals.add(tree.val);
            }
            res.add(vals);
            if (list.size() == 0) {
                break;
            }
            stack = list;
            list = new ArrayList<>();
        }
        Collections.reverse(res);
        return res;
    }
}
