package linkedLists;

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
		return tail.getNext().getElement();
	}

	T last() { // return the last element in the list
		if (isEmpty())
			return null;
		return tail.getElement();
	}

}
