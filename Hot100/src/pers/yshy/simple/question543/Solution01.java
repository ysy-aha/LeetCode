package pers.yshy.simple.question543;

/**
 * 前序遍历，非递归(写错了)
 *
 * @Author:ysy
 * @Date:2020/12/21
 * @Package:pers.yshy.simple.question543
 **/
public class Solution01 {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getLen(root.left);
        int right = getLen(root.right);
        return left + right;
    }

    private int getLen(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getLen(root.left);
        int right = getLen(root.right);
        return Math.max(left, right) + 1;
    }
}
