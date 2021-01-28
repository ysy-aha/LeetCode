package pers.yshy.question205;

import java.util.HashMap;
import java.util.Map;

/**
 * (抄的)
 * 执行用时：29 ms, 在所有 Java 提交中击败了26.46%的用户
 * 内存消耗：38.5 MB, 在所有 Java 提交中击败了51.41%的用户
 *
 * @author ysy
 * @date 2021/1/28
 * @package pers.yshy.question205
 **/
public class Solution03 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> s2t = new HashMap<Character, Character>();
        Map<Character, Character> t2s = new HashMap<Character, Character>();
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            char x = s.charAt(i), y = t.charAt(i);
            if ((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)) {
                return false;
            }
            s2t.put(x, y);
            t2s.put(y, x);
        }
        return true;
    }
}
