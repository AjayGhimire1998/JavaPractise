package GameEntries;

import java.util.Arrays;

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
			if (numOfEntries < board.length) { // no score drops from the board
				numOfEntries++; // so overall number increases
			}
			// shift any lower scores rightward to make room for the new entry
			int j = numOfEntries - 1;
			while (j > 0 && board[j - 1].getScore() < newScore) {
				board[j] = board[j - 1]; // shift entry from j-1 to j
				j--; // and decrement j
			}

			board[j] = e; // when done, add new entry
		}
	}

	void addPractise(GameEntry e) {
		int newScore = e.getScore();
		if (numOfEntries < board.length || board[numOfEntries - 1].getScore() < newScore) {
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

	GameEntry remove(int i) {
		try {
			GameEntry temp = board[i];
			for (int j = i; j < numOfEntries - 1; j++) {
				board[j] = board[j + 1];
			}
			board[numOfEntries - 1] = null;
			numOfEntries--;
			return temp;
		} catch (Exception e) {
			if (i < 0 || i >= numOfEntries) {
				throw new IndexOutOfBoundsException("Invalid index: " + i);
			}
		}
		return new GameEntry(null, i);
	}

	public GameEntry removePractise(int i) throws IndexOutOfBoundsException {
		if (i < 0 || i >= numOfEntries) {
			throw new IndexOutOfBoundsException("Index invalid at " + i);
		}

		GameEntry temp = board[i];

		for (int j = i; j < numOfEntries - 1; j++) {
			board[j] = board[j + 1];
		}
		board[numOfEntries - 1] = null;
		numOfEntries--;
		return temp;
	}

	public static void main(String[] args) {
		GameEntry gameEntry = new GameEntry("Ajay", 9);
		GameEntry gameEntry2 = new GameEntry("Arjun", 6);
		GameEntry gameEntry3 = new GameEntry("Shiya", 10);
		GameEntry gameEntry4 = new GameEntry("Shiyaaa", 15);
		GameEntry gameEntry5 = new GameEntry("Ajayyyyyyyyy", 2);
		GameEntry gameEntry6 = new GameEntry("JIll the legend", 20);

		ScoreBoard scoreBoard = new ScoreBoard(5);
		scoreBoard.add(gameEntry);

		System.out.println(Arrays.toString(scoreBoard.board));
		scoreBoard.add(gameEntry3);
		System.out.println(Arrays.toString(scoreBoard.board));
		scoreBoard.add(gameEntry2);
		System.out.println(Arrays.toString(scoreBoard.board));
		System.out.println(scoreBoard.numOfEntries);
//		scoreBoard.add(gameEntry2);
		scoreBoard.add(gameEntry2);
		scoreBoard.add(gameEntry4);
		scoreBoard.add(gameEntry5);
		scoreBoard.add(gameEntry6);
		System.out.println(scoreBoard.numOfEntries);
		System.out.println(Arrays.toString(scoreBoard.board));

		System.out.println(scoreBoard.remove(0));
		System.out.println(Arrays.toString(scoreBoard.board));

	}
}
