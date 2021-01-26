package pers.yshy.question202;

import java.util.HashSet;

/**
 * 看完官方的分析之后，知道了不存在会无限大的值，只会是循环，所以使用 HashSet 存储每一次的值，遇到同样的就直接返回fasle
 *
 * 执行用时：2 ms, 在所有 Java 提交中击败了34.43%的用户
 * 内存消耗：35.8 MB, 在所有 Java 提交中击败了9.29%的用户
 *
 * @author ysy
 * @date 2021/1/26
 * @package pers.yshy.question202
 **/
public class Solution01 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while (n != 1) {
            n = getNext(n);
            if (!set.add(n)) {
                return false;
            }
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
