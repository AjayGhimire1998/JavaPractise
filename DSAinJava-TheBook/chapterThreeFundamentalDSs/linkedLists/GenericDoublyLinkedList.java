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

		T getElement() {
			return element;
		}
	}
}
