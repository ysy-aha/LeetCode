package pers.yshy.easy.q000136;

public class Q000136 {
    public static void main(String[] args) {
        // 调用
        Q000136 q000136 = new Q000136();
        int[] nums = new int[]{1, 2, 3, 2, 1};
        System.out.println(q000136.singleNumber(nums));
    }

    /**
     * 常见的解决方法：
     *  1. 双循环，一个一个的比较，时间复杂度O(n^2)
     *  2. 用HashMap，时间复杂度O(n)
     *  3. 排序，然后比较，时间复杂度O(nlogn)
     *  4. 异或，时间复杂度O(n)
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        // 异或运算
        int result = 0;
        // 遍历数组
        for (int i = 0; i < nums.length; i++) {
            // 将数组中的每一个元素异或
            result ^= nums[i];
        }
        // 返回异或结果
        return result;
    }
}
