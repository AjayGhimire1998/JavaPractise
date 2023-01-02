package abstractClass;

;

public class Main {

	public static void main(String[] args) {
//		SuperClass superClass = new SuperClass();
//		SubClass subClass = new SubClass();

		Test test = new Test();

		test.sayHello();
		test.printInfo();
		System.out.println(test.name);

	}

}

abstract class SuperClass {
	String name = "MySuperClass";

	public void sayHello() {
		System.out.println("Hello");
	}

	abstract public void printInfo();
}

abstract class SubClass extends SuperClass {
	@Override
	public void printInfo() {
		System.out.println("I am inside the subclass");
	}

	abstract public void sayHello();
}

class Test extends SubClass {

	@Override
	public void sayHello() {

	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("I am test");

	}

}