package pers.yshy.simple.question617;

/**
 * 使用递归
 * 创建一棵新的树，只要两棵母树有的枝叶，新树就一定有，两棵母树共同的枝叶，就相加存入新树
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了66.96%的用户
 * 内存消耗：39 MB, 在所有 Java 提交中击败了52.89%的用户
 *
 * @Author:ysy
 * @Date:2020/12/9
 * @Package:pers.yshy.simple.question617
 **/
public class Solution01 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        // 如果两棵母树都为null，直接返回null
        if(t1 == null && t2 == null){
            return null;
        }
        // 计算当前节点的值
        int val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
        // 创建节点 t3
        TreeNode t3 = new TreeNode(val);
        // 如果t1或t2中有一个左节点不为空，t3就存在左节点
        if ((t1 != null && t1.left != null) || (t2 != null && t2.left != null)) {
            t3.left = mergeTrees((t1 == null ? null : t1.left), (t2 == null ? null : t2.left));
        }
        // 如果t1或t2中有一个右节点不为空，t3就存在右节点
        if ((t1 != null && t1.right != null) || (t2 != null && t2.right != null)) {
            t3.right = mergeTrees((t1 == null ? null : t1.right), (t2 == null ? null : t2.right));
        }
        return t3;
    }

}
