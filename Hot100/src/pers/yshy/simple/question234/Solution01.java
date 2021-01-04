package pers.yshy.simple.question234;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个数组，遍历链表，将值存入数组，然后循环数组，判断数组是否是回文数组
 *
 * 执行用时：4 ms, 在所有 Java 提交中击败了31.60%的用户
 * 内存消耗：42.2 MB, 在所有 Java 提交中击败了31.60%的用户
 *
 * @author ysy
 * @date 2020/12/31
 * @package pers.yshy.simple.question234
 **/
public class Solution01 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int left = 0, right = list.size()-1;
        while(left < right){
            if(!list.get(left).equals(list.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
