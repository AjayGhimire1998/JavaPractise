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

//		C c = new C();
//		System.out.println(c.intB);
//		B bb = new B();
//		B b = new B(5, 10); 

		// superClass reference
//		Person p1 = new Person();
//		Person p2 = new Person();
//		Student s1 = new Student();
//		Student s2 = new Student();

//		Person p3 = new Student();
//		Person p4 = s1;
//		System.out.println(p4.name);

//		Student s = new Student();
//		Person p = new Person();
//		Student s = (Student) p;
//		Person p = s;

//		System.out.println(p.name);
//		System.out.println(s.name);

//		Person p = new Student();
//		Student s = (Student) p;

//		Student s = null;
//		System.out.println(s);
//		System.out.println(s instanceof Student);

		// instanceof

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

//class A {
//
//	int intA;
//
////	A() {
////		System.out.println("Inside A constructor");
////	}
//
//	A(int a) {
//		System.out.println("Inside super class constructor which takes one argument");
//		this.intA = 2 * a;
//
//	}
//
//}
//
//class B extends A {
//	int intB = 20;
//
//	B() {
//		super(0);
//		System.out.println("Inside B constructor");
//	}
//
//	B(int a, int b) {
//		super(a);
//		this.intB = b;
//
//		System.out.println("IntA: " + intA);
//		System.out.println("IntB: " + intB);
//
//	}
//}

//class C extends B {
//	int intC = 30;
//
//	C() {
//		System.out.println("Inside C constructor");
//	}
//
//}

//superclass reference

class Person {
	String name = "Ajay";
	int age;
	String address;
}

class Student extends Person {
//	String name;
//	int age;
//	String address;
	int marks;
	int rollNumber;

	public Student() {
		System.out.println("Created Student");
	}
}
