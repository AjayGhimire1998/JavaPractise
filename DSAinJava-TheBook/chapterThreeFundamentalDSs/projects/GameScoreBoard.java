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

	void addLast(int val) {
		scoreboard.addLast(val);
	}

	void display() {
		System.out.println(scoreboard);
	}

	Integer getFirst() {
		return scoreboard.getFirst();
	}

	Integer getLast() {
		return scoreboard.getLast();
	}

	void displayInOrder() {

	}

	public static void main(String[] args) {
		GameScoreBoard game = new GameScoreBoard();
		System.out.println(game.getSize());
		game.addFirst(0);
		game.addFirst(1);
		game.addLast(9);
		System.out.println(game.getSize());
		game.display();
		System.out.println(game.getFirst());

//		GameScoreBoard game = new GameScoreBoard();
		System.out.println(game.getSize());
		game.addFirst(0);
		game.addFirst(1);
		game.addLast(9);
		System.out.println(game.getSize());
		game.display();
		System.out.println(game.getFirst());
		System.out.println(game.getSize());
		game.addLast(9);
		System.out.println(game.getSize());

		System.out.println(game.getSize());

		System.out.println(game.getSize());

	}
}
