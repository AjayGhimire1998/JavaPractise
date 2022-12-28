package inheritance2;

public class Student extends Person {
	int age = 23;

	@Override
	public void getAge() {
		super.getAge();
		System.out.println("Age of Student: " + age);

	}

}
