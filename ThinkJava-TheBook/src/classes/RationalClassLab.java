package classes;

/**
 * A rational number is a number that can be represented as the ratio of two
 * integers. For example, 2/3 is a rational number, and you can think of 7 as a
 * rational number with an implicit 1 in the denominator.
 * 
 * @author ajayghimire
 *
 */
public class RationalClassLab {

	/*
	 * Define a class called Rational. A Rational object should have two integer
	 * instance variables that store the numerator and denominator.
	 */

	private int numerator;
	private int denominator;

	public static void main(String[] args) {

	}

	/*
	 * Write a constructor that takes no arguments and that sets the numerator to 0
	 * and denominator to 1
	 */
	RationalClassLab() {
		this(0, 1);
	}

	/*
	 * Write a second constructor that takes two arguments and uses them to
	 * initialize the instance variables
	 */
	RationalClassLab(int num, int denom) {
		this.numerator = num;
		this.denominator = denom;
	}

	/*
	 * Write an instance method called printRational that displays a Rational in
	 * some reasonable format.
	 */
	public void printRational() {
		System.out.printf("%d:%d", this.numerator, this.denominator);
	}

}
