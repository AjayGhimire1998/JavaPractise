package interfacesInJava;

public class Main implements myInterface, myInterface2, newInterface {

	public static void main(String[] args) {
		Main main = new Main();
		main.display();
		main.test();
	}

	@Override
	public void display() {
//		PI = 2.0f;
		System.out.println("Hi from interface: " + PI);

	}

	@Override
	public void test() {
		System.out.println("testing interface");

	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub

	}

}

interface myInterface {
	float PI = 3.13f;

	void display();

}

interface myInterface2 {
	void test();

}
