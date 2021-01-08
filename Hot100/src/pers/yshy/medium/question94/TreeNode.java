package pers.yshy.medium.question94;

/**
 * 二叉树对象
 *
 * @author ysy
 * @date 2021/1/8
 * @package pers.yshy.medium.question94
 **/
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
