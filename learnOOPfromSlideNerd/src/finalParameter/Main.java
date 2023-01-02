package finalParameter;

public class Main {

	public static void main(String[] args) {
	}

	public static int incrementAge(final int age) {

		age = age + 1; // invalid, age is final

		return age;
	}

}
