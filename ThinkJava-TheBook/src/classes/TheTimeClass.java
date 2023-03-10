package classes;

public class TheTimeClass {

	public static void main(String[] args) {
		TheTimeClass time1 = new TheTimeClass(2, 67, 22);
		System.out.println(time1.toString());
//		System.out.println(time1.hour);
//		printTime(time1);
//		time1.printMinutesOnly();

	}

	private int hour;
	private int minute;
	private double second;

//	Like other methods, constructors can be overloaded, which means you can provide
//	multiple constructors with different parameters. Java knows which constructor to
//	invoke by matching the arguments you provide with the parameters of the construc‐
//	tors.
	public TheTimeClass() {
		this(0, 0, 0);
	}

	public TheTimeClass(int hour) {
		this(hour, 0, 0);
	}

	public TheTimeClass(int hour, int minute) {
		this(hour, minute, 0);
	}

	public TheTimeClass(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	// printing values
	public static void printTime(TheTimeClass time) {
//		System.out.println(this.hour + " hour : " + this.minute + " minute : " + this.second + " second");
//		System.out.print(time.hour);
//		System.out.print(":");
//		System.out.print(time.minute);
//		System.out.print(":");
//		System.out.print(time.second);
//		System.out.println();

		System.out.printf("%02d:%02d:%04.1f\n", time.hour, time.minute, time.second);

	}

	// overriding default toString method
	public String toString() {
		return String.format("%02d:%02d:%04.1f\n", this.hour, this.minute, this.second);
	}

	// overriding default equals method
	public boolean equals(TheTimeClass time) {
		return this.hour == time.hour && this.minute == time.minute && this.second == time.second;
	}

	// passing this as arguments
	public void printMinutesOnly() {
		System.out.println(this.inMinutes(this.hour, this.minute, this.second) + " minutes");
	}

	// returning total number of minutes
	public int inMinutes(int hour, int minutes, double second) {
		return hour * 60 + minutes + (int) second / 60;

	}

	/*
	 * Recall that the instance variables of Time are private. We can access them
	 * from within the Time class, but if we try to access them from another class,
	 * the compiler generates an error.
	 */

	// getters

	/*
	 * Methods like these are formally called “accessors”, but more commonly
	 * referred to as getters. By convention, the method that gets a variable named
	 * something is called getSomething.
	 */
	public int getHour() {
		return this.hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public int getSecond() {
		return (int) this.second;
	}

	// setters
	/*
	 * These methods are formally called“mutators”, but more commonly known as
	 * setters. The naming convention is similar; the method that sets something is
	 * usually called setSomething.
	 */

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	// adding time

	/*
	 * Suppose you are going to a movie that starts at 18:50 (or 6:50 PM), and the
	 * running time is 2 hours 16 minutes. What time does the movie end?
	 */

	// We could write a static method that takes the two Time objects as parameters.
	public static TheTimeClass add(TheTimeClass time1, TheTimeClass time2) {
		TheTimeClass sum = new TheTimeClass();
		sum.hour = time1.hour + time2.hour;
		sum.minute = time1.minute + time2.minute;
		sum.second = time1.second + time2.second;
		return sum;
	}
}
