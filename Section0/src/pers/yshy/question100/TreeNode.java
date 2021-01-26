package pers.yshy.question100;

/**
 * 二叉树对象
 * @author ysy
 * @date 2021/1/14
 * @package pers.yshy.question100
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
