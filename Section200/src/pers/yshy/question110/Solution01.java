package pers.yshy.question110;

import java.util.ArrayList;
import java.util.List;

/**
 * 前序遍历二叉树，获得所有子节点的深度，然后最大和最小的差
 *
 * 执行用时：2 ms, 在所有 Java 提交中击败了7.92%的用户
 * 内存消耗：38.7 MB, 在所有 Java 提交中击败了21.40%的用户
 *
 * @author ysy
 * @date 2021/1/16
 * @package pers.yshy.question110
 **/
public class Solution01 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        List<Boolean> list = new ArrayList<>();
        preorderTraversal(root, list);
        for (Boolean b : list) {
            if(!b){
                return false;
            }
        }
        return true;
    }

    private int preorderTraversal(TreeNode root, List<Boolean> list) {
        if (root == null) {
            return 0;
        }
        int lenLeft = preorderTraversal(root.left, list);
        int lenRight = preorderTraversal(root.right, list);
        if (Math.abs(lenLeft - lenRight) < 2) {
            list.add(true);
        } else {
            list.add(false);
        }
        return Math.max(lenLeft, lenRight) + 1;
    }


}
