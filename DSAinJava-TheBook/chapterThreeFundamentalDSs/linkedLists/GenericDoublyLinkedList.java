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

		private Node<T> header;
		private Node<T> trailer;
		private int size = 0;

	}
}
