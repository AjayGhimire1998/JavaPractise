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

	/*
	 * Write a main method that creates a new object with type Rational, sets its
	 * instance variables to some values, and displays the object.
	 * 
	 * Write a toString method for Rational and test it using println.
	 *
	 */
	public static void main(String[] args) {
		RationalClassLab rational = new RationalClassLab(10, 5);
//		rational.printRational();
		System.out.println(rational);
//		rational.negate();
		System.out.println(rational);
//		rational.inverse();
		System.out.println(rational);

		System.out.println(rational.toDouble());

		System.out.println(rational.reduce());
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
		System.out.printf("%d/%d", this.numerator, this.denominator);
	}

	/* Write a toString method for Rational and test it using println. */
	@Override
	public String toString() {
		return String.format("%d/%d", this.numerator, this.denominator);
	}

	/*
	 * Write an instance method called negate that reverses the sign of a rational
	 * num‐ ber. This method should be a modifier, so it should be void. Add lines
	 * to main to test the new method.
	 */
	public void negate() {
		this.numerator = -this.numerator;
	}

	/*
	 * Write an instance method called invert that inverts the number by swapping
	 * the numerator and denominator. It should be a modifier. Add lines to main to
	 * test the new method.
	 */
	public void inverse() {
		int temp = this.numerator;
		this.numerator = this.denominator;
		this.denominator = temp;
		;
	}

	public double toDouble() {
		return (double) this.numerator / this.denominator;
	}

	/*
	 * Write an instance method named reduce that reduces a rational number to its
	 * lowest terms by finding the greatest common divisor (GCD) of the numerator
	 * and denominator and dividing through. This method should be a pure method; it
	 * should not modify the instance variables of the object on which it is
	 * invoked.
	 * 
	 * Hint: Finding the GCD only takes a few lines of code. Search the web for
	 * “Eucli‐ dean algorithm”
	 * 
	 */
	public RationalClassLab reduce() {
		int gcd = gcd(this.numerator, this.denominator);
		int reducedNum = this.numerator / gcd;
		int reducedDenom = this.denominator / gcd;
		return new RationalClassLab(reducedNum, reducedDenom);
	}

	public int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

}
