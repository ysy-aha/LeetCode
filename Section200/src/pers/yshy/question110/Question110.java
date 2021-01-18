package pers.yshy.question110;

import java.util.LinkedList;

/**
 * 110. 平衡二叉树
 * @author ysy
 * @date 2021/1/16
 * @package pers.yshy.question110
 **/
public class Question110 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        TreeNode root = null;
        boolean res = false;

        root = create(new Integer[]{3, 9, 20, null, null, 15, 7});
        res = s.isBalanced(root);
        System.out.println(res);

        root = create(new Integer[]{1, 2, 2, 3, 3, null, null, 4, 4});
        res = s.isBalanced(root);
        System.out.println(res);

        root = create(new Integer[]{1, 2, 3, 4, 5, 6, null, 8});
        res = s.isBalanced(root);
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
