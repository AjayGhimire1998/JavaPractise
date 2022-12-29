package superKeyword;

public class Main {

	public static void main(String[] args) {

		// super on classes
//		Student student = new Student();
//		student.getInfo();

		// super on constructors
//		C c = new C();
//		System.out.println(c.name);

//		B b = new B();

	}

}

//super on classes

//class Person {
//
//	String name = "Ajay";
//
//	public void getInfo() {
//		System.out.println("Name of the person: " + name);
//	}
//
//}
//
//class Student extends Person {
//
//	int marks = 100;
//
//	public void getInfo() {
//		super.getInfo();
////		System.out.println(super.name);
//		System.out.println("Marks scored: " + marks);
//
//	}
//
//}

//super in constructors

class A {

	String name = "Ajay";

	A() {
		System.out.println("Inside A constructor");
	}

}

class B extends A {
	B() {
		System.out.println("Inside B constructor");
	}
}

class C extends B {
	C() {
		System.out.println("Inside C constructor");
	}

}