package random;

public class Main {

	public static void main(String[] args) {

		// object reference preservation;

		B b = new B();
		b.x = 10;
		System.out.println("before aMethod called: " + b.x);

		A a = new A();
		a.aMethod(b);
		System.out.println("After method is called: " + b.x);

	}

}

class B {
	int x;
}

class A {
	public void aMethod(B obj) {
		System.out.println("Inside aMethod before modification: " + obj.x);
		obj.x = 300;
		System.out.println("Inside method after modification: " + obj.x);
		obj = null;
		System.out.println("After putting null: " + obj);
	}
}
