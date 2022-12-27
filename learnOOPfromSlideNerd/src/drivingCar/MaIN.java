package drivingCar;

public class MaIN {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.fuelCapacity = 20;
		myCar.amountOfFuel = 12;
		myCar.addGas(5);
		myCar.addGas(1);
		System.out.println(myCar.amountOfFuel);

		myCar.mileage = 20;
		myCar.drive(10.5);
		System.out.println(myCar.amountOfFuel);

	}

}
