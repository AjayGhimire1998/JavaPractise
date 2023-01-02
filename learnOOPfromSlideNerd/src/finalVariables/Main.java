package finalVariables;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		// constant
		final double PI = 3.14;
		PI = 4.0; // invalid, final variable PI cannot be reassigned

		// object with changeable state
		final ArrayList<String> planets = new ArrayList<>();
		planets.add("Mercury"); // valid
		planets.add("Venus"); // valid
		planets.add("Earth"); // valid
		planets.remove(0); // valid
		planets = new ArrayList<>(); // invalid, the planets variable
										// itself cannot be reassigned to
										// reference a different object.
	}

}
