package GameEntries;

public class GameEntry {
	private String name; // name of the player with the score
	private int score; // the score value

	GameEntry(String n, int i) {
		name = n;
		score = i;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public String toString() {
		return "(" + name + ", " + score + ")";
	}
}
