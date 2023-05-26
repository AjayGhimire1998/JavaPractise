package experimentalStudies;

public class Time {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		for (int i = 1; i <= 10000000; i++) {
			System.out.println(i);
		}

		long endTime = System.currentTimeMillis();
		long elapsed = endTime - startTime;
		System.out.println("time taken: " + elapsed / 1000);
	}
}
