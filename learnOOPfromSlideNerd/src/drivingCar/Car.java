package drivingCar;

public class Car {

	double mileage;
	double amountOfFuel;
	double fuelCapacity;

	public void drive(double distance) {
		double fuelNeeded = distance / mileage;

		if (amountOfFuel >= fuelNeeded) {
			amountOfFuel -= fuelNeeded;
			System.out.println("you travelled " + distance + " kilometers");
		} else {
			System.out.println("You cnnot make the trip");
		}
	}

	public void addGas(double amount) {
		double emptySpace = fuelCapacity - amountOfFuel;
		if (amount < emptySpace) {
			amountOfFuel += amount;
			System.out.println(amount + " litres is added successfully");
		} else {
			amountOfFuel = fuelCapacity;
			System.out.println("Tank is full");
		}
	}

	public double getFuelLevel() {
		return amountOfFuel;
	}

}
