package pers.yshy.question237;

/**
 * 没想到 抄的
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：37.8 MB, 在所有 Java 提交中击败了74.55%的用户
 *
 * @author ysy
 * @date 2021/2/2
 * @package pers.yshy.question237
 **/
public class Solution01 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
