package thisKeyword;

public class Main {

	public static void main(String[] args) {

//		Test test1 = new Test();
//		Test test2 = new Test();

//		System.out.println(test1.id);
//		System.out.println(test2.id);

//		Test test2 = new Test();
//		System.out.println(test2.id);

//		Test test3 = new Test();
//		System.out.println(test3.id);
//		System.out.println(Test.id);
//		System.out.println(Test.myConditiob);
//		System.out.println(Test.c);
//		System.out.println(Test.obj);
//		System.out.println(test3.uId);

		// == vs euals

//		String s1 = new String("hello");
//		String s2 = new String("hello");
//
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));

//		System.exit(0);

		// static methods
		Person person = new Person();
		person.getYear();

		Person.getAge();

//		Person.getAge();

	}

}

//class Test {
//	static int id = 1000;
//	static boolean myConditiob = true;
//	static char c = 'A';
//	static Object obj = new Object();
//	static int uId;
//	static {
//		uId = 0;
//		System.out.println("Look I am first");
//	}
//	static {
//		uId = 3;
//		System.out.println("Look I am second");
//	}
//
//	Test() {
//		uId++;
//		System.out.println("Contructors called");
//	}
//}

class Person {

	String name;
	String address;
//	int day;
//	int month;
//	int year;
//	int age = 20;
//	static int years = 1000;

//	static void getAge() {
//		System.out.println(years);
//	}
//
//	public void getYear() {
//		System.out.println(years);
//		System.out.println(age);
//	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public static void calculateAge(int day, int month, int year) {

	}
}
