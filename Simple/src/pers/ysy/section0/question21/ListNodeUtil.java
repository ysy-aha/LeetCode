package pers.ysy.section0.question21;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ysy
 * @date 2021/9/30
 */
public class ListNodeUtil {
	public static ListNode arrToListNode(int[] arr){
		ListNode res = new ListNode(arr[0]);
		ListNode temp = res;
		for(int i=1; i<arr.length; i++){
			temp.next = new ListNode(arr[i]);
			temp = temp.next;
		}
		return res;
	}

	public static List listNodeToList(ListNode node){
		List<Integer> list = new ArrayList<>();
		while(node!=null){
			list.add(node.val);
			node = node.next;
		}
		return list;
	}
}
