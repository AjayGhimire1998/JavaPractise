package inheritance;

class Vehicle {
	String type = "Vehicle";
	int model = 2020;

	public void drive() {
		System.out.println("Vrooooom...Vroooomm....Vooooooooooom");
	}

}

class Bike extends Vehicle {
}

//class Main {
//
//	public static void main(String[] args) {
//
//		Bike bike = new Bike();
//
//		System.out.println(bike.type); // accesses instance variable of super-class
//		bike.drive(); // accesses methods of super-class
//	}
//
//}

class Test {
	int x = 1;

	public void instanceVariable() {
		System.out.println("Instance Variable Value: " + x);
	}

	public void foo(int x) {
		// method parameter x shadows the instance variable x
		System.out.println("Argument Value: " + x);
	}

	public void bar() {
		int x = 2; // local variable x shadows the instance variable x
		System.out.println("Local Variable Value: " + x);
	}

}

//public class Main {
//
//	public static void main(String[] args) {
//
//		Test test = new Test(); // instantiation of a test object
//		test.instanceVariable(); // prints the value of the instance variable
//		test.foo(5); // prints the value of the argument x
//		test.bar(); // prints the value of the local variable x
//
//	}
//
//}

//class SuperClass {
//	int x = 1;
//}
//
//class SubClass extends SuperClass {
//	int x = 2;
//
//	public void foo() {
//		System.out.println("Instance Variable Value" + x);
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		SubClass subClass = new SubClass();
//		subClass.foo(); // prints the value of the instance variable x in the SubClass
//
//	}
//
//}

class SuperClass {
	private int x = 1;
}

class SubClass extends SuperClass {
	public void foo() {
//		System.out.println(x); // compilation error, x is not visible
	}
}

public class Main {

	public static void main(String[] args) {

		SubClass subClass = new SubClass();
		subClass.foo(); // compilation error, x is not visible

	}

}
