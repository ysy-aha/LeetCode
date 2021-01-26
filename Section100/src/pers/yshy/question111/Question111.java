package pers.yshy.question111;

import java.util.LinkedList;

/**
 * 111. 二叉树的最小深度
 *
 * @author ysy
 * @date 2021/1/18
 * @package pers.yshy.question111
 **/
public class Question111 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int res = 9;

        res = s.minDepth(create(new Integer[]{3, 9, 20, null, null, 15, 7}));
        System.out.println(res);

        res = s.minDepth(create(new Integer[]{2, null, 3, null, 4, null, 5, null, 6}));
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
