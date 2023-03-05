package Loops;

public class Labs {

	public static void main(String[] args) {
//		loop(10);
		System.out.println(sqaureRoot(16));

	}

	/**
	 * 1. Draw a table that shows the value of the variables i and n during the
	 * execution of loop. The table should contain one column for each variable and
	 * one line for each iteration.
	 * 
	 * 2. What is the output of this program?
	 * 
	 * 3. Can you prove that this loop terminates for any positive value of n?
	 * 
	 * @param n
	 */
	public static void loop(int n) {
		int i = n;
		while (i > 1) {
			System.out.println(i);
			if (i % 2 == 0) {
				i = i / 2;
			} else {
				i = i + 1;
			}
		}
	}

	/**
	 * Let’s say you are given a number, a, and you want to find its square root.
	 * One way to do that is to start with a rough guess about the answer, x0 , and
	 * then improve the guess using this formula:
	 * 
	 * x1 = (x0 + a/x0) /2
	 * 
	 * Write a method called squareRoot that takes a double and returns an
	 * approximation of the square root of the parameter, using this technique. You
	 * should not use Math.sqrt.
	 * 
	 * As your initial guess, you should use a/2. Your method should iterate until
	 * it gets two consecutive estimates that differ by less than 0.0001. You can
	 * use Math.abs to calcu‐ late the absolute value of the difference.
	 * 
	 * @param n
	 * @return
	 */
	public static double sqaureRoot(double n) {
		double x0 = n / 2;
		double x1 = (x0 + n / x0) / 2.0;
		double diff = Math.abs(x1 - x0);
		while (diff > 0.0001) {
			x0 = x1;
			x1 = (x0 + n / x0) / 2.0;
			diff = Math.abs(x1 - x0);
		}
		return x1;

	}

}
