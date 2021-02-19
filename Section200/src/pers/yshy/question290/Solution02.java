package pers.yshy.question290;

import java.util.HashMap;
import java.util.Map;

/**
 * 设置对应的map，然后一一比对(改良版)
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了98.77%的用户
 * 内存消耗：36.3 MB, 在所有 Java 提交中击败了80.44%的用户
 *
 * @author ysy
 * @date 2021/2/19
 * @package pers.yshy.question290
 **/
public class Solution02 {
    public boolean wordPattern(String pattern, String s) {
        if (pattern == null || s == null || pattern.length() == 0 || s.length() == 0) {
            return false;
        }
        String[] sArr = s.split(" ");
        if (pattern.length() != sArr.length) {
            return false;
        }
        Map<Object, Integer> map = new HashMap<>();
        for (Integer i = 0; i < pattern.length(); i++) {
            if (map.put(pattern.charAt(i), i) != map.put(sArr[i], i)) {
                return false;
            }
        }
        return true;
    }
}
