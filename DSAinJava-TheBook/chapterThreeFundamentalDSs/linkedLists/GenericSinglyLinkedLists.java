package linkedLists;

import java.util.ArrayList;

public class GenericSinglyLinkedLists<T> implements Cloneable {
	private static class Node<T> {
		private T element;
		private Node<T> next;

		Node(T e, Node<T> n) {
			element = e;
			next = n;
		}

		T getElement() {
			return element;
		}

		Node<T> getNext() {
			return next;
		}

		void setNext(Node<T> node) {
			next = node;
		}
	}

	private Node<T> head = null;
	private Node<T> tail = null;
	private int size = 0;

	GenericSinglyLinkedLists() {
	}

	// access methods

	/**
	 * Give an implementation of the size( ) method for the SingularlyLinkedList
	 * class, assuming that we did not maintain size as an instance variable.
	 * 
	 * @return
	 */
	int size() {
//		return size;
		int count = 0;
		Node<T> curr = head;
		while (curr != null) {
			count++;
			curr = curr.getNext();
		}
		return count;
	}

	boolean isEmpty() {
		return size == 0;
	}

	T first() {
		if (isEmpty())
			return null;
		return head.getElement();
	}

	T last() {
		if (isEmpty())
			return null;
		return tail.getElement();
	}

	void addFirst(T e) {
		head = new Node<>(e, head);
		if (size == 0) {
			tail = head;
		}
		size++;
	}

	void addLast(T e) {
		Node<T> newestNode = new Node<>(e, null);
		if (isEmpty()) {
			head = newestNode;
		} else {
			tail.setNext(newestNode);
		}

		tail = newestNode;
		size++;
	}

	T removeFirst() {
		if (isEmpty())
			return null;
		T answer = head.getElement();
		head = head.getNext();
		size--;

//		if (isEmpty())
//			tail = null;

		return answer;
	}

	void removeLast() {
		if (isEmpty()) {
			head = null;
		}
		Node<T> current = head;
		Node<T> prev = null;

		while (current.getNext() != null) {
			prev = current;
			current = current.getNext();
		}
		prev.setNext(null);
	}

	Node<T> find(T e) {
		if (isEmpty()) {
			return null;
		}

		Node<T> current = head;
		while (current != null) {
			if (current.getElement() == e) {
				return current;

			}
			current = current.getNext();
		}
		return null;
	}

	/**
	 * Give an algorithm for finding the second-to-last node in a singly linked list
	 * in which the last node is indicated by a null next reference.
	 * 
	 * @return
	 */
	Node<T> findSecondLast() {
		if (isEmpty()) {
			return null;
		}

		Node<T> current = head;
		Node<T> result = head.getNext();
		while (current != null) {
			if (current.getNext() == tail) {
				result = current;

			}
			current = current.getNext();
		}
		return result;
	}

	void rotate() {
		if (isEmpty() || head.getNext() == null) {
			return;
		}
		Node<T> oldHead = head;
		head = oldHead.getNext();
		tail.setNext(oldHead);
		oldHead.setNext(null);
		tail = oldHead;
	}

	ArrayList<T> toArray() {
		ArrayList<T> arrayList = new ArrayList<>();
		Node<T> current = head;
		while (current != null) {
			arrayList.add(current.getElement());
			current = current.getNext();
		}
		return arrayList;
	}

	// equivalence testing the linked list
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;

		GenericSinglyLinkedLists<T> other = (GenericSinglyLinkedLists) o; // use nonparamaterised type
		if (size() != other.size())
			return false;

		Node walkA = head; // traverse the primary list
		Node walkB = other.head; // traverse the secondary list

