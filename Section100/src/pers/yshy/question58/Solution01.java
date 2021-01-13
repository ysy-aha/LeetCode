package pers.yshy.question58;

/**
 * 通过空格切割字符串，从后往前计算，第一个非空字符串的长度
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了38.53%的用户
 * 内存消耗：37 MB, 在所有 Java 提交中击败了21.14%的用户
 *
 * @author ysy
 * @date 2021/1/13
 * @package pers.yshy.question58
 **/
public class Solution01 {
    public int lengthOfLastWord(String s) {
        if(s == null){
            return 0;
        }
        String[] arr = s.split(" ");
        int count = 0, len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            if (arr[i].length() > 0){
                return arr[i].length();
            }
        }
        return 0;
    }
}
