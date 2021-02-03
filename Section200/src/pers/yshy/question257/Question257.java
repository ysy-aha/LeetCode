package pers.yshy.question257;

import java.util.LinkedList;
import java.util.List;

/**
 * 257. 二叉树的所有路径
 * @author ysy
 * @date 2021/2/3
 * @package pers.yshy.question257
 **/
public class Question257 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        List<String> res = null;

        res = s.binaryTreePaths(create(new Integer[]{1, 2, 3, null, 5}));
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
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
