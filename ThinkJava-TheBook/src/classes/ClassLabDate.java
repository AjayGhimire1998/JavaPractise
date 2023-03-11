package classes;

import java.time.LocalDate;

public class ClassLabDate {
	private int year;
	private int month;
	private int day;
	static LocalDate now = LocalDate.now();

	public static void main(String[] args) {
		ClassLabDate birthday = new ClassLabDate(1998, 9, 9);
		System.out.println(birthday.year);
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
