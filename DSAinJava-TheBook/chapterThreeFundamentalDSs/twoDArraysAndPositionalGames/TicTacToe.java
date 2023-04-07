package twoDArraysAndPositionalGames;

import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {
	static String[][] board = new String[3][3];

	TicTacToe() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = "";
			}
		}
	}

	void play() {

		ArrayList<Integer> posInputs = new ArrayList<>(9);

		Scanner in = new Scanner(System.in);
		boolean play = true;

		while (play) {

			System.out.println("Choose the position for X between 1 to 9: ");

			int posX = in.nextInt();

			if (!posInputs.contains(posX)) {
				posInputs.add(posX);
				addTOBoard(posX, "X");
			} else {
				System.err.println("Position already occupied! You missed a chance");
			}

			twoDArraystoString(); // string representation of the game

			if (isWin()) {
				System.out.println("Game over.");
				break;
			}

			System.out.println("Choose the position for O between 1 to 9: ");

			int posO = in.nextInt();

			if (!posInputs.contains(posO)) {
				posInputs.add(posO);
				addTOBoard(posO, "O");
			} else {
				System.err.println("Position already occupied! You missed a chance.");
			}

			twoDArraystoString(); // string representation of the game

			if (isWin()) {
				System.out.println("Game over.");
				break;
			}

		}

	}

	void addTOBoard(int pos, String move) {
		if (pos <= 9 || pos >= 1) {
			if (pos <= 3 && board[0][pos - 1] == "") {
				board[0][pos - 1] = move;
			} else if ((pos > 3 && pos <= 6) && board[1][pos - board[1].length - 1] == "") {
				board[1][pos - board[1].length - 1] = move;
			} else {
				board[2][pos - (board[2].length + board[1].length) - 1] = move;
			}
		} else {
			System.err.println("Invalid position");
			System.exit(0);
		}
	}

	boolean isWin() {

		return (((board[0][0] + board[0][1] + board[0][2]).equals("XXX")
				|| (board[0][0] + board[0][1] + board[0][2]).equals("OOO")) // row
				// 0
				|| ((board[1][0] + board[1][1] + board[1][2]).equals("XXX")
						|| (board[1][0] + board[1][1] + board[1][2]).equals("OOO")) // row 1
				|| ((board[2][0] + board[2][1] + board[2][2]).equals("XXX")
						|| (board[2][0] + board[2][1] + board[2][2]).equals("OOO")) // row 2
				|| ((board[0][0] + board[1][0] + board[2][0]).equals("XXX")
						|| (board[0][0] + board[1][0] + board[2][0]).equals("OOO")) // column 0
				|| ((board[0][1] + board[1][1] + board[2][1]).equals("XXX")
						|| (board[0][1] + board[1][1] + board[2][1]).equals("OOO")) // column 1
				|| ((board[0][2] + board[1][2] + board[2][2]).equals("XXX")
						|| (board[0][2] + board[1][2] + board[2][2]).equals("OOO")) // column 2
				|| ((board[0][0] + board[1][1] + board[2][2]).equals("XXX")
						|| (board[0][0] + board[1][1] + board[2][2]).equals("OOO")) // diagonal
				|| ((board[2][0] + board[1][1] + board[0][2]).equals("XXX")
						|| (board[2][0] + board[1][1] + board[0][2]).equals("OOO"))); // rev diag

	}

	void twoDArraystoString() {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (j == board[i].length - 1) {
					System.out.println(board[i][j]);
					System.out.println("-------------");
					System.out.println();
				} else {
					System.out.print(board[i][j] + "  |  ");

				}
			}
		}

		System.out.println();
	}

	public static void main(String[] args) {

		TicTacToe ticTacToe = new TicTacToe();
		ticTacToe.play();

	}
}
