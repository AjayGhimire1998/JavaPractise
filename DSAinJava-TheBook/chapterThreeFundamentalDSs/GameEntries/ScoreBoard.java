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

	/**
	 * Attempt to add a new score to the collection (if it is high enough) ∗
	 * 
	 * @param e
	 */
	void add(GameEntry e) {
		int newScore = e.getScore();
		// is the new entry e really a high score?
		if (numOfEntries < board.length || newScore > board[numOfEntries - 1].getScore()) {
			if (numOfEntries < board.length) {
				numOfEntries++;
			}

			int j = numOfEntries - 1;

			while (j > 0 && board[j - 1].getScore() < newScore) {
				board[j] = board[j - 1];
				j--;
			}

			board[j] = e;
		}
	}
}
