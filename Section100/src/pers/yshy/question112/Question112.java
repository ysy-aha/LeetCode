package pers.yshy.question112;

import java.util.LinkedList;

/**
 * 112. 路径总和
 *
 * @author ysy
 * @date 2021/1/19
 * @package pers.yshy.question112
 **/
public class Question112 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        boolean res = false;

        res = s.hasPathSum(create(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1}), 18);
        System.out.println(res);

        res = s.hasPathSum(create(new Integer[]{5, 4}), 9);
        System.out.println(res);
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
