package polymorphism;

public class Car extends Vehicle {

	@Override
	public void go() {
		System.err.println("Car is moving");
	}

}
