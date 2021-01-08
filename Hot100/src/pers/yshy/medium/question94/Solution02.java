package pers.yshy.medium.question94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 中序遍历(非递归)
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了42.45%的用户
 * 内存消耗：36.5 MB, 在所有 Java 提交中击败了84.08%的用户
 *
 * @author ysy
 * @date 2021/1/8
 * @package pers.yshy.medium.question94
 **/
public class Solution02 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                res.add(root.val);
                root = root.right;
            }
        }
        return res;
    }
}
