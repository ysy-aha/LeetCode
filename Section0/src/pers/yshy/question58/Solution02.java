package pers.yshy.question58;

/**
 * 字符串后面开始，跳过最后的所有的空格，计算有效字符，直到新的空格出现
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：36.5 MB, 在所有 Java 提交中击败了90.65%的用户
 *
 * @author ysy
 * @date 2021/1/13
 * @package pers.yshy.question58
 **/
public class Solution02 {
    public int lengthOfLastWord(String s) {
        if(s == null){
            return 0;
        }
        int count = 0, len = s.length();
        for (int i = len - 1; i >= 0; i--) {
            if(s.charAt(i) == 32){
                if(count == 0){
                    continue;
                }
                break;
            }
            count++;
        }
        return count;
    }
}
