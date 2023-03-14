package pers.yshy.easy.q000108;

import java.util.LinkedList;

/**
 * 108. 将有序数组转换为二叉搜索树
 *
 * @author ysy
 * @since 2022/11/11
 */
public class Q000108 {

    public static void main(String[] args) {
        int[] nums;
        TreeNode treeNode;

        nums = new int[]{-10, -3, 0, 5, 9};
        treeNode = sortedArrayToBST(nums);
        levelTraverse(treeNode);
        System.out.println("\n-------");
        nums = new int[]{1, 3};
        treeNode = sortedArrayToBST(nums);
        levelTraverse(treeNode);
        System.out.println("\n-------");
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    private static TreeNode buildTree(int[] nums, int left, int right) {
        if(left > right) {
            return null;
        }
        int middle = (right + left) / 2;
        TreeNode treeNode = new TreeNode(nums[middle]);
        treeNode.left = buildTree(nums, left, middle-1);
        treeNode.right = buildTree(nums, middle + 1, right);
        return treeNode;
    }

    public static void levelTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + "  ");
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }
}
