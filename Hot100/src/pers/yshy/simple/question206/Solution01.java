package pers.yshy.simple.question206;

/**
 * 递归
 * 到最后一个元素的时候返回元素本身，然后在上一级，将上一级的next置为null，将上一级设置为返回值的最后一级
 *
 * 执行用时：19 ms, 在所有 Java 提交中击败了5.57%的用户
 * 内存消耗：38.3 MB, 在所有 Java 提交中击败了64.44%的用户
 *
 * @Author:ysy
 * @Date:2020/12/11
 * @Package:pers.yshy.simple.question206
 **/
public class Solution01 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reverse = reverseList(head.next);
        ListNode temp = reverse;
        while (temp.next != null) {
            temp = temp.next;
        }
        head.next = null;
        temp.next = head;
        return reverse;
    }

}
