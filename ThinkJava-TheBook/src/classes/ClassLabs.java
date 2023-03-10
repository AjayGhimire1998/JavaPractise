package classes;

public class ClassLabs {
	private int hour;
	private int minute;
	private double second;

	/**
	 * The implementation of increment in this chapter is not very efficient. Can
	 * you rewrite it so it doesn’t use any loops? Hint: Remember the modulus
	 * operator.
	 * 
	 * @param second
	 */
	public void incrementTwo(double second) {
		this.second += second;
		this.minute += this.second / 60;
		this.second %= 60;
		this.hour += this.minute / 60;
		this.minute %= 60;
	}
}
