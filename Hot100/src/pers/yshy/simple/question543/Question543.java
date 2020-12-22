package pers.yshy.simple.question543;

import java.util.LinkedList;

/**
 * 543. 二叉树的直径
 *
 * @Author:ysy
 * @Date:2020/12/21
 * @Package:pers.yshy.simple.question543
 **/
public class Question543 {
    public static void main(String[] args) {
        Solution02 s = new Solution02();
        int res = 0;
        TreeNode root = null;

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        res = s.diameterOfBinaryTree(root);
        System.out.println(res + "\t3");

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        res = s.diameterOfBinaryTree(root);
        System.out.println(res + "\t4");

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        res = s.diameterOfBinaryTree(root);
        System.out.println(res + "\t2");

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        res = s.diameterOfBinaryTree(root);
        System.out.println(res + "\t1");

        root = new TreeNode(1);
        root.right = new TreeNode(3);
        res = s.diameterOfBinaryTree(root);
        System.out.println(res + "\t1");

        root = new TreeNode(1);
        res = s.diameterOfBinaryTree(root);
        System.out.println(res + "\t0");

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        res = s.diameterOfBinaryTree(root);
        System.out.println(res + "\t2");

        root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(1);
        res = s.diameterOfBinaryTree(root);
        System.out.println(res + "\t3");

        root = create(new Integer[]{4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null
                ,-1,-4,null,null,null,-2});
        res = s.diameterOfBinaryTree(root);
        System.out.println(res + "\t8");

        levelOrder(root);
        System.out.println();
    }

    private static TreeNode create(Integer[] nums) {
        TreeNode root = new TreeNode(nums[0]);
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        int flag = 1;
        while(!stack.isEmpty() && flag < nums.length){
            TreeNode temp = stack.pop();
            if(nums[flag] != null){
                temp.left = new TreeNode(nums[flag]);
                stack.add(temp.left);
            }
            if(flag + 1 >= nums.length){
                break;
            }
            if(nums[flag+1] != null){
                temp.right = new TreeNode(nums[flag+1]);
                stack.add(temp.right);
            }
            flag += 2;
        }
        return root;
    }

    public static void levelOrder(TreeNode root){
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            root = queue.pop();
            System.out.print(root.val+" ");
            if(root.left!=null) queue.add(root.left);
            if(root.right!=null) queue.add(root.right);
        }
    }
}
