package pers.yshy.question108;

/**
 * 108. 将有序数组转换为二叉搜索树
 * @author ysy
 * @date 2021/1/15
 * @package pers.yshy.question108
 **/
public class Question108 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        TreeNode res = null;

        res = s.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        printTree(res);
    }

    private static void printTree(TreeNode t) {
        if (t == null) {
            System.out.print(null + "\t");
            return;
        }
        System.out.print(t.val + "\t");
        printTree(t.left);
        printTree(t.right);
    }
}
