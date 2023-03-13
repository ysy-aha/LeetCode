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
     * 倒循环，最大的放在最后
     * 设置三个标签，a、b、c，a表示nums1的下标，b表示nums2的下标，c表示结果数组的下标
     *
     * 时间 0 ms，击败 100%
     * 内存 41.4 MB，击败 64.29%
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1;
        int b = n - 1;
        int c = m + n - 1;
        while (c >= 0) {
            if (a >= 0 && b >= 0) {
                if (nums1[a] <= nums2[b]) {
                    nums1[c] = nums2[b];
                    b--;
                } else {
                    nums1[c] = nums1[a];
                    a--;
                }
            } else if (a < 0) {
                nums1[c] = nums2[b];
                b--;
            } else {
                nums1[c] = nums1[a];
                a--;
            }
            c--;
        }
    }
}
