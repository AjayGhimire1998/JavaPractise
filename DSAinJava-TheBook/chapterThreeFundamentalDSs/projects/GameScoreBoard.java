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

	void addFirst(int val) {
		scoreboard.addFirst(val);
	}

	void display() {
		System.out.println(scoreboard);
	}

	public static void main(String[] args) {
		GameScoreBoard game = new GameScoreBoard();
		System.out.println(game.getSize());
		game.addFirst(0);
		game.addFirst(1);
		System.out.println(game.getSize());
		game.display();

	}
}
