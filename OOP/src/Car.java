public class Car {

//	@Override
//	void go() {
//		// TODO Auto-generated method stub
//
//		System.out.println("Driver is driving the car");
//
//	}

//	String make = "Chevrolette";
//	String model = "Corvette";
//	int year = 2020;
//	String color = "blue";
//	double price = 50000.00;
//
//	public String toString() {
//		return make + "\n" + model + "\n" + color + "\n" + year;
//	}
//
//	void drive() {
//		System.out.println("You are driving the car");
//	}
//
//	void brake() {
//		System.out.println("You are stopping the care");
//	}

//	String name;
//
//	Car(String name) {
//		this.name = name;
//
//	}

	private String make;
	private String model;
	private int year;

	Car(String make, String model, int year) {
//		this.make = make;

		this.setMake(make);
//		this.model = model;
//		this.year = year;

		this.setModel(model);
		this.setYear(year);
	}

	Car(Car car) {
		this.copy(car);
	}

	public String getMake() {
		return make;

	}

	public String getModel() {
		return model;

	}

	public int getYear() {
		return year;

	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void copy(Car car) {
		this.setMake(car.getMake());
		this.setModel(car.getModel());
		this.setYear(car.getYear());

	}

}
