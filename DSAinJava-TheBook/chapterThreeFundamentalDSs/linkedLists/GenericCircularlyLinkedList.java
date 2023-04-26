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

	/**
	 * Give an implementation of the size( ) method for the CircularlyLinkedList
	 * class, assuming that we did not maintain size as an instance variable.
	 * 
	 * @return
	 */
	int getSize() { // returns the number of nodes in the list
//		return size;
		int count = 0;
		Node<T> curr = tail.getNext();
		while (curr != tail) {
			count++;
			curr = curr.getNext();
		}
		return count;
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
			Node<T> newNode = new Node<T>(t, tail.getNext());
			tail.setNext(newNode); // add the new node with next to be the next of tail and set
									// the next of tail to be the new node

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
		} while (current != tail.getNext());
//		arrayList.add(tail.getElement());
		return arrayList;
	}

	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}

		if (getClass() != o.getClass()) {
			return false;
		}
		GenericCircularlyLinkedList other = (GenericCircularlyLinkedList) o;

		if (getSize() != other.getSize()) {
			return false;
		}

		Node thisCurrent = tail.getNext();
		Node otherCurrent = other.getTail().getNext();

		while (thisCurrent != getTail()) {
			if (!thisCurrent.getElement().equals(otherCurrent.getElement())) {
				return false;
			}

			thisCurrent = thisCurrent.getNext();
			otherCurrent = otherCurrent.getNext();
		}
		// check last element of both lists
		return thisCurrent.getElement().equals(otherCurrent.getElement());

	}

	public boolean equalsWithSequence(GenericCircularlyLinkedList<T> other) {
		if (other == this) {
			return true;
		}

		if (getSize() != other.getSize()) {
			return false;
		}

		Node<T> thisCurrent = tail.getNext();
		Node<T> otherCurrent = other.tail.getNext();

		while (!otherCurrent.getElement().equals(thisCurrent.getElement())) {
			other.rotate(); // rotating the other list until the head of the list matches the this list
			otherCurrent = otherCurrent.getNext();
		}
		return this.equals(other); // using the equals method above to check

	}

	/**
	 * Give an algorithm for concatenating two doubly linked lists L and M, with
	 * header and trailer sentinel nodes, into a single list L′ .
	 * 
	 * @param other
	 * @return
	 */
	public GenericCircularlyLinkedList<T> concat(GenericCircularlyLinkedList<T> other) {
		GenericCircularlyLinkedList<T> result = new GenericCircularlyLinkedList<>();

		Node<T> thisCurr = tail.getNext();
		do {
			result.addLast(thisCurr.getElement());
			thisCurr = thisCurr.getNext();
		} while (thisCurr != tail.getNext());

		Node<T> otherCurr = other.tail.getNext();

		do {
			result.addLast(otherCurr.getElement());
			otherCurr = otherCurr.getNext();
		} while (otherCurr != other.tail.getNext());

		return result;
	}

	public static void main(String[] args) {
		GenericCircularlyLinkedList<Integer> list = new GenericCircularlyLinkedList<>();

		list.addFirst(2);
		list.addFirst(1);
		list.addLast(0);
		list.addFirst(100);
//		list.addLast(3);
		System.out.println(list.toArray());
		System.out.println(list.getTail().getElement());
//		list.rotate();
//		System.out.println(list.toArray());

		GenericCircularlyLinkedList<Integer> list2 = new GenericCircularlyLinkedList<>();
		list2.addFirst(2);
		list2.addFirst(1);
		list2.addLast(0);
		list2.addFirst(100);
		list2.rotate();
		System.out.println(list2.toArray());
		System.out.println(list2.getTail().getElement());

		GenericCircularlyLinkedList<Integer> concatenated = list.concat(list2);
		System.out.println(concatenated.toArray());
//		System.out.println(concatenated.getTail().getElement());

		System.out.println(list.equals(list2));
		System.out.println(list.equalsWithSequence(list2));

	}

}
