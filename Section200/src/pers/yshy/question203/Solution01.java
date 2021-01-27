package pers.yshy.question203;

/**
 * 循环，遇到相同的值就删掉
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了99.62%的用户
 * 内存消耗：39.6 MB, 在所有 Java 提交中击败了23.46%的用户
 *
 * @author ysy
 * @date 2021/1/27
 * @package pers.yshy.question203
 **/
public class Solution01 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode node = head;
        while (node != null && node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
                continue;
            }
            node = node.next;
        }
        return head;
    }
}
