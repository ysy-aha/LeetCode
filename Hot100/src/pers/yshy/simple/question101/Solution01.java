package pers.yshy.simple.question101;

import java.util.ArrayList;
import java.util.List;

/**
 * 将二叉树前序遍历一次，再倒着前序遍历一次
 *
 * 执行用时：43 ms, 在所有 Java 提交中击败了7.84%的用户
 * 内存消耗：38.3 MB, 在所有 Java 提交中击败了6.66%的用户
 *
 * @Author:ysy
 * @Date:2020/12/17
 * @Package:pers.yshy.simple.question101
 **/
public class Solution01 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        List<Integer> asc = new ArrayList<>();
        proOrder(root, asc);
        System.out.println();
        List<Integer> resc = new ArrayList<>();
        proOrderReserve(root, resc);
        System.out.println();

        for (int i = 0; i < asc.size(); i++) {
            if (asc.get(i) == null && resc.get(i) != null) {
                return false;
            } else if (asc.get(i) != null && resc.get(i) == null) {
                return false;
            } else if(asc.get(i) == null && resc.get(i) == null){
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
        System.out.print(root.val + "\t");
        if (root.left != null) {
            proOrder(root.left, list);
            if (root.right == null) {
                list.add(null);
                System.out.print("null\t");
            }
        }
        if (root.right != null) {
            if (root.left == null) {
                list.add(null);
                System.out.print("null\t");
            }
            proOrder(root.right, list);
        }

    }

    private void proOrderReserve(TreeNode root, List<Integer> list) {
        list.add(root.val);
        System.out.print(root.val + "\t");
        if (root.right != null) {
            proOrderReserve(root.right, list);
            if (root.left == null) {
                list.add(null);
                System.out.print("null\t");
            }
        }
        if (root.left != null) {
            if (root.right == null) {
                list.add(null);
                System.out.print("null\t");
            }
            proOrderReserve(root.left, list);
        }
    }

}
