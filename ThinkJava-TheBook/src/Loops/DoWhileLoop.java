package Loops;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		validatingInputWithDoWhileLoop();
	}

	/**
	 * The while and for statements are pretest loops; that is, they test the
	 * condition first and at the beginning of each pass through the loop.
	 * 
	 * Java also provides a posttest loop: the do-while statement. This type of loop
	 * is useful when you need to run the body of the loop at least once.
	 * 
	 * For example, in “Validating Input” on page 62 we used the return statement to
	 * avoid reading invalid input from the user. We can use a do-while loop to keep
	 * reading input until it’s valid:
	 * 
	 */
	public static void validatingInputWithDoWhileLoop() {
		Scanner in = new Scanner(System.in);
		boolean okay;

		do {
			System.out.println("enter a number: ");
			;
			if (in.hasNextDouble()) {
				okay = true;
			} else {
				okay = false;
				String word = in.next();
				System.err.println(word + " is not a number!!");
			}
		} while (!okay);
		double x = in.nextDouble();
		System.out.println(x);

	}

}
