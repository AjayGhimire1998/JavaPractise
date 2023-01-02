package interface2;

import interfacesInJava.newInterface;

public class Main implements newInterface {

	public static void main(String[] args) {
		Main main = new Main();
		main.sayHello();
	}

	@Override
	public void sayHello() {
		System.out.println("hello from interface in different package");
	}

}
