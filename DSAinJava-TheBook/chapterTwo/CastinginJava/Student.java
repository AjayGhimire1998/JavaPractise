package CastinginJava;

public class Student implements Person {
	private String id;
	private String name;
	private int age;

	Student(String i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	@Override
	public boolean equals(Person other) {
		return false;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {

		return age;
	}

	public String getId() {
		return id;
	}

}
