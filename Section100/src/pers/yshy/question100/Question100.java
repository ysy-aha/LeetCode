package pers.yshy.question100;

import java.util.LinkedList;

/**
 * 100. 相同的树
 *
 * @author ysy
 * @date 2021/1/14
 * @package pers.yshy.question100
 **/
public class Question100 {
    public static void main(String[] args) {
        Solution02 s = new Solution02();
        boolean res = false;

        res = s.isSameTree(create(new Integer[]{1, 2, 3}), create(new Integer[]{1, 2, 3}));
        System.out.println(res);

        res = s.isSameTree(create(new Integer[]{1, 2}), create(new Integer[]{1, null, 2}));
        System.out.println(res);

        res = s.isSameTree(create(new Integer[]{1, 2, 1}), create(new Integer[]{1, 1, 2}));
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
