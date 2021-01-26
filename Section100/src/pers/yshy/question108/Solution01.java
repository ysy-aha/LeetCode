package pers.yshy.question108;

/**
 * 抄的
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.5 MB, 在所有 Java 提交中击败了20.84%的用户
 *
 * @author ysy
 * @date 2021/1/15
 * @package pers.yshy.question108
 **/
public class Solution01 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        // 总是选择中间位置左边的数字作为根节点
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }
}
