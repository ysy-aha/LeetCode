package pers.yshy.simple.question543;

/**
 * 抄的
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.3 MB, 在所有 Java 提交中击败了80.01%的用户
 * @Author:ysy
 * @Date:2020/12/21
 * @Package:pers.yshy.simple.question543
 **/
public class Solution02 {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        depth(root);
        return max;
    }

    public int depth(TreeNode node) {
        if (node == null) return 0;
        int left = depth(node.left);
        int right = depth(node.right);
        max = Math.max(left + right, max);
        return Math.max(left, right) + 1;
    }

}
