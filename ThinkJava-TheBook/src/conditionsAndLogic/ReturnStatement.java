package conditionsAndLogic;

import java.util.Scanner;

public class ReturnStatement {

	public static void main(String[] args) {
		scanDouble();
	}

	private static void printLogOfInput(double input) {

		if (input <= 0) {
			System.err.println("Error: input must be positive");
			return; // it terminates the method before it reached last line
		}
		double result = Math.log(input);
		System.out.println("The log of your input is: " + result);
	}

	public static void scanDouble() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");

		if (!in.hasNextDouble()) { // validate the input to be a double
			String word = in.next();
			System.err.println(word + " is not a number");
			return;
		}

		double x = in.nextDouble();
		printLogOfInput(x);
	}

}
