package pers.yshy.medium.question94;

import java.util.LinkedList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 *
 * @author ysy
 * @date 2021/1/8
 * @package pers.yshy.medium.question94
 **/
public class Question94 {
    public static void main(String[] args) {
        Solution02 s1 = new Solution02();
        List<Integer> res = null;

        res = s1.inorderTraversal(create(new Integer[]{1, null, 2, 3}));
        res.stream().forEach((item) -> {
            System.out.print(item + "\t");
        });
        System.out.println();

        res = s1.inorderTraversal(create(new Integer[]{}));
        res.stream().forEach((item) -> {
            System.out.print(item + "\t");
        });
        System.out.println();

        res = s1.inorderTraversal(create(new Integer[]{1}));
        res.stream().forEach((item) -> {
            System.out.print(item + "\t");
        });
        System.out.println();

        res = s1.inorderTraversal(create(new Integer[]{1, 2}));
        res.stream().forEach((item) -> {
            System.out.print(item + "\t");
        });
        System.out.println();

        res = s1.inorderTraversal(create(new Integer[]{1, null, 2}));
        res.stream().forEach((item) -> {
            System.out.print(item + "\t");
        });
        System.out.println();
    }

    /**
     * 创建二叉树
     *
     * @param nums
     * @return
     */
    private static TreeNode create(Integer[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }
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
