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
	/**
	 * private Node class for scoreboard
	 * 
	 * @author ajayghimire
	 *
	 */
	private static class Node {
		int score;
		Node next;

		Node(int score, Node next) {
			this.score = score;
			this.next = next;
		}
	}
}
