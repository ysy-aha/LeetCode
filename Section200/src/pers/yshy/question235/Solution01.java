package pers.yshy.question235;

/**
 * 按照示例，6和8的公共祖先是6
 * 三种情况，
 *  1. 两个值都在左边
 *  2. 一个在左边一个在右边
 *  3. 两个值都在右边
 *
 *  递归
 *
 *  这是二叉搜索树
 *
 * 执行用时：7 ms, 在所有 Java 提交中击败了32.36%的用户
 * 内存消耗：39.5 MB, 在所有 Java 提交中击败了18.40%的用户
 *
 * @author ysy
 * @date 2021/2/1
 * @package pers.yshy.question235
 **/
public class Solution01 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(root.val == p.val || root.val == q.val){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p ,q);
        TreeNode right = lowestCommonAncestor(root.right, p ,q);

        // 当左边有相等值时返回左边，右边有相等值时返回右边
        // 左右都有相等值时返回当前，都没有时返回null
        if(left == null && right != null){
            return right;
        } else if(left != null && right == null){
            return left;
        } else if(left != null && right != null){
            return root;
        } else{
            return null;
        }
    }

}
