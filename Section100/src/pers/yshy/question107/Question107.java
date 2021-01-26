package pers.yshy.question107;

import java.util.LinkedList;
import java.util.List;

/**
 * 107. 二叉树的层序遍历 II
 * @author ysy
 * @date 2021/1/15
 * @package pers.yshy.question107
 **/
public class Question107 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        List<List<Integer>> res = null;

        res = s.levelOrderBottom(create(new Integer[]{3, 9, 20, null, null, 15, 7}));
        for (List<Integer> list : res) {
            for (Integer num : list) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        System.out.println();

        res = s.levelOrderBottom(create(new Integer[]{3, 9}));
        for (List<Integer> list : res) {
            for (Integer num : list) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        System.out.println();

        res = s.levelOrderBottom(create(new Integer[]{3}));
        for (List<Integer> list : res) {
            for (Integer num : list) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static TreeNode create(Integer[] nums) {
        TreeNode root = new TreeNode(nums[0]);
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        int flag = 1;
        while (!stack.isEmpty() && flag < nums.length) {
            TreeNode temp = stack.pop();
            if (nums[flag] != null) {
                temp.left = new TreeNode(nums[flag]);
                stack.add(temp.left);
            }
            if (flag + 1 >= nums.length) {
                break;
            }
            if (nums[flag + 1] != null) {
                temp.right = new TreeNode(nums[flag + 1]);
                stack.add(temp.right);
            }
            flag += 2;
        }
        return root;
    }
}
