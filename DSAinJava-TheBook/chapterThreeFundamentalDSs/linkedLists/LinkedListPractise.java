package linkedLists;

import java.util.ArrayList;

//

//import java.util.ArrayList;
//
//public class LinkedListPractise<T> {
//	public static class Node<T> {
//		private T element;
//		private Node<T> next;
//
//		Node(T t, Node<T> n) {
//			element = t;
//			next = n;
//		}
//
//		public T getElement() {
//			return element;
//		}
//
//		public Node<T> getNext() {
//			return next;
//		}
//
//		public void setNext(Node<T> n) {
//			next = n;
//		}
//	}
//
//	private Node<T> head = null;
//	private Node<T> tail = null;
//	private int size = 0;
//
//	LinkedListPractise() {
//	}
//
//	public int getSize() {
//		return size;
//	}
//
//	public boolean isEmpty() {
//		return size == 0;
//	}
//
//	public T first() {
//		return head.getElement();
//	}
//
//	public T last() {
//		return tail.getElement();
//	}
//
//	public void addHead(T t) {
//		Node<T> newHead = new Node<>(t, head);
//		head = newHead;
//
//		if (isEmpty()) {
//			tail = newHead;
//		}
//
//		size++;
//	}
//
//	public void addTail(T t) {
//		Node<T> newTail = new Node<>(t, null);
//		if (isEmpty()) {
//			head = newTail;
//		} else {
//			tail.setNext(newTail);
//		}
//
//		tail = newTail;
//		size++;
//	}
//
//	public T removeHead() {
//		if (isEmpty()) {
//			return null;
//		}
//		T toBeRemovedHead = head.getElement();
//		head = head.getNext();
//		size--;
//		if (isEmpty()) {
//			tail = null;
//		}
//		return toBeRemovedHead;
//	}
//
//	public void removeTail() {
//		if (isEmpty()) {
//			head = null;
//
//		}
//		Node<T> current = head;
//		Node<T> prev = null;
//		while (current.getNext() != null) {
//			prev = current;
//			current = current.getNext();
//		}
//		prev.setNext(null);
//
//	}
//
//	public ArrayList<T> toArray() {
//		ArrayList<T> arrayList = new ArrayList<>();
//		Node<T> currentNode = head;
//
//		while (currentNode != null) {
//			arrayList.add(currentNode.getElement());
//			currentNode = currentNode.getNext();
//		}
//		return arrayList;
//	}
//
//	public static void main(String[] args) {
//		Node<Integer> tailNode = new Node<Integer>(9, null);
//		Node<Integer> headNode = new Node<Integer>(1, tailNode);
////		System.out.println(headNode.getNext().getElement());
//
//		LinkedListPractise<Integer> list = new LinkedListPractise<>();
//		list.addHead(headNode.getElement());
//		list.addTail(tailNode.getElement());
//		list.addTail(10);
////		list.removeHead();
////		System.out.println(list.removeTail());
//		list.removeTail();
//		System.out.println(list.toArray());
////		System.out.println(list.getSize());
////		System.out.println(list.last());
//
//	}
//}

public class LinkedListPractise<T> {
	public static class Node<T> {
		private T element;
		private Node<T> next;

		Node(T t, Node<T> n) {
			element = t;
			next = n;
		}

		T getElement() {
			return element;
		}

		Node<T> getNext() {
			return next;
		}

		void setNext(Node<T> n) {
			next = n;
		}
	}

	private Node<T> head = null;
	private Node<T> tail = null;
	private int size = 0;

	LinkedListPractise() {

	}

	int getSize() {
		return size;
	}

	boolean isEmpty() {
		return size == 0;
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

	T getFirst() {
		return head.getElement();
	}

	T getLast() {
		return tail.getElement();
	}

	void addHead(T t) {
		head = new Node<>(t, head);
		if (isEmpty()) {
			tail = head;
		}
		size++;
	}

	void removeHead() {
		if (isEmpty()) {
			head = null;
			tail = null;
		}

		head = head.getNext();
		size--;
	}

	void addTail(T t) {
		Node<T> newTail = new Node<>(t, null);

		if (isEmpty()) {
			head = newTail;
		} else {
			tail.setNext(newTail);
		}
		tail = newTail;
		size++;
	}

	void removeTail() {
		if (isEmpty()) {
			head = null;
			tail = null;
		}

		Node<T> current = head;
		Node<T> prev = null;

		while (current.getNext() != null) {
			prev = current;
			current = current.getNext();
		}
		prev.setNext(null);
		size--;
	}

	public static void main(String[] args) {
		LinkedListPractise<Integer> list = new LinkedListPractise<>();
		list.addHead(1);
		list.addHead(2);
		list.removeHead();
		list.addTail(10);
		list.addTail(11);
		list.removeTail();

		System.out.println(list.getSize());
		System.out.println(list.toArray());
	}

}
