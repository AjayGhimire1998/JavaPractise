package variableScope;

public class Person {
	String firstName;
	String lastName;
	boolean test;
	int age;
	double x;
	float f;
	char z;

	public Person(String n) {
		firstName = n;
	}

	public Person(String l, int a) {
		lastName = l;
		age = a;

	}

	public void display() {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(test);
		System.out.println(age);
		System.out.println("x: " + x);
		System.out.println("f: " + f);
		System.out.println("z: " + z);

		if (firstName != null) {
			System.out.println(firstName.length());
		}
	}

	public void test() {
//		System.out.println(number);
	}

}
