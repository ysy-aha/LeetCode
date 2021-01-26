package pers.yshy.question100;

/**
 * 广度优先策略
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：36.2 MB, 在所有 Java 提交中击败了6.96%的用户
 *
 * @author ysy
 * @date 2021/1/14
 * @package pers.yshy.question100
 **/
public class Solution02 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            if (p == null && q == null) {
                return true;
            }
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
