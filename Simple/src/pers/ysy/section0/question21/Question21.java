package pers.ysy.section0.question21;

import java.util.List;

/**
 * @author ysy
 * @date 2021/9/30
 */
public class Question21 {
	public static void main(String[] args) {
		Solution01 s = new Solution01();
		ListNode l1, l2, res;
		List<Integer> list;

		l1 = ListNodeUtil.arrToListNode(new int[]{1, 2, 4});
		l2 = ListNodeUtil.arrToListNode(new int[]{1, 3, 4});
		res = s.mergeTwoLists(l1, l2);
		list = ListNodeUtil.listNodeToList(res);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
	}
}
