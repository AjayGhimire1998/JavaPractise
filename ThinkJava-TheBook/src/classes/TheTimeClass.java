package classes;

public class TheTimeClass {

	public static void main(String[] args) {
		TheTimeClass time1 = new TheTimeClass();
		System.out.println(time1.hour);
		time1.printValues();
		time1.printMinutesOnly();

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
	public void printValues() {
		System.out.println(this.hour + " hour : " + this.minute + " minute : " + this.second + " second");

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

}
