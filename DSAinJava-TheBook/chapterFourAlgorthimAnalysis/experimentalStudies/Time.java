package experimentalStudies;

public class Time {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		for (int i = 1; i <= 100000000; i++) {
			System.out.println(i);
		}

	}
}
