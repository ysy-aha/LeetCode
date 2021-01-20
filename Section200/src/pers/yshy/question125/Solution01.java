package pers.yshy.question125;

/**
 * 设置双标签，一个正向，一个倒向
 *
 * 执行用时：4 ms, 在所有 Java 提交中击败了64.11%的用户
 * 内存消耗：38.6 MB, 在所有 Java 提交中击败了44.13%的用户
 *
 * @author ysy
 * @date 2021/1/20
 * @package pers.yshy.question125
 **/
public class Solution01 {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return true;
        }
        int left = 0, right = s.length() - 1;
        s = s.toLowerCase();
        while (left <= right) {
            if (!isStandard(s.charAt(left))) {
                left++;
                continue;
            }
            if (!isStandard(s.charAt(right))) {
                right--;
                continue;
            }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isStandard(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        } else if (c >= 'A' && c <= 'Z') {
            return true;
        } else if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }
}
