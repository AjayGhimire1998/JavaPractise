package linkedLists;

public class GenericDoublyLinkedList<T> {
	private static class Node<T> {
		private T element;
		private Node<T> next;
		private Node<T> prev;
	}
}
