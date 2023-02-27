package conditionsAndLogic;

public class Exercises {

	public static void main(String[] args) {
		checkFermat(3, 5, 7, 2);
	}

	/**
	 * Fermat’s Last Theorem says that there are no integers a, b, and c such that a
	 * n + b n = c n , except when n≤ 2. Write a method named checkFermat that takes
	 * four integers as parameters—a, b, c and n—and checks to see if Fermat’s
	 * theorem holds. If n is greater than 2 and a n + b n = c n , the program
	 * should display “Holy smokes, Fermat was wrong!” Other‐ wise the program
	 * should display “No, that doesn’t work.” Hint: You may want to use Math.pow
	 */
	public static void checkFermat(int a, int b, int c, int n) {

		System.out.println(Math.pow(a, n) + Math.pow(b, n));
		System.out.println(Math.pow(c, n));
		boolean fermatTheory = (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n));

		if (n > 2 && fermatTheory) {
			System.out.println("holy Smokees!! He was wrong!");
		} else {
			System.out.println("No, that does not work");
		}
	}

}
