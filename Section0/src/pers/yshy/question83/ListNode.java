package pers.yshy.question83;

/**
 * 链表对象
 *
 * @author ysy
 * @date 2021/1/14
 * @package pers.yshy.question83
 **/
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
