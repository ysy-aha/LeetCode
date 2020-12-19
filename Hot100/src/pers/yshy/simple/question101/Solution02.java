package pers.yshy.simple.question101;

import java.util.ArrayList;
import java.util.List;

/**
 * 优化1
 * 将遍历的树改为根节点的左右节点
 *
 * 执行用时：2 ms, 在所有 Java 提交中击败了7.84%的用户
 * 内存消耗：37.6 MB, 在所有 Java 提交中击败了20.11%的用户
 *
 * @Author:ysy
 * @Date:2020/12/19
 * @Package:pers.yshy.simple.question101
 **/
public class Solution02 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null ||( root.left == null && root.right == null)) {
            return true;
        } else if (root.left == null || root.right == null) {
            return false;
        }
        List<Integer> asc = new ArrayList<>();
        proOrder(root.left, asc);
        List<Integer> resc = new ArrayList<>();
        proOrderReserve(root.right, resc);

        for (int i = 0; i < asc.size(); i++) {
            if (asc.get(i) == null && resc.get(i) != null) {
                return false;
            } else if (asc.get(i) != null && resc.get(i) == null) {
                return false;
            } else if (asc.get(i) == null && resc.get(i) == null) {
                continue;
            }
            if (!asc.get(i).equals(resc.get(i))) {
                return false;
            }
        }
        return true;
    }

    private void proOrder(TreeNode root, List<Integer> list) {
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

    private void proOrderReserve(TreeNode root, List<Integer> list) {
        list.add(root.val);
        if (root.right != null) {
            proOrderReserve(root.right, list);
            if (root.left == null) {
                list.add(null);
            }
        }
        if (root.left != null) {
            if (root.right == null) {
                list.add(null);
            }
            proOrderReserve(root.left, list);
        }
    }
}
