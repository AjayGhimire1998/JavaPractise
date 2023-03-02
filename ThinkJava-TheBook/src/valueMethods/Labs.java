package valueMethods;

public class Labs {
	public static void main(String[] args) {
		boolean result = isDivisible(0, 1);
		System.out.println(result);
		System.out.println(isTriangle(1, 2, 3));
		System.out.println(isTriangle(1, 2, 3));

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
}
