package pers.yshy.question67;

/**
 * 从后往前算，如果字符都为1，新字符为0，标记值为1
 *
 * 执行用时：3 ms, 在所有 Java 提交中击败了53.80%的用户
 * 内存消耗：38.6 MB, 在所有 Java 提交中击败了20.41%的用户
 *
 * @author ysy
 * @date 2021/1/13
 * @package pers.yshy.question67
 **/
public class Solution01 {
    public String addBinary(String a, String b) {
        int flag = 0, lenA = a.length() - 1, lenB = b.length() - 1;
        StringBuilder str = new StringBuilder(lenA > lenB ? lenA : lenB);
        while (lenA >= 0 || lenB >= 0) {
            char ca = '0', cb = '0';
            if (lenA >= 0) {
                ca = a.charAt(lenA);
            }
            if (lenB >= 0) {
                cb = b.charAt(lenB);
            }
            int num = ca + cb;
            if (num == 96) {
                str.insert(0, flag);
                flag = 0;
            } else if (num == 97) {
                if (flag == 1) {
                    str.insert(0, "0");
                    flag = 1;
                } else {
                    str.insert(0, "1");
                    flag = 0;
                }
            } else if (num == 98) {
                str.insert(0, flag);
                flag = 1;
            }
            lenA--;
            lenB--;
        }
        if (flag == 1) {
            str.insert(0, "1");
        }
        return str.toString();
    }
}
