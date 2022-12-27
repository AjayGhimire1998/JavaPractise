package constructorsAndOverloading;

public class Person {
	String fName;
	String lName;
	int age;

	Person(String f, String l, int a) throws IllegalArgumentException {
		System.out.println("paramaterised constructor is called");
		if (a < 0) {
			throw new IllegalArgumentException("Age must be valid");
		}
		fName = f;
		lName = l;
		age = a;
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(age);
		System.out.println("-----------------------------");
	}

	Person(String f) {
		this(f, null, 0);
	}
}
