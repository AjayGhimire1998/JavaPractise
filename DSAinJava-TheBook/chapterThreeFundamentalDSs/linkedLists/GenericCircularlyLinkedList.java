package linkedLists;

import java.util.ArrayList;

public class GenericCircularlyLinkedList<T> {
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

		void setNext(Node<T> n) {
			next = n;
		}
	}

	// instances variables of the CIrcular Linked List
	private Node<T> tail = null; // storing tail but not head
	private int size = 0; // number of the nodes in the list

	GenericCircularlyLinkedList() { // contructs an empty list

	}

	int getSize() { // returns the number of nodes in the list
		return size;
	}

	Node<T> getTail() { // returns the tail reference of the list
		return tail;
	}

	boolean isEmpty() { // returns true if the size of the list is zero
		return size == 0;
	}

	T first() { // returns the first element in the list
		if (isEmpty())
			return null;
		return tail.getNext().getElement(); // head basically is the next node of the tail
	}

	T last() { // returns the last element in the list
		if (isEmpty())
			return null;
		return tail.getElement();
	}

	// update methods

	void rotate() { // rotate the first element to the back of the list   
		if (tail != null) { // if empty, do nothing
			tail = tail.getNext(); // if not empty, the old head becomes the new tail
		}
	}

	/**
	 * Consider the implementation of CircularlyLinkedList.addFirst, in Code
	 * Fragment 3.16. The else body at lines 39 and 40 of that method relies on a
	 * locally declared variable, newest. Redesign that clause to avoid use of any
	 * local variable.
	 * 
	 * @param t
	 */
	void addFirst(T t) { // adds element t to the front of the list
		if (isEmpty()) {
			tail = new Node<>(t, null);
			tail.setNext(tail); // link to itself circularly
		} else {

			tail.setNext(new Node<>(t, tail.getNext())); // add the new node with next to be the next of tail and set
															// the next of tail to
			// be the new node
			tail = tail.getNext();
		}
		size++;
	}

	void addLast(T t) { // adds the element t to the end of the list
		addFirst(t); // insert the new element at the front of the list
		tail = tail.getNext(); // now new element becomes the tail
		size++;

	}

	T removeFirst() { // removes and returns the first element
		if (isEmpty()) // nothing to remove
			return null;
		Node<T> head = tail.getNext();

		if (head == tail) { // must be the only node left
			tail = null;
		} else {
			tail.setNext(head.getNext()); // removes "head" fromt the list
			size--;
		}
		return head.getElement();
	}

	T removeLast() {
		if (isEmpty()) {
			return null;
		}

		Node<T> current = tail.getNext();
		Node<T> prev = tail;

		while (current != tail) {

			prev = current;
			current = current.getNext();
		}

		prev.setNext(tail);
		size--;
		return prev.getElement();

	}

	ArrayList<T> toArray() {
		ArrayList<T> arrayList = new ArrayList<>();
		Node<T> current = tail.getNext();
		do {
			arrayList.add(current.getElement());
			current = current.getNext();
		} while (current != tail);
		arrayList.add(tail.getElement());
		return arrayList;
	}

	public static void main(String[] args) {
		GenericCircularlyLinkedList<Integer> list = new GenericCircularlyLinkedList<>();

		list.addFirst(13);
		list.addFirst(1);
		list.addLast(12);

		System.out.println(list.toArray());
		list.rotate();
		System.out.println(list.toArray());

	}

}
