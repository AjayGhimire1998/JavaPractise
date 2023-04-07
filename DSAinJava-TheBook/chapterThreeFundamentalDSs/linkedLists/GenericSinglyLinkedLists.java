package linkedLists;

public class GenericSinglyLinkedLists<T> {
	private static class Node<T> {
		private T element;
		private Node<T> next;

		Node(T e, Node<T> n) {
			element = e;
			next = n;
		}

		public T getElement() {
			return element;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> node) {
			next = node;
		}
	}
}
