package Loops;

import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {
//		validateInputWithBreak();
//		validateInputWithContinue();
		validatingInputWithContinueAgain();
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

	public static void validateInputWithContinue() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a number: ");
			if (!in.hasNextDouble()) {
				System.err.println(in.next() + "is not a number");
				continue;
			}
			System.out.println(in.nextDouble());
			break;
		}
	}

	/**
	 * In addition to the break statement, which exits the loop, Java provides a
	 * continue statement that moves on to the next iteration. For example, the
	 * following code reads integers from the keyboard and computes a running total.
	 * The continue statement causes the program to skip over any negative values.
	 */
	public static void validatingInputWithContinueAgain() {
		Scanner in = new Scanner(System.in);
		int x = -1;
		int sum = 0;

		while (x != 0) {
			x = in.nextInt();
			if (x <= 0) {
				continue;
			}
			System.out.println("Adding " + x);
			sum += x;
			System.out.println("sum: " + sum);
		}

	}

}
