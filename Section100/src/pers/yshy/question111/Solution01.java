package pers.yshy.question111;

/**
 * 递归前序遍历 返回最小值
 * 注意: 只有左右都没有子节点的才能被称为叶子节点
 *
 * 执行用时：8 ms, 在所有 Java 提交中击败了38.31%的用户
 * 内存消耗：59.2 MB, 在所有 Java 提交中击败了30.65%的用户
 *
 * @author ysy
 * @date 2021/1/18
 * @package pers.yshy.question111
 **/
public class Solution01 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int left = root.left != null ? minDepth(root.left) : -1;
        int right = root.right != null ? minDepth(root.right) : -1;
        int max = Integer.MAX_VALUE;
        return Math.min(left < 0 ? max : left, right < 0 ? max : right) + 1;
    }
}
