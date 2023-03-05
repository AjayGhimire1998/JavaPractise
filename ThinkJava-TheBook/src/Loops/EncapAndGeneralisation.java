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

		printRow(8);
	}

	/*
	 * 2. When they are working, wrap them in a new method, and test again. 3. If
	 * it’s appropriate, replace literal values with variables and parameters.
	 */
	public static void printRow(int n) {
		int i = 1;
		while (i <= 6) {
			System.out.printf("%4d", n * i);
			i++;
		}
		System.out.println();
	}

}
