package linkedLists;

import java.util.ArrayList;

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

	// getter methods

	/**
	 * returns the number of the elements in the linked list
	 * 
	 * Give an implementation of the size( ) method for the DoublyLinkedList class,
	 * assuming that we did not maintain size as an instance variable
	 *
	 */
	public int size() {
//		return size;
		int count = 0;
		Node<T> current = header;
		while (current != trailer) {
			count++;
			current = current.getNext();
		}
		return count;
	}

	/**
	 * tests whether the list is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	public Node<T> getHeadNode() {
		if (isEmpty()) {
			return null;
		}
		return header.getNext();
	}

	public Node<T> getTailNode() {
		if (isEmpty()) {
			return null;
		}
		return trailer.getPrev();
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

	// setter or update methods

	/**
	 * adds elem e to the front of the list
	 * 
	 * @param e
	 */
	public void addFirst(T e) {
		addBetween(e, header, header.getNext()); // place after the header
	}

	/**
	 * adds elem e to the back of the list
	 * 
	 * @param e
	 */
	public void addLast(T e) {
		addBetween(e, trailer.getPrev(), trailer); // place before the trailer
	}

	/**
	 * removes and returns the first element of the list
	 * 
	 * @return
	 */
	public T removeFirst() {
		if (isEmpty())
			return null; // nothing to remove
		return remove(header.getNext()); // first elemenet is beyond the header
	}

	/**
	 * removes and returns the last element of the list
	 * 
	 * @return
	 */
	public T removeLast() {
		if (isEmpty())
			return null; // nothing to remove
		return remove(trailer.getPrev()); // last elem is before the trailer
	}

	public ArrayList<T> toArray() {
		ArrayList<T> result = new ArrayList<>();
		Node<T> curr = header.getNext();
		while (curr != trailer) {
			result.add(curr.getElement());
			curr = curr.getNext();
		}
		return result;
	}

	// private update methods

	/**
	 * adds element e to the linked list in between given nodes
	 * 
	 * @param e
	 * @param predecessor
	 * @param successor
	 */
	private void addBetween(T e, Node<T> predecessor, Node<T> successor) {
		Node<T> newest = new Node<>(e, successor, predecessor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		size++;
	}

	/**
	 * Removes the given node from the list and returns its element
	 * 
	 * @param node
	 * @return
	 */
	private T remove(Node<T> node) {
		Node<T> predecessor = node.getPrev();
		Node<T> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		return node.getElement();
	}

	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (o == this) {
			return true;
		}

		if (getClass() != o.getClass()) {
			return false;
		}

		GenericDoublyLinkedList other = (GenericDoublyLinkedList) o;
		if (size() != other.size()) {
			return false;
		}
		Node thisCurrent = header.getNext();
		Node otherCurrent = other.header.getNext();
		while (thisCurrent != trailer) {
			if (!thisCurrent.getElement().equals(otherCurrent.getElement())) {
				return false;
			}

			thisCurrent = thisCurrent.getNext();
			otherCurrent = otherCurrent.getNext();
		}
		return true;
	}

	/**
	 * Give an algorithm for concatenating two doubly linked lists L and M, with
	 * header and trailer sentinel nodes, into a single list L′
	 * 
	 * @param other
	 * @return
	 */
	public GenericDoublyLinkedList<T> concat(GenericDoublyLinkedList<T> other) {
		GenericDoublyLinkedList<T> result = new GenericDoublyLinkedList<T>();

		Node<T> thisCurr = header.getNext();
		while (thisCurr != trailer) {
			result.addLast(thisCurr.getElement());
			thisCurr = thisCurr.getNext();
		}

		Node<T> otherCurr = other.header.getNext();
		while (otherCurr != other.trailer) {
			result.addLast(otherCurr.getElement());
			otherCurr = otherCurr.getNext();
		}

		return result;
	}

	public void swapNodes(Node<T> x, Node<T> y) {
		if (x == getHeadNode() && y == getTailNode()) { // swapping head and tail
			Node<T> tempHead = getHeadNode();

			Node<T> afterHead = header.getNext().getNext();
			Node<T> beforeTail = trailer.getPrev().getPrev();
			header.setNext(trailer.getPrev());
			header.getNext().setNext(afterHead);
			header.getNext().setPrev(header);
			afterHead.setPrev(header.getNext());
			System.out.println(header.getNext().getNext().getElement());
			System.out.println(header.getNext().getNext().getPrev().getElement());

			beforeTail.setNext(tempHead);
			tempHead.setPrev(beforeTail);
			tempHead.setNext(trailer);
			return;
		}

		if (x == getHeadNode() && y == getHeadNode().getNext()) { // swapping head and next of head
			Node<T> afterY = y.getNext();
			header.setNext(y);
			y.setPrev(header);
			y.setNext(x);
			x.setPrev(y);
			x.setNext(afterY);
			return;
		}

		if (x == getTailNode().getPrev() && y == getTailNode()) { // swapping before of tail and tail
			Node<T> beforeX = x.getPrev();
			System.out.println(beforeX.getElement());
			beforeX.setNext(y);
			System.out.println(beforeX.getNext().getElement());
			y.setPrev(beforeX);

			y.setNext(x);
			x.setPrev(y);
			x.setNext(trailer);
			return;
		}

		if (x != getHeadNode() && y != getTailNode() && x.getNext() == y) { // swapping adjacent nodes (no head or tail
																			// included)

			Node<T> beforeX = x.getPrev();
			Node<T> afterY = y.getNext();

			beforeX.setNext(y);
			y.setPrev(beforeX);

			y.setNext(x);
			x.setPrev(y);
			x.setNext(afterY);
			return;
		}

		if (x == getHeadNode() && y != getHeadNode().getNext() && y != getTailNode()) { // swapping x being head with
																						// any other but tail or
																						// head.next
			Node<T> afterHead = getHeadNode().getNext();
			Node<T> afterY = y.getNext();
			Node<T> beforeY = y.getPrev();

			header.setNext(y);
			y.setPrev(header);
			y.setNext(afterHead);

			beforeY.setNext(x);
			x.setPrev(beforeY);
			x.setNext(afterY);
			return;
		}

		if (x != getHeadNode() && x != getTailNode().getPrev() && y == getTailNode()) { // swapping x being any other
																						// but tail.prev or head with y
																						// being tail
			Node<T> beforeTail = y.getPrev();
			Node<T> beforeX = x.getPrev();
			Node<T> afterX = x.getNext();

			beforeX.setNext(y);
			y.setPrev(beforeX);
			y.setNext(afterX);

			beforeTail.setNext(x);
			x.setPrev(beforeTail);
			x.setNext(trailer);
			return;
		}

		Node<T> beforeX = x.getPrev();
		Node<T> afterX = x.getNext();

		Node<T> beforeY = y.getPrev();
		Node<T> afterY = y.getNext();

		beforeX.setNext(y);
		y.setPrev(beforeX);
		y.setNext(afterX);

		beforeY.setNext(x);
		x.setPrev(beforeY);
		x.setNext(afterY);

	}

	/**
	 * Implement a circular version of a doubly linked list, without any sentinels,
	 * that supports all the public behaviors of the original as well as two new
	 * update methods, rotate( ) and rotateBackward( ).
	 * 
	 */
	void rotate() {
		Node<T> tempHead = header.getNext();
		Node<T> tempTail = trailer.getPrev();
		header.setNext(header.getNext().getNext());
		tempTail.setNext(tempHead);
		tempHead.setPrev(tempTail);
		tempHead.setNext(trailer);
		trailer.setPrev(tempHead);
		header.getNext().setPrev(header);

	}

	void rotateBackwards() {
		Node<T> tempHead = header.getNext();
		Node<T> tempTail = trailer.getPrev();
		trailer.setPrev(trailer.getPrev().getPrev());
		tempHead.setPrev(tempTail);
		tempTail.setNext(tempHead);
		tempTail.setPrev(header);
		header.setNext(tempTail);
		trailer.getPrev().setNext(trailer);

	}

	public static void main(String[] args) {
		GenericDoublyLinkedList<Integer> list = new GenericDoublyLinkedList<>();
		list.addFirst(1);
		list.addFirst(2);
		list.addLast(9);
		list.addLast(10);
//		System.out.println(list.toArray());
//
//		list.removeFirst();
//		System.out.println(list.toArray());
//
//		System.out.println(list.removeLast());
//		System.out.println(list.toArray());
//		System.out.println(list.size());

		GenericDoublyLinkedList<Integer> list2 = new GenericDoublyLinkedList<>();
		list2.addFirst(11);
		list2.addFirst(12);
		list2.addLast(13);
//		System.out.println(list2.toArray());

		GenericDoublyLinkedList<Integer> concatenated = list.concat(list2);
//		System.out.println(concatenated.toArray());
//		concatenated.swapNodes(concatenated.getHeadNode().getNext().getNext(), concatenated.getTailNode().getPrev());
		System.out.println(concatenated.toArray());
		System.out.println("head: " + concatenated.getHeadNode().getElement());
		System.out.println("tail: " + concatenated.getTailNode().getElement());
		concatenated.rotate();
		System.out.println("after roatation1: " + concatenated.toArray());
		System.out.println("head: " + concatenated.getHeadNode().getElement());
		System.out.println("tail: " + concatenated.getTailNode().getElement());
		concatenated.rotate();
		System.out.println("after roatation2: " + concatenated.toArray());
		System.out.println("head: " + concatenated.getHeadNode().getElement());
		System.out.println("tail: " + concatenated.getTailNode().getElement());
		concatenated.rotate();
		System.out.println("after roatation3: " + concatenated.toArray());
		System.out.println("head: " + concatenated.getHeadNode().getElement());
		System.out.println("tail: " + concatenated.getTailNode().getElement());
		concatenated.rotate();
		System.out.println("after roatation4: " + concatenated.toArray());
		System.out.println("head: " + concatenated.getHeadNode().getElement());
		System.out.println("tail: " + concatenated.getTailNode().getElement());
		concatenated.rotate();
		System.out.println("after roatation1: " + concatenated.toArray());
		System.out.println("head: " + concatenated.getHeadNode().getElement());
		System.out.println("tail: " + concatenated.getTailNode().getElement());
		concatenated.rotate();
		System.out.println("after roatation2: " + concatenated.toArray());
		System.out.println("head: " + concatenated.getHeadNode().getElement());
		System.out.println("tail: " + concatenated.getTailNode().getElement());
		concatenated.rotate();
		System.out.println("after roatation3: " + concatenated.toArray());
		System.out.println("head: " + concatenated.getHeadNode().getElement());
		System.out.println("tail: " + concatenated.getTailNode().getElement());
		concatenated.rotate();
		System.out.println("after roatation4: " + concatenated.toArray());
		System.out.println("head: " + concatenated.getHeadNode().getElement());
		System.out.println("tail: " + concatenated.getTailNode().getElement());
		concatenated.rotateBackwards();
		System.out.println("after backwardroatation1: " + concatenated.toArray());
		System.out.println("head: " + concatenated.getHeadNode().getElement());
		System.out.println("tail: " + concatenated.getTailNode().getElement());
		concatenated.rotateBackwards();
		System.out.println("after backwardroatation1: " + concatenated.toArray());
		System.out.println("head: " + concatenated.getHeadNode().getElement());
		System.out.println("tail: " + concatenated.getTailNode().getElement());
		concatenated.rotateBackwards();
		System.out.println("after backwardroatation1: " + concatenated.toArray());
		System.out.println("head: " + concatenated.getHeadNode().getElement());
		System.out.println("tail: " + concatenated.getTailNode().getElement());

	}

}
