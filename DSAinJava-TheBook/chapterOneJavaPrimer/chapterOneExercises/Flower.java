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

	public static void main(String[] args) {
		Flower flower = new Flower("Lily", 200, 12.5f);
		System.out.println(flower.name);

		flower.setName("Lily");
		System.out.println(flower.name);
		System.out.println(flower.getName());
//		System.out.println(flower.toString());
		flower.printFlower();
	}

	private String name;
	private int numberOfPetals;
	private float price;

	Flower() {

	}

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

	public String getName() {
		return this.name;
	}

	public int getNumberOfPetals() {
		return this.numberOfPetals;
	}

	public float getPrice() {
		return this.price;
	}

	public String toString() {
		return String.format("Name: %s\nPetalsCount: %d\nPrice: %f", this.name, this.numberOfPetals, this.price);
	}

	public void printFlower() {
		System.out.printf("Name: %s\nPetalsCount: %d\nPrice: %f", this.name, this.numberOfPetals, this.price);
	}
}
