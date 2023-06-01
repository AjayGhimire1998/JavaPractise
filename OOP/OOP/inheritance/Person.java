package inheritance;

public class Person {
	private String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	void info() {
		System.out.println("Person is " + name + ", and the age is " + age);
	}

	public static void main(String[] args) {
		Person person = new Person("Ajay", 23);
//		person.info();
	}

}
