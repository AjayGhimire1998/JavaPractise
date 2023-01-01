package dynamicPolymorphism;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal();
//		animal.move();

		Animal animal2 = new Human();
//		animal2.move();

		Human human = new Human();
		human.move();
	}

}

class Animal {
	public void move() {
		System.out.println("Moving Animal from one place to another..");
	}
}

class Human extends Animal {
	@Override
	public void move() {
		super.move();
		System.out.println("Moving Human from one place to another..");
	}
}
