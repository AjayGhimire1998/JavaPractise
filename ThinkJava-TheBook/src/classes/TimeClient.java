package classes;

public class TimeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheTimeClass time = new TheTimeClass(2, 6, 90);
		TheTimeClass.printTime(time);
		time.printMinutesOnly();
		System.out.println(time.getHour());
		System.out.println(time.getSecond());
		time.setHour(10);
		System.out.println(time.getHour());
		time.printMinutesOnly();
	}

}
