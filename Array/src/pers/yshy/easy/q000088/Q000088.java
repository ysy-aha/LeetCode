package pers.yshy.easy.q000088;

import java.util.Arrays;

/**
 * 合并两个有序数组
 *
 * @author ysy
 * @since 2022/11/10
 */
public class Q000088 {

    public static void main(String[] args) {
        int[] nums1;
        int[] nums2;
        int m;
        int n;

        nums1 = new int[]{1, 2, 3, 0, 0, 0};
        m = 3;
        nums2 = new int[]{2, 5, 6};
        n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[]{1};
        m = 1;
        nums2 = new int[]{};
        n = 0;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[]{0};
        m = 0;
        nums2 = new int[]{1};
        n = 1;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    /**
     * 根据测试，是递增数组
     * 双指针：l=m-1，r=m+n-1
     * nums2倒序，l往前移，如果nums1[l]>=nums2[i],nums1[r]=nums1[l],l--,r--;
     * - 如果nums[l]<nums2[i],nums1[r]=nums2[i],r--,i--
     * <p>
     * 时间：0 ms，击败：100%
     * 内存：41.2 MB，击败：79.95%
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m - 1;
        int r = l + n;
        for (int i = n - 1; i >= 0; i--) {
            while (l >= 0) {
                if (nums1[l] < nums2[i]) {
                    break;
                }
                nums1[r] = nums1[l];
                l--;
                r--;
            }
            nums1[r] = nums2[i];
            r--;
        }
    }
}
