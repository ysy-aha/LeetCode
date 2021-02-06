package pers.yshy.question278;

/**
 * 二分查找法
 *
 * 执行用时：17 ms, 在所有 Java 提交中击败了40.12%的用户
 * 内存消耗：35.2 MB, 在所有 Java 提交中击败了54.40%的用户
 *
 * @author ysy
 * @date 2021/2/6
 * @package pers.yshy.question278
 **/
public class Solution01 {
    public int firstBadVersion(int n) {
        if (isBadVersion(1)) {
            return 1;
        }
        int left = 1, right = n, middle = 0;
        while (true) {
            middle = left + (right - left) / 2;
            if (middle == left) {
                break;
            }
            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle;
            }
        }
        while (left < right) {
            if (isBadVersion(left + 1)) {
                break;
            }
            left++;
        }
        return left + 1;
    }

    private static boolean isBadVersion(int n) {
        return n > 1702766718;
    }
}
