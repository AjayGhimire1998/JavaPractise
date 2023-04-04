package GameEntries;

public class GameEntry {
	private String name; // name of the player with the score
	private int score; // the score value

	GameEntry(String n, int i) {
		name = n;
		score = i;
	}

	/**
	 * @return name field
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return score field
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @returns string representation of the entry
	 */
	public String toString() {
		return "(" + name + ", " + score + ")";
	}
}
