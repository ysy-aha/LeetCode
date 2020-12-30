package pers.yshy.simple.question141;

/**
 * 循环链表，设置两个指针，一个每次指向下一个，一个每次指向下下个，如果是闭环，两个指针会碰到一起
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.4 MB, 在所有 Java 提交中击败了86.10%的用户
 *
 * @author ysy
 * @date 2020/12/30
 * @package pers.yshy.simple.question141
 **/
public class Solution02 {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return false;
        }
        ListNode pointer1 = head.next;
        ListNode pointer2 = pointer1.next;
        while(pointer1 != null && pointer2 != null){
            pointer1 = pointer1.next;
            if(pointer2.next == null){
                return false;
            }
            pointer2 = pointer2.next.next;
            if(pointer1 == pointer2){
                return true;
            }
        }
        return false;
    }
}
