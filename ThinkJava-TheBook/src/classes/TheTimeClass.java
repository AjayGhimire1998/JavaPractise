package classes;

public class TheTimeClass {

	public static void main(String[] args) {
		TheTimeClass time1 = new TheTimeClass(2);
		System.out.println(time1.hour);
		time1.printValues();
	}

	private int hour;
	private int minute;
	private double second;

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

	public void printValues() {
		System.out.println(this.hour + " hour : " + this.minute + " minute : " + this.second + " second");

	}

}
