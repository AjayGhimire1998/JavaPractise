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
		if (!(other instanceof Student)) {
			return false;
		}
		Student s = (Student) other;
		return id.equals(s.id);
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

	protected int studyHours() {
		return age / 2;
	}

	public String toString() {
		return "Student(ID: " + id + ", Name: " + name + ", Age: " + age + ")";
	}

	public static void main(String[] args) {
		Student s = new Student("42003s", "Ajay", 24);
		System.out.println(s.toString());

		Person p = new Student("42003s", "ajayay", 21);
		System.out.println(p.toString());

		System.out.println(s.equals(p));
	}

}
