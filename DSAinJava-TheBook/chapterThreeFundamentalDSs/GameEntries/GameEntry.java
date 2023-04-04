package GameEntries;

public class GameEntry {
	private String name; // name of the player with the score
	private int score; // the score value

	GameEntry(String n, int i) {
		name = n;
		score = i;
	}

	String getName() {
		return name;
	}

	int getScore() {
		return score;
	}
}
