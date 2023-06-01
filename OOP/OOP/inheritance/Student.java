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

//	@Override
	void info() {
		System.out.println("Student studies in " + school + " and the roll number is " + rollNo);
	}

	public static void main(String[] args) {
		Person person = new Person("Ajay", 24);
		person.info();
		Person student = new Student("Ajay", 24, "SSSBS", 1);
		student.info();

	}

}
