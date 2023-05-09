package projects;

/**
 * Write a class that maintains the top ten scores for a game application,
 * implementing the add and remove methods of Section 3.1.1, but using a singly
 * linked list instead of an array.
 * 
 * @author ajayghimire
 *
 */
public class GameScoreBoard {

	// private Node class for scoreboard
	private static class Node {
		int score;
		Node next;

		Node(int score, Node next) {
			this.score = score;
			this.next = next;
		}
	}

	// attributes of scorebaord
	private Node head;
	private int size;

	GameScoreBoard() {
		this.head = null;
		this.size = 0;
	}

	void add(int score) {
		// insert new score in order

		Node newNode = new Node(score, null);
		if (head == null) {
			head = newNode;
		} else if (score >= head.score) {
			newNode.next = head;
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null && score < current.next.score) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}

		// remove any scores after the 10th
		if (size >= 10) {
			Node curr = head;
			for (int i = 0; i < 9; i++) {
				curr = curr.next;
			}
			curr.next = null;
		} else {
			size++;
		}

	}

	void remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		}

		if (index == 0) {
			head = head.next;
		} else {
			Node curr = head;
			for (int i = 0; i < index - 1; i++) {
				curr = curr.next;
			}
			curr.next = curr.next.next;
		}
		size--;
	}

	public void printTopTen() {
		Node current = head;
		for (int i = 1; i <= size; i++) {
			System.out.println(i + ". " + current.score);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		GameScoreBoard board = new GameScoreBoard();
		board.add(2);
		board.add(5);
		board.add(2);
		board.add(10);
		board.add(1);
		board.add(2);
		board.add(5);
		board.add(2);
		board.add(10);
		board.add(1);
		board.add(3);
		board.remove(0);
		board.remove(8);
		board.printTopTen();

	}
}
