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

	public static void main(String[] args) {
		GenericSinglyLinkedLists<Integer> list = new GenericSinglyLinkedLists<>();
		list.addFirst(1);
		list.addLast(10);
		list.removeLast();
		System.out.println(list.toArray());
	}

}
