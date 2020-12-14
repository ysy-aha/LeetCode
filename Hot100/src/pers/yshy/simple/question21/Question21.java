package pers.yshy.simple.question21;

/**
 * 21. 合并两个有序链表
 *
 * @Author:ysy
 * @Date:2020/12/14
 * @Package:pers.yshy.simple.question21
 **/
public class Question21 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        ListNode l1 = createList(new int[]{1, 2, 4});
        ListNode l2 = createList(new int[]{1, 3, 4});
        ListNode l3 = s.mergeTwoLists(l1, l2);
        while (l3 != null) {
            System.out.print(l3.val + "\t");
            l3 = l3.next;
        }
        System.out.println();

        l3 = s.mergeTwoLists(new ListNode(), new ListNode());
        while (l3 != null) {
            System.out.print(l3.val + "\t");
            l3 = l3.next;
        }
        System.out.println();

        l3 = s.mergeTwoLists(new ListNode(0), new ListNode(0));
        while (l3 != null) {
            System.out.print(l3.val + "\t");
            l3 = l3.next;
        }
        System.out.println();

        l1 = new ListNode();
        l2 = createList(new int[]{1, 3, 4});
        l3 = s.mergeTwoLists(l1, l2);
        while (l3 != null) {
            System.out.print(l3.val + "\t");
            l3 = l3.next;
        }
        System.out.println();
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
