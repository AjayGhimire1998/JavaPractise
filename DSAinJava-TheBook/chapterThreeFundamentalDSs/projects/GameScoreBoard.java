package projects;

import java.util.LinkedList;

public class GameScoreBoard {
	private LinkedList<Integer> scoreboard;

	GameScoreBoard() {
		scoreboard = new LinkedList<>();
	}

	int getSize() {

		return scoreboard.size();
	}

	public static void main(String[] args) {
		GameScoreBoard game = new GameScoreBoard();
		System.out.println(game.getSize());
	}
}
