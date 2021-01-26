package pers.yshy.question110;

/**
 * 前序遍历二叉树，获得所有子节点的深度，然后最大和最小的差
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了99.44%的用户
 * 内存消耗：38.2 MB, 在所有 Java 提交中击败了94.93%的用户
 *
 * @author ysy
 * @date 2021/1/16
 * @package pers.yshy.question110
 **/
public class Solution02 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int res = preorderTraversal(root);
        return res > 0;
    }

    private int preorderTraversal(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lenLeft = preorderTraversal(root.left);
        int lenRight = preorderTraversal(root.right);
        if (lenLeft == -1 || lenRight == -1 || Math.abs(lenLeft - lenRight) > 1) {
            return -1;
        }
        return Math.max(lenLeft, lenRight) + 1;
    }


}
