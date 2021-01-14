package pers.yshy.question100;

/**
 * 将两棵树先序遍历，一旦由不一样的 就返回 false
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：36.3 MB, 在所有 Java 提交中击败了6.17%的用户
 *
 * @author ysy
 * @date 2021/1/14
 * @package pers.yshy.question100
 **/
public class Solution01 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return preorderTraversal(p, q);
    }

    private boolean preorderTraversal(TreeNode p, TreeNode q){
        // 如果树存在null
        if(p == null || q == null){
            if(p == null && q == null){
                return true;
            }
            return false;
        }
        // 比较两棵树的节点，不同返回false
        if(p.val != q.val){
            return false;
        }

        boolean left = preorderTraversal(p.left, q.left);
        boolean right = preorderTraversal(p.right, q.right);
        return left && right;
    }
}
