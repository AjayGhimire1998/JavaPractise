package linkedLists;

public class GenericDoublyLinkedList<T> {
	private static class Node<T> {
		private T element;
		private Node<T> next;
		private Node<T> prev;

		Node(T e, Node<T> n, Node<T> p) {
			element = e;
			next = n;
			prev = p;
		}

		// getter methods
		T getElement() {
			return element;
		}

		Node<T> getPrev() {
			return prev;
		}

		Node<T> getNext() {
			return next;
		}

		// setter methods
		void setPrev(Node<T> p) {
			prev = p;
		}

		void setNext(Node<T> n) {
			next = n;
		}
	}

	// instance variables of the DoublyLinkedList
	private Node<T> header; // header sentinel
	private Node<T> trailer; // trailer sentinel
	private int size = 0; // number of elements in the list

	// Constructs a new empty list
	GenericDoublyLinkedList() {
		header = new Node<>(null, null, null); // create header
		trailer = new Node<>(null, null, header); // trailer is preceded by header
		header.setNext(trailer); // header is followed by trailer
	}

	/**
	 * returns the number of the elements in the linked list
	 *
	 */
	public int size() {
		return size;
	}

	/**
	 * tests whether the list is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * return the first element in the list
	 */
	public T getFirst() {
		if (isEmpty())
			return null;
		return header.getNext().getElement(); // first element is after header
	}

	/**
	 * returns the last element of the list
	 */
	public T getLast() {
		if (isEmpty())
			return null;
		return trailer.getPrev().getElement(); // last element is before trailer.
	}

}
