package pers.yshy.question235;

/**
 * 这是一颗二叉搜索树
 *
 * 执行用时：6 ms, 在所有 Java 提交中击败了99.50%的用户
 * 内存消耗：39 MB, 在所有 Java 提交中击败了96.69%的用户
 *
 * @author ysy
 * @date 2021/2/1
 * @package pers.yshy.question235
 **/
public class Solution02 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }
}
