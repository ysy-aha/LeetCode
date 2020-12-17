package pers.yshy.simple.question160;

/**
 * 160. 相交链表
 *
 * @Author:ysy
 * @Date:2020/12/16
 * @Package:pers.yshy.simple.question160
 **/
public class Question160 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        ListNode headA = createList(new int[]{4, 1, 8, 4, 5});
        ListNode headB = createList(new int[]{5, 6, 1, 8, 4, 5});
        ListNode res = s.getIntersectionNode(headA, headB);
        System.out.println(res.val);

        headA = createList(new int[]{2, 6, 4});
        headB = createList(new int[]{1, 5});
        res = s.getIntersectionNode(headA, headB);
        System.out.println(res);
    }

    private static ListNode createList(int[] arr) {
        ListNode firstNode = new ListNode(arr[0]);
        ListNode temp = firstNode;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return firstNode;
    }
}
