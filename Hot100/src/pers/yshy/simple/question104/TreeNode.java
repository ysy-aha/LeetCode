package pers.yshy.simple.question104;

/**
 * 树的对象
 *
 * @Author:ysy
 * @Date:2020/12/9
 * @Package:pers.yshy.simple.question617
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
