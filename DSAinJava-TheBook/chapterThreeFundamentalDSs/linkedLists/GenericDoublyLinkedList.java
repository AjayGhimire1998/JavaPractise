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

}
