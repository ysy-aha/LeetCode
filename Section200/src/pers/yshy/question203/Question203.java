package pers.yshy.question203;

/**
 * 203. 移除链表元素
 *
 * @author ysy
 * @date 2021/1/27
 * @package pers.yshy.question203
 **/
public class Question203 {
    public static void main(String[] args) {
        Solution01 s = new Solution01();
        ListNode res = null;

        res = s.removeElements(createList(new int[]{1, 2, 6, 3, 4, 5, 6}), 6);
        while (res != null) {
            System.out.print(res.val + "\t");
            res = res.next;
        }
        System.out.println();

        res = s.removeElements(createList(new int[]{6,6,61, 2, 6, 3, 4, 5, 6}), 6);
        while (res != null) {
            System.out.print(res.val + "\t");
            res = res.next;
        }
        System.out.println();

        res = s.removeElements(createList(new int[]{6,6}), 6);
        while (res != null) {
            System.out.print(res.val + "\t");
            res = res.next;
        }
        System.out.println();

        res = s.removeElements(null, 6);
        while (res != null) {
            System.out.print(res.val + "\t");
            res = res.next;
        }
        System.out.println();

        res = s.removeElements(createList(new int[]{1,2,2,1}), 2);
        while (res != null) {
            System.out.print(res.val + "\t");
            res = res.next;
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
