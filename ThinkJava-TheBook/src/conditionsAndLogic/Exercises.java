package conditionsAndLogic;

public class Exercises {

	public static void main(String[] args) {
//		checkFermat(3, 5, 7, 2);
		beerRap(100);
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

	/*
	 * The purpose of this exercise is to take a problem and break it into smaller
	 * problems, and to solve the smaller problems by writing simple methods.
	 * Consider the first verse of the song “99 Bottles of Beer”: 99 bottles of beer
	 * on the wall, 99 bottles of beer, ya’ take one down, ya’ pass it around, 98
	 * bottles of beer on the wall. Subsequent verses are identical except that the
	 * number of bottles gets smaller by one in each verse, until the last verse: No
	 * bottles of beer on the wall, no bottles of beer, ya’ can’t take one down, ya’
	 * can’t pass it around, ’cause there are no more bottles of beer on the wall!
	 * And then the song (finally) ends. Write a program that displays the entire
	 * lyrics of “99 Bottles of Beer”. Your program should include a recursive
	 * method that does the hard part, but you might want to write additional
	 * methods to separate other parts of the program. As you develop your code,
	 * test it with a small number of verses, like 3.
	 */

	public static void beerRap(int num) {
		if (num == 0) {
			System.out.println("No bottles of beer on the wall,\n" + "no bottles of beer,\n"
					+ "ya’ can’t take one down, ya’ can’t pass it around,\n"
					+ "’cause there are no more bottles of beer on the wall!");
		} else {
			System.out.printf(
					"%d bottles of beer on the wall,\n%d bottles of beer,\nya’ take one down, ya’ pass it around,\n%d bottles of beer on the wall.\n\n",
					num, num, num - 1);
			beerRap(num - 1);
		}

	}
}
