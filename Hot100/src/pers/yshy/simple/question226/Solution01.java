package pers.yshy.simple.question226;

/**
 * 递归
 * 新的二叉树从左往右读，旧的二叉树从右往左读
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：35.9 MB, 在所有 Java 提交中击败了69.31%的用户
 *
 * @Author:ysy
 * @Date:2020/12/9
 * @Package:pers.yshy.simple.question226
 **/
public class Solution01 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode t = new TreeNode(root.val);
        if(root.right != null){
            t.left = invertTree(root.right);
        }
        if(root.left != null){
            t.right = invertTree(root.left);
        }
        return t;
    }
}
