package stringAndThings;

public class StringFormatting {
	public static void main(String[] args) {
		String result = timeString(14, 9);
		System.out.println(result);

		/*
		 * Each wrapper class defines constants MIN_VALUE and MAX_VALUE. For example,
		 * Integer.MIN_VALUE is -2147483648, and Integer.MAX_VALUE is 2147483647.
		 * Because these constants are available in wrapper classes, you don’t have to
		 * remember them, and you don’t have to include them in your programs.
		 */
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);

		String str = "12334456";
		System.out.println(Integer.parseInt(str));

		int num = 123455;
		System.out.println(Integer.toString(num));

	}

	/*
	 * String.format takes the same arguments as System.out.printf: a format
	 * specifier followed by a sequence of values. The main difference is that
	 * System.out.printf dis‐ plays the result on the screen; String.format creates
	 * a new string, but does not dis‐ play anything.
	 * 
	 * In this example, the format specifier %02d means “two digit integer padded
	 * with zeros”, so timeString(19, 5) returns the string "07:05 PM".
	 */
	public static String timeString(int hour, int minutes) {
		String ampm;
		if (hour < 12) {
			ampm = "AM";
			if (hour == 0) {
				hour = 12;
			}
		} else {
			ampm = "PM";
			hour = hour - 12;
		}
		return String.format("%02d:%02d %s", hour, minutes, ampm);
	}
}
