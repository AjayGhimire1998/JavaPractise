package Loops;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		countDown(10);
//		sequence(97);
//		logTable();
		baseTwoLogarithm();

	}

	/**
	 * You can almost read the while statement like English: “While n is greater
	 * than zero, print the value of n and then reduce the value of n by 1. When you
	 * get to zero, print Blastoff!”
	 * 
	 * @param n
	 */
	public static void countDown(int n) {
		while (n > 0) {
			System.out.printf("n: %d  \n", n);
			n--;
		}
		System.out.println("Boom");

	}

	/**
	 * Each time through the loop, the program displays the value of n and then
	 * checks whether it is even or odd. If it is even, the value of n is divided by
	 * two. If it is odd, the value is replaced by 3n+ 1. For example, if the
	 * starting value (the argument passed to sequence) is 3, the resulting sequence
	 * is 3, 10, 5, 16, 8, 4, 2, 1.
	 * 
	 * @param n
	 */
	public static void sequence(int n) {
		while (n != 1) {
			System.out.println(n);
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = n * 3 + 1;
			}
		}
	}

	/**
	 * Although a “log table” is not as useful as it once was, it still makes a good
	 * example of iteration. The following loop displays a table with a sequence of
	 * values in the left col‐ umn and their logarithms in the right column:
	 * 
	 */
	public static void logTable() {
		int i = 1;
		while (i < 10) {
			double x = (double) i;
			System.out.printf("%.1f       %.3f \n", x, Math.log(x));
			i++;
		}
	}

	/**
	 * Math.log computes natural logarithms, that is, logarithms base e. For
	 * computer sci‐ ence applications, we often want logarithms with respect to
	 * base 2. To compute them, we can apply this equation:
	 */
	public static void baseTwoLogarithm() {
		int i = 1;
		while (i < 10) {
			double x = i;
			System.out.println(x + "     " + Math.log(x) / Math.log(2));
			i++;

		}
	}

}
