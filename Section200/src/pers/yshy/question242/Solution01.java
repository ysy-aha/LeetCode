package pers.yshy.question242;

import java.util.HashMap;
import java.util.Map;

/**
 * 用一个map来存储s的字符和频率 然后与t对比
 *
 * 执行用时：37 ms, 在所有 Java 提交中击败了5.02%的用户
 * 内存消耗：39.4 MB, 在所有 Java 提交中击败了6.14%的用户
 * @author ysy
 * @date 2021/2/2
 * @package pers.yshy.question242
 **/
public class Solution01 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.charAt(i)) || map.get(t.charAt(i)) == 0) {
                return false;
            }
            map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
        }
        return true;
    }
}
