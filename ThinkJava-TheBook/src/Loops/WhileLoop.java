package Loops;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		countDown(10);
		sequence(97);

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
			System.out.println(n);
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

}
