package pers.yshy.question83;

import java.util.HashSet;
import java.util.Set;

/**
 * 执行用时：1 ms, 在所有 Java 提交中击败了37.45%的用户
 * 内存消耗：38 MB, 在所有 Java 提交中击败了27.69%的用户
 *
 * @author ysy
 * @date 2021/1/14
 * @package pers.yshy.question83
 **/
public class Solution01 {
    public ListNode deleteDuplicates(ListNode head) {
        Set set = new HashSet();
        ListNode temp = head;
        ListNode before = null;
        while(temp != null){
            if(!set.add(temp.val)){
                before.next = temp.next;
                temp = temp.next;
                continue;
            }
            before = temp;
            temp = temp.next;
        }
        return head;
    }
}
