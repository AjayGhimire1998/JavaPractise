package valueMethods;

public class Labs {
	public static void main(String[] args) {
//		boolean result = isDivisible(0, 1);
//		System.out.println(result);
//		System.out.println(isTriangle(1, 2, 3));
//		System.out.println(isTriangle(1, 2, 3));
//
//		double multAddValue = multAdd(1, 2, 3);
//		System.out.println(multAddValue);
//
//		System.out.println(multAdd(1, Math.sin(Math.PI / 4), (Math.cos(Math.PI / 4) / 2)));
//		System.out.println(multAdd(1, Math.log(10), Math.log(20)));
//		System.out.println(expSum(1));
//		System.out.println(prod(1, 4));
//
//		System.out.println(oddSum(13));
		System.out.println(ack(3, 5));
		System.out.println(power(2.0, 8));

	}

	/**
	 * Write a method named isDivisible that takes two integers, n and m, and that
	 * returns true if n is divisible by m, and false otherwise.
	 * 
	 * @param n, an integer
	 * @param m, an integer
	 * @return true if n is divisible by m, and false otherwise.
	 */
	public static boolean isDivisible(int n, int m) {
		return n % m == 0;
	}

	/**
	 * If you are given three sticks, you may or may not be able to arrange them in
	 * a trian‐ gle. For example, if one of the sticks is 12 inches long and the
	 * other two are one inch long, you will not be able to get the short sticks to
	 * meet in the middle. For any three lengths, there is a simple test to see if
	 * it is possible to form a triangle: If any of the three lengths is greater
	 * than the sum of the other two, you cannot form a triangle. Write a method
	 * named isTriangle that takes three integers as arguments and returns either
	 * true or false, depending on whether you can or cannot form a trian‐ gle from
	 * sticks with the given lengths. The point of this exercise is to use
	 * conditional statements to write a value method.
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return true or false
	 */
	public static boolean isTriangle(int x, int y, int z) {
		if (x <= 0 || y <= 0 || z <= 0) {
			// any side of a triangle can't be negative or zero
			return false;
		}
		if (x + y <= z || y + z <= x || x + z <= y) {
			// the sum of any two sides of a triangle must be greater than the third side
			return false;
		}
		return true;

	}

	/**
	 * Many computations can be expressed more concisely using the “multadd”
	 * operation, which takes three operands and computes a * b + c. Some processors
	 * even provide a hardware implementation of this operation for floating-point
	 * numbers.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return double
	 */
	public static double multAdd(double a, double b, double c) {
		return a * b + c;

	}

	/**
	 * Write a method called expSum that takes a double as a parameter and that uses
	 * multadd to calculate
	 * 
	 * @param x
	 * @return
	 */
	public static double expSum(double x) {
		return multAdd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
	}

	/**
	 * Exercise 6-6. In this exercise, you will use a stack diagram to understand
	 * the execution of the fol‐ lowing recursive program.
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public static int prod(int m, int n) {
		if (m == n) {
			return n;
		} else {
			int recurse = prod(m, n - 1);
			int result = n * recurse;
			return result;
		}
	}

	/**
	 * Write a recursive method named oddSum that takes a positive odd integer n and
	 * returns the sum of odd integers from 1 to n. Start with a base case, and use
	 * temporary variables to debug your solution. You might find it helpful to
	 * print the value of n each time oddSum is invoked.
	 * 
	 * @param p
	 * @return
	 */
	public static int oddSum(int n) {

		if (n == 1) {
			System.out.println("Base case reached, n = 1");
			return 1;
		} else {
			System.out.println("n = " + n);
			int sum = oddSum(n - 2); // recursive call with n-2
			int result = sum + n; // add n to the sum
			System.out.println("sum = " + sum + ", n = " + n + ", result = " + result);
			return result;
		}

	}

	/**
	 * Write a method called ack that takes two ints as parameters and that computes
	 * and returns the value of the Ackermann function. Test your implementation of
	 * Ackermann by invoking it from main and displaying the return value. Note the
	 * return value gets very big very quickly. You should try it only for small
	 * values of m and n (not bigger than 3).
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public static int ack(int m, int n) {
		if (m == 0) {
			return n + 1;
		} else if (m > 0 && n == 0) {
			return ack(m - 1, 1);
		} else {
			return ack(m - 1, ack(m, n - 1));
		}

	}

	/**
	 * Write a recursive method called power that takes a double x and an integer n
	 * and returns x n . Hint: A recursive definition of this operation is x n = x ·
	 * x n − 1. Also, remember that anything raised to the zeroth power is 1.
	 * 
	 * @param x
	 * @param n
	 * @return
	 */
	public static double power(double x, int n) {
		if (n == 0) {
			return 1;
		} else if (n % 2 == 0) {
			return power(x, n / 2) * power(x, n / 2);
		} else {
			return x * power(x, n - 1);
		}
	}

}
