package twoDArraysAndPositionalGames;

import java.util.Scanner;

public class TicTacToe {
	String[][] board = new String[3][3];

	TicTacToe() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = "";
			}
		}
	}

	void play() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Type your move: ");

			String move = in.next();
			if (move.equals("X") || move.equals("O")) {
				System.out.println("Choose the position for your move between 1 to 9: ");
				int pos = in.nextInt();
				if (pos <= 9 || pos >= 1) {

					System.out.println(pos);

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
			} else {
				System.err.println("Invalid input");
			}
			twoDArraystoString();
			if (isWin() == true) {
				break;
			}

		}

	}

	public static void main(String[] args) {

		TicTacToe ticTacToe = new TicTacToe();
		ticTacToe.play();

	}

	void twoDArraystoString() {
		System.out.println();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (j == board[i].length - 1) {
					System.out.println(board[i][j]);
					System.out.println();
				} else {
					System.out.print(board[i][j] + ", ");
				}
			}
		}

		System.out.println();
	}

	boolean isWin() {

		return ((board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2]) && board[0][2].equals(board[0][0]))
				|| (board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2])
						&& board[1][2].equals(board[1][0]))
				|| (board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2])
						&& board[2][2].equals(board[2][0]))
				|| (board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0])
						&& board[2][0].equals(board[0][0]))
				|| (board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1])
						&& board[2][1].equals(board[0][1]))
				|| (board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2])
						&& board[2][2].equals(board[0][2]))
				|| (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])
						&& board[2][2].equals(board[0][0]))
				|| (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])
						&& board[2][0].equals(board[0][2])));
	}
}
