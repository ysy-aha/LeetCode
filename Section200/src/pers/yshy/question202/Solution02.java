package pers.yshy.question202;

/**
 * 快慢指针法
 * 将n以及后面的所有的数看作是一个链表，一个指针每次前进一格，一个每次前进两格，如果是循环的话，那两个指针终究会遇到一起
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了99.58%的用户
 * 内存消耗：35.2 MB, 在所有 Java 提交中击败了90.37%的用户
 *
 * @author ysy
 * @date 2021/1/26
 * @package pers.yshy.question202
 **/
public class Solution02 {
    public boolean isHappy(int n) {
        int fast = getNext(getNext(n));
        while (fast != 1) {
            if (fast == n) {
                return false;
            }
            n = getNext(n);
            fast = getNext(getNext(fast));
        }
        return true;
    }

    private int getNext(int n) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            res += temp * temp;
            n = n / 10;
        }
        return res;
    }
}
