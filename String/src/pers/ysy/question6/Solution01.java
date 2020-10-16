package pers.ysy.question6;

/**
 * 通过计算获取改变后的每个字符的位置
 *
 * 执行用时：4 ms, 在所有 Java 提交中击败了87.89%的用户
 * 内存消耗：38.3 MB, 在所有 Java 提交中击败了99.94%的用户
 * @Author ysy
 * @Date 2020/10/15
 **/
public class Solution01 {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        // 返回字符串
        StringBuffer str = new StringBuffer();
        // 按行数循环
        for (int i = 0; i < numRows; i++) {
            // 数组下标
            int flag = i;
            while (flag < s.length()) {
                // 第一行和最后一行是一个规律，中间行数是一个规律
                if (i == 0 || i == numRows - 1) {
                    str.append(s.charAt(flag));
                } else {
                    // 中间行数如果存在，是需要一次获取两个字符的
                    str.append(s.charAt(flag));
                    int flag2 = flag + (2 * (numRows - i - 1));
                    if (flag2 < s.length()) {
                        str.append(s.charAt(flag2));
                    }
                }
                flag += 2 * numRows - 2;
            }
        }
        return str.toString();
    }
}
