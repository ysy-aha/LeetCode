package pers.yshy.simple.question141;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 创建一个队列，循环，将链表节点依次放进去，如果存在相同的节点，返回true
 *
 * 执行用时：331 ms, 在所有 Java 提交中击败了10.38%的用户
 * 内存消耗：38.5 MB, 在所有 Java 提交中击败了81.29%的用户
 *
 * @author ysy
 * @date 2020/12/30
 * @package pers.yshy.simple.question141
 **/
public class Solution01 {
    public boolean hasCycle(ListNode head) {
        if (head == null){
            return false;
        }
        Queue<ListNode> queue = new LinkedList<>();
        while(head.next != null){
            if(queue.contains(head)){
                return true;
            } else{
                queue.offer(head);
                head = head.next;
            }
        }
        return false;
    }
}
