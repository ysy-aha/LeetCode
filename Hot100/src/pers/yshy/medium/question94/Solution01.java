package pers.yshy.medium.question94;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归中序遍历
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：36.4 MB, 在所有 Java 提交中击败了93.59%的用户
 *
 * @author ysy
 * @date 2021/1/8
 * @package pers.yshy.medium.question94
 **/
public class Solution01 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderTravel(root, res);
        return res;
    }

    private void inorderTravel(TreeNode root, List<Integer> out) {
        if (root == null) {
            return;
        }
        inorderTravel(root.left, out);
        out.add(root.val);
        inorderTravel(root.right, out);
    }
}
