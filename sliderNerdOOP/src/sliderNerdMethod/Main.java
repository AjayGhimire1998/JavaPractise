package sliderNerdMethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int total = add(3, 5);
//		System.out.println(total);

//		System.out.println("");
//		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//		for (int i = 1; i < stackTraceElements.length; i++) {
//			System.out.println(stackTraceElements[i].toString());
//
//		}
//		int i = 5, j = 7, result;
//		result = max(i, j);

//		System.out.println(i.negative?);

		// method overloading

		System.out.println(max(5, 7));
		System.out.println(max(5.0, 7.0));
		System.out.println(max(5, 7.0));
		System.out.println(max(5.0, 7));

	}

//	public static int add(int a, int b) {
//		return a + b;
//	};

//	public static int max(int a, int b) {
//		int max;
//		if (a > b) {
//			max = a;
//		} else {
//			max = b;
//		}
//		System.out.println("");
//		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//		for (int i = 1; i < stackTraceElements.length; i++) {
//			System.out.println(stackTraceElements[i].toString());
//
//		}
//		return max;
//
//	}

	public static int max(int a, int b) {
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;

		}
		return max;
	}

	public static double max(double a, double b) {
		double max;
		if (a > b) {
			max = a;
		} else {
			max = b;

		}
		return max;
	}

}
