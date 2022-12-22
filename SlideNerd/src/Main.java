
public class Main {

	public static void main(String args[]) {
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//
//		}
//		System.out.println(123.54);

//		float PI = (float) 3.1429;
//
//		System.out.println(PI);

//		short myValue = 256;
//		
//
//		System.out.println((double) myValue);
//		System.out.println(New.salary);

//		char myKey = 98;
//		System.out.println(myKey);

//		int earthRad = 6271;
//		long radius = earthRad;
//
//		System.out.println(radius);

		// type casting:

//		double age =  74578325985;
//		long youAge = age;

//		char letter = 'A';
//		int number = letter;

//		long number = 1241251369453L;
//		int value = (int) number;

//		double number = 3.21425412515125F;
//		float value = (float) number;
//
//		System.out.println(number);
//		System.out.println(value);
//		System.out.println(youAge);

//		int letter = 65;
//		char alphabel = (char) letter;
//
//		System.out.println(letter);
//		System.out.println(alphabel);

//		int value = ((3 * 41) + (7 / 3)) - (2 % 1);
//
//		System.out.println(value);
//		System.out.println(12 - 4 * 4);

		// arithmetic operators

//		int average = (1 + 2 + 3 + 4 + 5) / 5;
//		System.out.println(average);

//		double answer = (double) 9 / 2;
//		System.out.println(answer);

//		int answer = 43 % 3;
//		System.out.println(answer);
//
//		boolean answer = 5 != 5.0;
//		System.out.println(answer);

		// relation operators

//		int myAge = 24;
//		int yourAge = 23;
//		boolean resullt = myAge != yourAge;
//		System.out.println(resullt);

//		double num1 = 0.7F + 0.1F;
//		double num2 = 0.9F - 0.1F;

//		float num1 = 0.7F + 0.1F;
//		float num2 = 0.9F - 0.1F;

//		int result = Double.compare(num1, num2);

//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num1 == num2);
//		System.out.println(result);

//		Double d1 = 10d;
//		Double d2 = 1023d;
//
//		// function call to compare two double values
//		if (Double.compare(d1, d2) == 0) {
//
//			System.out.println("d1=d2");
//		} else if (Double.compare(d1, d2) < 0) {
//
//			System.out.println("d1<d2");
//		} else {
//
//			System.out.println("d1>d2");
//		}

		// Assignment operators
//		System.out.println(getValue());

//		int num1 = 5;
//		int num2 = 4;
//
//		num1 %= num2;
//		System.out.println(num1);

//		int age1 = 24;
//		int age2 = 4;
//
//		age2 += age1;
//		System.out.println(age2);

		// increment, decrement and logical operators;

//		int year = 2050;
//		int newYear;
//		newYear = --year;
//		System.out.println(newYear);

//		boolean engaged = false;
//		boolean notEngaged = !engaged;
//		System.out.println(notEngaged);

//		boolean dcFan = true, marvelFan = true;
//
//		if (dcFan && marvelFan) {
//			System.out.println("Like superheroes");
//		}
//		if (dcFan || marvelFan) {
//
//			System.out.println("dont you?");
//		} else {
//			System.out.println("I guesss not!");
//		}

//		int a = 13;
//		int b = 9;
//		int c = a++ * --b + b-- - --a;
//		int c = a++;

		// 13, a = 14
		// 13 * 8
		// 104 + 8, b = 7
		// 104 + 8 - 13
		// 99

//		System.out.println(c);
//		System.out.println(a);

//		int myAge = 6;
//		int yourAge = 16;

//		System.out.println(myAge > 18 && yourAge > 18);
//		System.out.println(!(myAge > 8));

		// if else
//		int marks = 99;
//
////		if (marks >= 80 && marks < 90) {
////			System.out.println("Imma buy you a bike!");
////		}
//		if (marks == 90)
//			;
//		if (marks >= 89) {
//			if (marks >= 95) {
//				System.out.println("You get a car");
//
//			} else {
//				System.out.println("You get a bike");
//			}
//		} else {
//			System.out.println("Go to the tuition");
//		}

		// short-circuit

		// Since first operand is false
		// and operator is &&,
		// Evaluation stops and
		// false is returned.
//		if (false && true && true) {
//			System.out.println("This output " + "will not " + "be printed");
//		} else {
//
//			System.out.println("This output " + "got printed actually, " + " due to short circuit");
//		}

		// Whole expression will be evaluated,
		// as no false is encountered
		// before last condition
		// Therefore no Short circuit
//		if (true && true && true) {
//			System.out.println("This output " + "gets print" + " as there will be" + " no Short circuit");
//		} else {
//
//			System.out.println("This output " + "will not " + "be printed");
//		}
//		if (true && true && true) {
//			System.out.println("This output " + "gets print" + " as there will be" + " no Short circuit");
//		} else {
//
//			System.out.println("This output " + "will not " + "be printed");
//		}

		// Since first operand is true
		// and operator is ||,
		// Evaluation stops and
		// true is returned.
//		if (true || false || false) {
//			System.out.println("This output " + "got printed actually, " + " due to short circuit");
//		} else {
//			System.out.println("This output " + "will not " + "be printed");
//		}

		// Whole expression will be evaluated,
		// as no true is encountered
		// before last condition
		// Therefore no Short circuit
//		if (false || false || true) {
//			System.out.println("This output " + "gets print" + " as there will be" + " no Short circuit");
//		} else {
//
//			System.out.println("This output " + "will not " + "be printed");
//		}

//		int age = 25;
//
//		char youth = age >= 25 ? 'Y' : 'N';
//
//		System.out.println(youth);

//		String day = "Monday";
//
//		switch (day) {
//		case ("Sunday"):
//			System.out.println("It is sunday.");
//			break;
//		case ("Monday"):
//			System.out.println("It is monday");
//			break;
//		default:
//			System.out.println("No Dayyy");
//		}

//		int marks = 86;
//
//		switch (marks / 10) {
//		case 10:
//		case 9:
//			System.out.println("Grade: A");
//			break;
//		case 8:
//			System.out.println("Grade: B");
//			break;
//		default:
//			System.out.println("Grade: C");
//			break;
//		}

		// for loop

//		for (int i = 100; i >= 10; i--) {
//			System.out.println("Decreasing: " + i);
//			for (int j = 0; j <= 90; j++) {
//
//				System.out.println("Increasing: " + j);
//				System.out.println("Product: " + i * j);
//			}
//
//		}

//		for (int i = 1; i <= 10; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// while loop
//		int i = 0;
//		while (i <= 5) {
//			System.out.println("Hello");
//			i++;
//
//			if (i == 4) {
//				i = 5;
//			}
//		}

//		int i = 0;
//		do {
//			System.out.println("hello world");
//			i++;
//		} while (i <= 10);

//		do {
//			System.out.println("hello");
//		} while (false);

//		while (true) {
//			System.out.println("Hello world");
//			break;
//
//		}

//		int count = 0;
//		for (int i = 0; i <= 100; i++) {
//			if (i % 3 == 0) {
//				System.out.println(i);
//				count++;
//			}
//			if (count == 10) {
//				break;
//			}
//		}

		// labelled break
//
//		ajay: for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.println("i: " + i);
//
//				System.out.println("j: " + j);
//				if (i == 1) {
//					break ajay;
//				}
//			}
//		}

		// continue

//		for (int i = -10; i < 10; i++) {
//			if (i == 0) {
//				continue;
//			}
//			System.out.println(100 / i);
//		}

		// Strings

//		String str = null;
//		str = "Hello";
//		System.out.println(str);

//		String string = String.valueOf("Hello world");
//
//		string += " from AJAY";
//		string.concat(" HEHEHEHEH");
//		System.out.println(string);

//		String hello = "Hello World";
//		String hello2 = new String("Hello");
//		String hello3 = "\"hello\"";

//		System.out.println(hello == hello2);
//		System.out.println(hello.equals(hello2));
//		System.out.println(hello == hello3);
//		System.out.println(hello.equalsIgnoreCase(hello3));
//		System.out.println(hello.indexOf('o'));
//		System.out.println(hello.indexOf("llo"));
//		System.out.println(hello.indexOf('l', 5));
//		System.out.println(hello.charAt(4));
//		System.out.println(hello.substring(3, 10));
//		System.out.println(hello.contains(hello2));
//		System.out.println(hello.trim());
//		System.out.println(hello.split(","));
//		System.out.println(hello3);

		// StringBuilder

//		StringBuilder sb = new StringBuilder();
//
//		sb.append("hello worldddd");
//		sb.append(" world");
//
//		System.out.println(sb);

//		byte b = 1;
//		String result = String.valueOf(b);
//		System.out.println(result);

//		float f = 22.45f;
//		String result = String.valueOf(f);
//		System.out.println(result);

//		String string = "12";
////		System.out.println(((Object) string).getClass().getSimpleName());
////		byte b = Byte.parseByte(string);
////		System.out.println(b);
//		int i = Integer.parseInt(string);
//		System.out.println(((Object)i).getClass().getSimpleName());
//		System.out.println(i);
//
//		boolean b = Boolean.parseBoolean("false");
//		System.out.println(((Object) b).getClass().getName());
//		System.out.println(add(5, 6));
//
	}
//
//	static int add(int a, int b) {
//		return a + b;
//	}

//	public static float getValue() {
//
//		return ((3 * 41) + (7 / 3)) - (2 % 1);
//	}

}

//class New {
//	final static float salary = 0.99f;
//	System.out.println(salary);

//}
