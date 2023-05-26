package experimentalStudies;

public class Time {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

//		for (int i = 1; i <= 10000000; i++) {
//			System.out.println(i);
//		}
		repeat1('*', 500000);
//		repeat2('*', 500000);

		long endTime = System.currentTimeMillis();
		long elapsed = endTime - startTime;
		System.out.println("time taken: " + elapsed / 1000);
	}

	public static String repeat1(char c, int n) {
		String answer = "";
		for (int i = 0; i < n; i++) {
			answer += c;
//			System.out.println(answer);
//			System.out.println();

		}

		return answer;
	}

	public static String repeat2(char c, int n) {
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < n; i++) {
			answer.append(c);
//			System.out.println(answer);
//			System.out.println();
		}
		return answer.toString();
	}
}
