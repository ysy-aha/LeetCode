package pers.yshy.simple.question101;

/**
 * 101. 对称二叉树
 *
 * @Author:ysy
 * @Date:2020/12/17
 * @Package:pers.yshy.simple.question101
 **/
public class Question101 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        Solution03 s = new Solution03();
        Boolean res; // = s.isSymmetric(root);
        //System.out.println(res + "\ttrue");

//        root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(2);
//        root.left.left = null;
//        root.left.right = new TreeNode(3);
//        root.right.left = null;
//        root.right.right = new TreeNode(3);

//        res = s.isSymmetric(root);
//        System.out.println(res+ "\tfalse");

//        root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(2);
//        root.left.left = null;
//        root.left.right = new TreeNode(4);
//        root.right.left = new TreeNode(4);
//        root.right.right = new TreeNode(3);
//
//        res = s.isSymmetric(root);
//        System.out.println(res+ "\tfalse");

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = null;
        root.right.left = null;
        root.right.right = new TreeNode(3);

        res = s.isSymmetric(root);
        System.out.println(res+ "\ttrue");
//
//        root = new TreeNode(1);
//        root.left = new TreeNode(2);
//
//        res = s.isSymmetric(root);
//        System.out.println(res+ "\tfalse");
//
//        root = new TreeNode(1);
//
//        res = s.isSymmetric(root);
//        System.out.println(res+ "\ttrue");
//
//        root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//
//        res = s.isSymmetric(root);
//        System.out.println(res+ "\tfalse");
    }
}
