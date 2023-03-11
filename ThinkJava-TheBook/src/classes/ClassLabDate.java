package classes;

import java.time.LocalDate;

/**
 * Write a class definition for Date, an object type that contains three
 * integers: year, month, and day. This class should provide two constructors.
 * The first should take no parameters and initialize a default date. The second
 * should take parameters named year, month and day, and use them to initialize
 * the instance variables.
 * 
 * Write a main method that creates a new Date object named birthday. The new
 * object should contain your birth date. You can use either constructor.
 * 
 * @author ajayghimire
 *
 */
public class ClassLabDate {
	private int year;
	private int month;
	private int day;
	static LocalDate now = LocalDate.now();

	public static void main(String[] args) {
		ClassLabDate birthday = new ClassLabDate(1998, 9, 9);
		System.out.println("year: " + birthday.year);
		System.out.println("month: " + birthday.month);
		System.out.println("day: " + birthday.day);

		System.out.println();

		ClassLabDate now = new ClassLabDate();
		System.out.println("year: " + now.year);
		System.out.println("month: " + now.month);
		System.out.println("day: " + now.day);
	}

	public ClassLabDate() {
		this(now.getYear(), now.getMonthValue(), now.getDayOfMonth());

	}

	ClassLabDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

}
