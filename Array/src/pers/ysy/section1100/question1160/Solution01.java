package pers.ysy.section1100.question1160;

/**
 * 将 chars 转换为 stringbuffer，str1
 * 循环 words，嵌套循环字符串，新建一个str2等于str1如果在str2中存在，就删除第一个，如果出现不存在的情况
 *   退出循环，如果全部存在，str1 = str2
 *
 * 执行用时：33 ms, 在所有 Java 提交中击败了34.34%的用户
 * 内存消耗：38.8 MB, 在所有 Java 提交中击败了96.06%的用户
 *
 * @Author ysy
 * @Date 2020/10/27
 **/
public class Solution01 {
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            StringBuffer str = new StringBuffer(chars);
            for (int j = 0; j < words[i].length(); j++) {
                int index = str.indexOf(words[i].charAt(j) + "");
                if (index != -1) {
                    str.delete(index, index + 1);
                } else {
                    break;
                }
                if(j == words[i].length() -1){
                    count = count + words[i].length();
                }
            }
        }
        return count;
    }
}
