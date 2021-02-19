package pers.yshy.question290;

import java.util.HashMap;
import java.util.Map;

/**
 * 设置对应的map，然后一一比对
 *
 * 执行用时：3 ms, 在所有 Java 提交中击败了12.86%的用户
 * 内存消耗：36.5 MB, 在所有 Java 提交中击败了42.22%的用户
 *
 * @author ysy
 * @date 2021/2/19
 * @package pers.yshy.question290
 **/
public class Solution01 {
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null || s == null || pattern.length() == 0 || s.length() == 0){
            return false;
        }
        String[] pArr = pattern.split("");
        String[] sArr = s.split(" ");
        if(pArr.length != sArr.length){
            return false;
        }
        Map<String, String> map = new HashMap<>();
        for(int i=0; i<pArr.length; i++){
            if(map.containsKey(pArr[i]) && !map.get(pArr[i]).equals(sArr[i])){
                return false;
            }
            if(!map.containsKey(pArr[i]) && map.containsValue(sArr[i])){
                return false;
            }
            if(!map.containsKey(pArr[i])){
                map.put(pArr[i], sArr[i]);
            }
        }
        return true;
    }
}
