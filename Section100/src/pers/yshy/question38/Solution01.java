package pers.yshy.question38;

/**
 * 线性的循环
 *
 * 执行用时：28 ms, 在所有 Java 提交中击败了8.68%的用户
 * 内存消耗：39.2 MB, 在所有 Java 提交中击败了5.20%的用户
 *
 * @author ysy
 * @date 2021/1/12
 * @package pers.yshy.question38
 **/
public class Solution01 {
    public String countAndSay(int n) {
        String str = "1";
        for (int i = 2; i <= n; i++) {
            char temp = str.charAt(0);
            StringBuilder s = new StringBuilder();
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (temp != str.charAt(j)) {
                    s.append(count + String.valueOf(temp));
                    temp = str.charAt(j);
                    count = 1;
                } else {
                    count++;
                }
            }
            s.append(count + String.valueOf(temp));
            str = s.toString();
        }
        return str;
    }
}
