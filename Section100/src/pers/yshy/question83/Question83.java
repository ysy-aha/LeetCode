package pers.yshy.question83;

/**
 * 83. 删除排序链表中的重复元素
 * @author ysy
 * @date 2021/1/14
 * @package pers.yshy.question83
 **/
public class Question83 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        ListNode head = null;

        s.deleteDuplicates(head);
        while(head != null){
            System.out.print(head.val + "\t");
            head = head.next;
        }
        System.out.println();

        head = createList(new int[]{});
        s.deleteDuplicates(head);
        while(head != null){
            System.out.print(head.val + "\t");
            head = head.next;
        }
        System.out.println();

        head = createList(new int[]{1,1,2});
        s.deleteDuplicates(head);
        while(head != null){
            System.out.print(head.val + "\t");
            head = head.next;
        }
        System.out.println();

        head = createList(new int[]{1,1,2,3,3});
        s.deleteDuplicates(head);
        while(head != null){
            System.out.print(head.val + "\t");
            head = head.next;
        }
        System.out.println();

        head = createList(new int[]{1,1,2,3,3,1,2,3,4,5,3,2,1});
        s.deleteDuplicates(head);
        while(head != null){
            System.out.print(head.val + "\t");
            head = head.next;
        }
        System.out.println();
    }

    private static ListNode createList(int[] arr) {
        if(arr.length == 0){
            return new ListNode();
        }
        ListNode firstNode = new ListNode(arr[0]);
        ListNode temp = firstNode;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return firstNode;
    }
}
