package pers.yshy.simple.question206;

/**
 * 循环将链表转换为数组，然后将数组倒序之后转换为链表
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：38.2 MB, 在所有 Java 提交中击败了79.10%的用户
 *
 * @Author:ysy
 * @Date:2020/12/11
 * @Package:pers.yshy.simple.question206
 **/
public class Solution02 {

    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode reverse = new ListNode(0);
        while (head != null) {
            reverse.val = head.val;
            head = head.next;
            if(head != null){
                ListNode temp = new ListNode(0);
                temp.next = reverse;
                reverse = temp;
            }
        }
        return reverse;
    }

}
