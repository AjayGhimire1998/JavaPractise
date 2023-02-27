package conditionsAndLogic;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		evenOrOdd();
	}

	static void evenOrOdd() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the integer you want to check: ");
		int input = in.nextInt();
		if (input % 2 == 0)
			System.out.println("It is even !");
		else
			System.out.println("It is odd!");
	}
}
