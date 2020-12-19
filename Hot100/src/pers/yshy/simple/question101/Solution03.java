package pers.yshy.simple.question101;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 优化2
 * 只需要一个list，遍历右节点的时候用左节点生成的list去比较
 * 写错了 不写了
 *
 * @Author:ysy
 * @Date:2020/12/19
 * @Package:pers.yshy.simple.question101
 **/
public class Solution03 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        } else if (root.left == null || root.right == null) {
            return false;
        }
        LinkedList<Integer> list = new LinkedList<>();
        proOrder(root.left, list);
        proOrderReserve(root.right, list);
        return list.isEmpty() ? true : false;
    }

    private void proOrder(TreeNode root, LinkedList<Integer> list) {
        list.add(root.val);
        if (root.left != null) {
            proOrder(root.left, list);
            if (root.right == null) {
                list.add(null);
            }
        }
        if (root.right != null) {
            if (root.left == null) {
                list.add(null);
            }
            proOrder(root.right, list);
        }

    }

    private void proOrderReserve(TreeNode root, LinkedList<Integer> list) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                if (list.getFirst() == null || list.getFirst() != root.val) {
                    break;
                }
                list.pop();
                root = root.right;
            } else {
                root = stack.pop();
                root = root.left;
            }
        }
    }
}
