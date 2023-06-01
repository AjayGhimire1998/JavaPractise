package inheritance;

public class Person {
	private String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void info() {
		System.out.println("Person is " + name + ", and the age is " + age);
	}

	public static void main(String[] args) {
		Person person = new Person("Ajay", 23);
//		person.info();
	}
}
