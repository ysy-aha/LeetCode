package pers.ysy.section0.question21;

/**
 * 判断，某一个链表为null，直接返回另一个链表
 * 判断两个链表的首个值的大小，将l1替换成较小的那个
 * 循环l2链表，如果l1当前节点的值大于l2当前节点的值，创建一个新的节点存储l1当前节点值，将l1的值换成l2的值
 * 新节点的下一个节点时l1当前节点的下一个节点，然后将l1当前节点的下一节点替换为新节点，l1节点下移一位，l2节点下移一位；
 * 如果l1当前节点值小于或等于l2当前节点，l1节点向下移一位
 * 注意：当l1后面没有节点时，直接将l2剩余的节点接到l1后面
 *
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：37.9 MB, 在所有 Java 提交中击败了20.05%的用户
 *
 * @author ysy
 * @date 2021/9/30
 */
public class Solution01 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		}
		if(l1.val > l2.val){
			ListNode temp = l1;
			l1 = l2;
			l2 = temp;
		}
		ListNode node = l1;
		while (l2 != null) {
			if(node.val > l2.val){
				ListNode temp = new ListNode(node.val);
				node.val = l2.val;
				temp.next = node.next;
				node.next = temp;
				l2 = l2.next;
			}
			if(node.next == null){
				node.next = l2;
				break;
			}
			node = node.next;
		}
		return l1;
	}
}
