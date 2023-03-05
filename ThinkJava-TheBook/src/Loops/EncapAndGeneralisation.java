package Loops;

public class EncapAndGeneralisation {

	public static void main(String[] args) {

		/*
		 * 1. Write a few lines of code in main or another method, and test them.
		 */
		int i = 1;
		while (i <= 6) {
			System.out.printf("%4d", 2 * i);
			i++;
		}
		System.out.println();

		printRow(8, 10);
		printMultiplicationTable(10);
	}

	/*
	 * 2. When they are working, wrap them in a new method, and test again. 3. If
	 * it’s appropriate, replace literal values with variables and parameters.
	 */
	public static void printRow(int n, int cols) {
		int i = 1;
		while (i <= cols) {
			System.out.printf("%4d", n * i);
			i++;
		}
		System.out.println();
	}

	/**
	 * By now you can probably guess how we are going to display a multiplication
	 * table: we’ll invoke printRow repeatedly with different arguments. In fact,
	 * we’ll use another loop to iterate through the rows.
	 * 
	 * @param n
	 */
	public static void printMultiplicationTable(int n) {
		int i = 1;
		while (i <= n) {
			printRow(i, i);
			i++;
		}

	}

}
