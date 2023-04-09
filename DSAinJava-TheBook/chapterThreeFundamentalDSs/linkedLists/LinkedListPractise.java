package linkedLists;

public class LinkedListPractise<T> {
	public static class Node<T> {
		private T element;
		private Node<T> next;

		Node(T t, Node<T> n) {
			element = t;
			next = n;
		}

		public T getElement() {
			return element;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> n) {
			next = n;
		}
	}

	private Node<T> head = null;
	private Node<T> tail = null;
	private int size = 0;

	LinkedListPractise() {
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public T first() {
		return head.getElement();
	}

	public T last() {
		return tail.getElement();
	}

	public void addHead(T t) {
		Node<T> newHead = new Node<>(t, head);
		head = newHead;

		if (isEmpty()) {
			tail = newHead;
		}

		size++;
	}

	public void addTail(T t) {
		Node<T> newTail = new Node<>(t, null);
		if (isEmpty()) {
			head = newTail;
		} else {
			tail.setNext(newTail);
		}

		tail = newTail;
		size++;
	}
}
