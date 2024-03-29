package conditionsAndLogic;

import java.util.Random;
import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {
//		checkFermat(3, 5, 7, 2);
//		beerRap(100);

		guessMyNumber();
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

	/**
	 * Now that we have conditional statements, we can get back to the “Guess My
	 * Number” game from Exercise 3-4. You should already have a program that
	 * chooses a random number, prompts the user to guess it, and displays the
	 * difference between the guess and the chosen number. Adding a small amount of
	 * code at a time, and testing as you go, modify the program so it tells the
	 * user whether the guess is too high or too low, and then prompts the user for
	 * another guess. The program should continue until the user gets it right.
	 * Hint: Use two methods, and make one of them recursive.
	 */

	public static void guessMyNumber() {

		Random random = new Random();
		int rand = random.nextInt(10) + 1;
		System.out.println(
				"I'm thinking of a number between 1 and 100\n" + "(including both). Can you guess what it is?");
		System.out.print("Type a number: ");
		Scanner in = new Scanner(System.in);

		int guess = in.nextInt();
		System.out.println("Your guess is: " + guess);

		System.out.println("The number I was thinking is: " + rand);

		if (rand == guess) {
			System.out.println("Damn, youy got it right!!");
		} else {
			if (guess > rand) {
				System.out.println("you were off by: " + (guess - rand));
			} else {
				System.out.println("you were off by: " + (rand - guess));
			}
			guessMyNumber();

		}

	}

}
