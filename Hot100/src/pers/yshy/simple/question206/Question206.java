package pers.yshy.simple.question206;

/**
 * 206. 反转链表
 *
 * @Author:ysy
 * @Date:2020/12/9
 * @Package:pers.yshy.simple.question617
 **/
public class Question206 {

    public static void main(String[] args) {
        Solution02 s = new Solution02();
        ListNode node = createList(new int[]{1,2,3,4,5});
        ListNode res = s.reverseList(node);

        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    private static ListNode createList(int[] arr){
        ListNode firstNode = new ListNode(arr[0]);
        ListNode temp = firstNode;
        for(int i=1; i<arr.length; i++){
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return firstNode;
    }
}
