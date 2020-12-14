package pers.yshy.simple.question617;

/**
 * 617. 合并二叉树
 *
 * @Author:ysy
 * @Date:2020/12/9
 * @Package:pers.yshy.simple.question617
 **/
public class Question617 {

    public static void main(String[] args) {
        Solution01 s = new Solution01();

        // 第一棵树
        TreeNode t11 = new TreeNode(5);
        TreeNode t12 = new TreeNode(3);
        t12.left = t11;
        TreeNode t13 = new TreeNode(1);
        t13.left = t12;
        TreeNode t14 = new TreeNode(2);
        t13.right = t14;
        // 第二棵树
        TreeNode t21 = new TreeNode(4);
        TreeNode t22 = new TreeNode(1);
        t22.right = t21;
        TreeNode t23 = new TreeNode(7);
        TreeNode t24 = new TreeNode(3);
        t24.right = t23;
        TreeNode t25 = new TreeNode(2);
        t25.left = t22;
        t25.right = t24;

        TreeNode result = s.mergeTrees(t13, t25);

        printTree(result);
        System.out.println();
    }

    private static void printTree(TreeNode t) {
        if (t == null) {
            System.out.print(null + "\t");
            return;
        }
        System.out.print(t.val + "\t");
        if (t.left != null || t.right != null) {
            printTree(t.left);
        }
        if (t.right != null) {
            printTree(t.right);
        }
    }
}
