package Loops;

public class ForLoop {

	public static void main(String[] args) {
		printTable(10);
	}

	/**
	 * The loops we have written so far have several elements in common. They start
	 * by ini‐ tializing a variable, they have a condition that depends on that
	 * variable, and inside the loop they do something to update that variable. This
	 * type of loop is so common that there is another statement, the for loop, that
	 * expresses it more concisely.
	 * 
	 * @param rows
	 */
	public static void printTable(int rows) {
		for (int i = 1; i <= rows; i++) {
//			EncapAndGeneralisation.printRow(i, rows);
			printRow(i, rows);
		}
	}

	/**
	 * The last line tries to display i (for no reason other than demonstration) but
	 * it won’t work. If you need to use a loop variable outside the loop, you have
	 * to declare it out‐ side the loop, like this:
	 * 
	 * @param n
	 * @param cols
	 */
	public static void printRow(int n, int cols) {
		int i;
		for (i = 1; i <= cols; i++) {
			System.out.printf("%4d", n * i);
		}
		System.out.println();
	}

}
