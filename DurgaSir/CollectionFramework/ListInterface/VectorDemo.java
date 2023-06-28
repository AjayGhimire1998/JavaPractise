package ListInterface;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
//		List<Integer> list = new Vector<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		System.out.println(list);
//
//		list.add(3, 3);
//		System.out.println(list);

		Vector vector = new Vector();
		System.out.println(vector.capacity());

		for (int i = 1; i <= 10; i++) {
			vector.addElement(i);
		}

		System.out.println(vector.capacity()); // 10

		vector.add('S');

		System.out.println(vector);
		System.out.println(vector.capacity()); // 20

	}

//	/**	Definition for singly-linked list.*/

//	public class ListNode {
//		int val;
//		ListNode next;
//
//		ListNode() {
//		}
//
//		ListNode(int val) {
//			this.val = val;
//		}
//
//		ListNode(int val, ListNode next) {
//			this.val = val;
//			this.next = next;
//		}
//	}
//
//	public ListNode deleteDuplicates(ListNode head) {
//		ListNode curr = head;
//
//		while (curr.next != null) {
//			if (curr.val == curr.next.val) {
//				curr.next = curr.next.next;
//			}
//			curr = curr.next;
//		}
//		return curr;
//	}

}
