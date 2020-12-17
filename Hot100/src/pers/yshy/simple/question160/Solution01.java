package pers.yshy.simple.question160;

/**
 * 抄的 辣鸡题目，吃屎吧
 *
 * 执行用时：1 ms, 在所有 Java 提交中击败了99.99%的用户
 * 内存消耗：41 MB, 在所有 Java 提交中击败了89.00%的用户
 *
 * @Author:ysy
 * @Date:2020/12/16
 * @Package:pers.yshy.simple.question160
 **/
public class Solution01 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
