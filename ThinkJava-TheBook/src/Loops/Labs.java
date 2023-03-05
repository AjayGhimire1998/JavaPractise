package Loops;

/**
 * @author ajayghimire
 *
 */
/**
 * @author ajayghimire
 *
 */
public class Labs {

	public static void main(String[] args) {
//		loop(10);
		System.out.println(sqaureRoot(16));
		System.out.println(power(2.0, 3));
		System.out.println(factorial(12));
		System.out.println(myExp(2, 3));
		System.out.println(myExpTwo(2, 3));
		System.out.println(myEXPwithOneParam(2));
		System.out.println(Math.exp(2.0));
		check(1);

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

	/**
	 * In Exercise 6-9 we wrote a recursive version of power, which takes a double x
	 * and an integer n and returns x n . Now write an iterative method to perform
	 * the same calcula‐ tion.
	 * 
	 * @param x
	 * @param n
	 * @return
	 */
	public static double power(double x, int n) {
		double result = 1;
//		while (n > 0) {
//			result *= x;
//			n--;
//		}
		for (int i = 0; i < n; i++) {
			result *= x;
		}
		return result;
	}

	/**
	 * “More Recursion” on page 79 presents a recursive method that computes the
	 * factorial function. Write an iterative version of factorial.
	 * 
	 * @param n
	 * @return
	 */
	public static int factorial(int n) {
		int result = 1;

		for (int i = 1; i <= n; i++) {
			result *= i;
		}
//		while (n > 1) {
//			result *= n - 1;
//			n--;
//		}
		return result;

	}

	/**
	 * One way to calculate e x is to use the infinite series expansion: e x = 1 + x
	 * + x 2 /2! + x 3 /3! + x 4 /4! + . . . The ith term in the series is xi/i!.
	 * 
	 * 1. Write a method called myexp that takes x and n as parameters and estimates
	 * e x by adding the first n terms of this series. You can use the factorial
	 * method from “More Recursion” on page 79 or your iterative version from the
	 * previous exercise.
	 * 
	 */
	public static double myExp(double x, int n) {
//		double power = power(x, n);
//		int factorail = factorial(n);
		double result = 0;

		for (int i = 1; i <= n; i++) {
			result += power(x, i) / factorial(i);
		}
		return result;

	}

	/**
	 * You can make this method more efficient if you realize that the numerator of
	 * each term is the same as its predecessor multiplied by x, and the denominator
	 * is the same as its predecessor multiplied by i. Use this observation to
	 * eliminate the use of Math.pow and factorial, and check that you get the same
	 * result.
	 * 
	 * @param x
	 * @param n
	 * @return
	 */
	public static double myExpTwo(double x, int n) {
//		double power = power(x, n);
//		int factorail = factorial(n);
		double result = 0;

		for (int i = 0; i < n; i++) {
			result += Math.pow(x, i) / factorial(i);
		}
		return result;

	}

	/**
	 * . Write a method called check that takes a parameter, x, and displays x,
	 * myexp(x), and Math.exp(x). The output should look something like: 1.0
	 * 2.708333333333333 2.718281828459045 You can use the escape sequence "\t" to
	 * put a tab character between columns of a table.
	 * 
	 * @param x
	 * @return
	 */
	public static double myEXPwithOneParam(int x) {
		return power(2.71828, x);
	}

	public static void check(int x) {
		System.out.printf("%.1f \t %.9f \t %.9f ", (double) x, myEXPwithOneParam(x), Math.exp(x));

	}

}
