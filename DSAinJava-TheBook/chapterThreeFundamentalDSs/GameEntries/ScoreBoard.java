package GameEntries;

/**
 * Class for storing high scores in an array in nondecreasing order.
 * 
 * @author ajayghimire
 *
 */
public class ScoreBoard {
	private int numOfEntries = 0;// number of actual entries
	private GameEntry[] board;// array of game entries (names & scores)

	/**
	 * Constructs an empty scoreboard with the given capacity for storing entries. ∗
	 */
	ScoreBoard(int capacity) {
		board = new GameEntry[capacity];
	}
}