		while (walkA != null) {
			if (!walkA.getElement().equals(walkB.getElement())) {
				return false;
			}
			walkA = walkA.getNext();
			walkB = walkB.getNext();

		}
		return true;
	}

	// cloning of single linkedList
	public GenericSinglyLinkedLists<T> clone() throws CloneNotSupportedException {
		// always use inherited Object.clone() to create the initial copy
		GenericSinglyLinkedLists<T> other = (GenericSinglyLinkedLists<T>) super.clone(); // safe cast
		if (size() > 0) { // we need independent chain of nodes
			other.head = new Node<>(head.getElement(), null);
			Node<T> walk = head.getNext(); // walk through remainder of the original list
			Node<T> otherTail = other.head; // remember most recently created node
			while (walk != null) { // make a new node storing same element
				Node<T> newest = new Node<>(walk.getElement(), null);
				otherTail.setNext(newest); // link previous node to this one
				otherTail = newest;
				walk = walk.getNext();
			}
		}
		return other;
	}

	/**
	 * Describe an algorithm for concatenating two singly linked lists L and M, into
	 * a single list L′ that contains all the nodes of L followed by all the nodes
	 * of M.
	 * 
	 * @param list
	 * @return
	 */
	public GenericSinglyLinkedLists<T> concat(GenericSinglyLinkedLists<T> other) {
		GenericSinglyLinkedLists<T> result = new GenericSinglyLinkedLists<T>();

		Node<T> thisCurr = head;
		while (thisCurr != null) {
			result.addLast(thisCurr.element);
			thisCurr = thisCurr.getNext();
		}

		Node<T> otherCurr = other.head;
		while (otherCurr != null) {
			result.addLast(otherCurr.element);
			otherCurr = otherCurr.getNext();
		}
		return result;

	}

	/**
	 * Describe in detail how to swap two nodes x and y (and not just their
	 * contents) in a singly linked list L given references only to x and y. Repeat
	 * this exercise for the case when L is a doubly linked list. Which algorithm
	 * takes more time?
	 * 
	 * @param x
	 * @param y
	 */
	public void swapNodes(Node<T> x, Node<T> y) {

		if (x == head) {
			swapHeadWithOtherNode(y);
			return;
		}

		if (y == head) {
			swapHeadWithOtherNode(x);
			return;
		}

		Node<T> prev_x = getPrev(x);
		Node<T> prev_y = getPrev(y);

		if (x.getNext() == y) {
			swapAdjacents(x, y);
			return;

		}
		Node<T> tempAfterX = x.getNext();
		Node<T> tempAfterY = y.getNext();
		prev_x.setNext(y);
		y.setNext(tempAfterX);
		prev_y.setNext(x);
		x.setNext(tempAfterY);

	}

	public void swapHeadAndTail() {
		Node<T> prevTail = getPrev(tail);

		Node<T> tempHead = head;
		Node<T> tempAfterHead = head.getNext();
		head = tail;
		head.setNext(tempAfterHead);

		prevTail.setNext(tempHead);
		tail = tempHead;
		tail.setNext(null);
	}

	public void swapHeadWithOtherNode(Node<T> other) {
		if (other == tail) {
			swapHeadAndTail();
			return;
		}

		if (other == null) {
			System.err.println("It is null");
			return;
		}

		Node<T> tempHead = head;
		Node<T> tempAfterHead = head.getNext();
		Node<T> tempAfterOther = other.getNext();
		Node<T> prevOther = getPrev(other);

		head = other;
		head.setNext(tempAfterHead);

		prevOther.setNext(tempHead);
		tempHead.setNext(tempAfterOther);
	}

	public void swapAdjacents(Node<T> x, Node<T> y) {
		if (x == head && y == head.getNext()) {
			x.setNext(y.getNext());
			y.setNext(x);
			head = y;
			return;
		}

		if (x == getPrev(y) && y == tail) {
			Node<T> prevX = getPrev(x);
			prevX.setNext(y);
			y.setNext(x);
			x.setNext(null);
			return;
		}

		Node<T> prevX = getPrev(x);
		Node<T> prevY = getPrev(y);

		prevX.setNext(y);
		prevY.setNext(y.getNext());
		y.setNext(prevY);
	}

	public Node<T> getPrev(Node<T> node) {
		if (head == null) {
			return null;
		}
		Node<T> curr = head;
		while (curr != null) {
			if (curr.getNext() == node) {
				return curr;
			}
			curr = curr.getNext();
		}
		return null;
	}

//	public void reverseList() {
//
//	}

	public static void main(String[] args) {
		GenericSinglyLinkedLists<Integer> list = new GenericSinglyLinkedLists<>();
		list.addFirst(1);
		list.addLast(2);
		System.out.println(list.toArray());
//		list.swapHeadAndTail();
		System.out.println(list.toArray());

		GenericSinglyLinkedLists<Integer> list2 = new GenericSinglyLinkedLists<>();
		list2.addFirst(3);
		list2.addLast(4);

		list2.addLast(5);
		list2.addLast(6);
		list2.addLast(7);
//		System.out.println(list2.find(12));
		System.out.println(list2.toArray());
		list2.swapHeadAndTail();
		System.out.println(list2.toArray());
		Node<Integer> prevOfList2Tail = list2.getPrev(list2.tail);
		System.out.println(prevOfList2Tail.getElement());
//		list2.rotate();
//		System.out.println(list2.toArray());

//		Node<Integer> secondLast = list2.findSecondLast();
//		System.out.println(secondLast.getElement());
//
//		System.out.println(list.equals(list2));

//		int[] arr = { 1, 2, 3, 4, 5 };
//		int[] copy = arr.clone();
//		int[] arrCopy = System.arraycopy(arr, 0, copy, 0, arr.length);

		GenericSinglyLinkedLists<Integer> concated = list.concat(list2);
		System.out.println(concated.toArray());

		concated.swapAdjacents(concated.head.getNext().getNext().getNext().getNext().getNext(), concated.tail);
		System.out.println("swapping with adjacaent method: " + concated.toArray());

		concated.swapHeadWithOtherNode(
				concated.head.getNext().getNext().getNext().getNext().getNext().getNext().getNext());
		System.out.println("after wswapping head with other:" + concated.toArray());
		concated.swapHeadAndTail();
		System.out.println(concated.toArray());

//		concated.reverseList();
		System.out.println(concated.toArray());

		concated.swapNodes(concated.head.getNext(), concated.head.getNext().getNext().getNext());
		System.out.println("swapping  anything: " + concated.toArray());

	}

}