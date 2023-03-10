package classes;

public class TimeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheTimeClass time = new TheTimeClass(2, 6, 90);

		TheTimeClass time2 = new TheTimeClass(2, 6, 90);
		TheTimeClass time3 = time;
//		TheTimeClass.printTime(time);
//		time.printMinutesOnly();
//		System.out.println(time.getHour());
//		System.out.println(time.getSecond());
//		time.setHour(10);
//		System.out.println(time.getHour());
//		time.printMinutesOnly();

		/*
		 * The == operator checks whether objects are identical; that is, whether they
		 * are the same object.
		 * 
		 * The equals method checks whether they are equivalent; that is, whether they
		 * have the same value.
		 */
		System.out.println(time);
		System.out.println(time.toString());

		System.out.println(time.equals(time2));
		System.out.println(time.equals(time3));
		System.out.println(time3.equals(time));
		System.out.println(time2.equals(time3));

		System.out.println(time == time3);
		System.out.println(time2 == time3);

		TheTimeClass startTime = new TheTimeClass(18, 30, 30);
		TheTimeClass movieLength = new TheTimeClass(0, 220, 220);
		System.out.println(
				"Movie End Time using 2 time params static method: " + TheTimeClass.add(startTime, movieLength));
		System.out.println("Movie End Time using one time param instance method: " + startTime.add(movieLength));
	}

}
