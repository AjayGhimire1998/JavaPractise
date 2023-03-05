package Loops;

import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {
		validateInputWithBreak();
	}

	/**
	 * Sometimes neither a pretest nor a posttest loop will provide exactly what you
	 * need. In the previous example, the “test” needed to happen in the middle of
	 * the loop. As a result, we used a flag variable and a nested if-else
	 * statement.
	 * 
	 * A simpler way to solve this problem is to use a break statement. When a
	 * program reaches a break statement, it exits the current loop.
	 * 
	 * Using true as a conditional in a while loop is an idiom that means “loop
	 * forever”, or in this case “loop until you get to a break statement.”
	 * 
	 */
	public static void validateInputWithBreak() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a number: ");
			if (in.hasNextDouble()) {
				break;
			}
			String word = in.next();
			System.err.println(word + " is not a number!");
		}
		System.out.println(in.nextDouble());

	}

}
