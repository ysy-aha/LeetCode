package pers.yshy.easy.q000108;

/**
 * @author ysy
 * @since 2022/11/11
 */
public class Q000108 {

    public static void main(String[] args) {
        int[] nums;
        TreeNode treeNode;

        nums = new int[]{-10, -3, 0, 5, 9};
        treeNode = sortedArrayToBST(nums);
        System.out.println("-------");
        nums = new int[]{1, 3};
        treeNode = sortedArrayToBST(nums);
        System.out.println("-------");
    }

    /**
     * 时间：0 ms，击败：100%
     * 内存：41.2 MB，击败：74.10%
     *
     * @param nums
     * @return
     */
    private static TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length);
    }

    private static TreeNode buildTree(int[] nums, int left, int right) {
        if (left >= right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode tree = new TreeNode(nums[mid]);
        tree.left = buildTree(nums, left, mid);
        tree.right = buildTree(nums, mid + 1, right);
        return tree;
    }
}
