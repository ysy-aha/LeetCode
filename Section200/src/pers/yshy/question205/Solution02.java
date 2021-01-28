package pers.yshy.question205;

import java.util.HashMap;
import java.util.Map;

/**
 * 在solution01的基础上修改，将list改为hashmap
 *
 * 执行用时：14 ms, 在所有 Java 提交中击败了53.80%的用户
 * 内存消耗：38.5 MB, 在所有 Java 提交中击败了46.83%的用户
 *
 * @author ysy
 * @date 2021/1/28
 * @package pers.yshy.question205
 **/
public class Solution02 {
    public boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        if (s != null && t == null || s == null && t != null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))){
                if(!map.containsValue(t.charAt(i))){
                    map.put(s.charAt(i), t.charAt(i));
                    continue;
                }
                return false;
            } else {
                if(map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
