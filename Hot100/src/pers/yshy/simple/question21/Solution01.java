package pers.yshy.simple.question21;

/**
 * 先用两个数 x,y 作为两个链表的下标记录，通过循环，比较 x、y 下标数的大小，然后将小的添加进新链表，下标加一
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了41.06%的用户
 * 内存消耗：37.9 MB, 在所有 Java 提交中击败了75.32%的用户
 *
 * @Author:ysy
 * @Date:2020/12/14
 * @Package:pers.yshy.simple.question21
 **/
public class Solution01 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null){
            return l1 == null ? (l2 == null ? null : l2) : l1;
        }
        int x = 0, y = 0;
        ListNode l3 = null;
        if (l1.val < l2.val) {
            l3 = new ListNode(l1.val);
            x = 1;
            l1 = l1.next;
        } else {
            l3 = new ListNode(l2.val);
            y = 1;
            l2 = l2.next;
        }
        ListNode temp = l3;
        while (true) {
            if (l1 == null) {
                temp.next = l2;
                break;
            } else if (l2 == null) {
                temp.next = l1;
                break;
            } else if (l1 == null && l2 == null) {
                break;
            }
            if (l1.val < l2.val) {
                temp.next = new ListNode(l1.val);
                l1 = l1.next;
                x++;
            } else {
                temp.next = new ListNode(l2.val);
                l2 = l2.next;
                y++;
            }
            temp = temp.next;
        }
        return l3;
    }
}
