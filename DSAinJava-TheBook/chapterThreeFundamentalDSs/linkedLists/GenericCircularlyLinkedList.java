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

	void addFirst(T t) { // adds element t to the front of the list
		if (isEmpty()) {
			tail = new Node<>(t, null);
			tail.setNext(tail); // link to itself circularly
		} else {
			Node<T> newNode = new Node<>(t, tail.getNext());
			tail.setNext(newNode); // add the new node with next to be the next of tail and set the next of tail to
									// be the new node
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
	}

}
