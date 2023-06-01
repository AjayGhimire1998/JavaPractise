package inheritance;

public class Student extends Person {
	String school;
	int rollNo;

	Student(String name, int age) {
		super(name, age);
	}

	Student(String name, int age, String school, int rollNo) {
		super(name, age);
		this.school = school;
		this.rollNo = rollNo;
	}

	@Override
	void info() {
		System.out.println(getName() + " studies in " + school + " and the roll number is " + rollNo);
	}

	@Override
	void setName(String name) {
		System.out.println("Just print" + name);
	}

	public static void main(String[] args) {
		Person person = new Person("Ajay", 24);
		person.info();
		Student student = new Student("Ajay", 24, "SSSBS", 1);
		student.info();
		student.setName("Wassup");
		student.info();
		student.setName("hehe");
		student.info();

	}

}
