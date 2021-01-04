package pers.yshy.simple.question234;

/**
 * 234. 回文链表
 * @author ysy
 * @date 2020/12/31
 * @package pers.yshy.simple.question234
 **/
public class Question234 {

    public static void main(String[] args) {
        Solution01 s = new Solution01();
        int[] arr = null;
        boolean res = false;

        arr = new int[]{1,2};
        res = s.isPalindrome(createList(arr));
        System.out.println(res);

        arr = new int[]{1,2,2,1};
        res = s.isPalindrome(createList(arr));
        System.out.println(res);

        arr = new int[]{1};
        res = s.isPalindrome(createList(arr));
        System.out.println(res);

        arr = new int[]{1,2,3,2,1};
        res = s.isPalindrome(createList(arr));
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
