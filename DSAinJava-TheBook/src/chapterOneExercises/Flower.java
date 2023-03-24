package chapterOneExercises;

/**
 * 
 * Write a Java class, Flower, that has three instance variables of type String,
 * int, and float, which respectively represent the name of the flower, its
 * number of petals, and price. Your class must include a constructor method
 * that initializes each variable to an appropriate value, and your class should
 * include methods for setting the value of each type, and getting the value of
 * each type
 * 
 * @author ajayghimire
 *
 */
public class Flower {
	String name;
	int numberOfPetals;
	float price;

	Flower(String name, int numP, float price) {
		this.name = name;
		this.numberOfPetals = numP;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumberOfPetals(int numP) {
		this.numberOfPetals = numP;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
