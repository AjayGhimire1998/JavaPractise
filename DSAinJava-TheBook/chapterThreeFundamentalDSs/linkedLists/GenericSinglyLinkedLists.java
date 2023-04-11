package linkedLists;

import java.util.ArrayList;

public class GenericSinglyLinkedLists<T> {
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

	int size() {
		return size;
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

		if (size == 0)
			tail = null;

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

		GenericSinglyLinkedLists other = (GenericSinglyLinkedLists) o; // use nonparamaterised type
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

	public static void main(String[] args) {
		GenericSinglyLinkedLists<Integer> list = new GenericSinglyLinkedLists<>();
		list.addFirst(1);
		list.addLast(10);
//		list.removeLast();
		System.out.println(list.toArray());

		GenericSinglyLinkedLists<Integer> list2 = new GenericSinglyLinkedLists<>();
		list2.addFirst(1);
		list2.addLast(10);
//		list2.addLast(11);
		System.out.println(list2.toArray());

		System.out.println(list.equals(list2));

	}

}
