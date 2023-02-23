package modifiers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Hero.name);
		Hero.printName();

	}

}

class Ajay extends Hero {

	@Override
	public void getHalfName() {
		// TODO Auto-generated method stub

	}

}

abstract class Hero {
	String name = "Ajay";

	static void printName() {
		System.out.println(name);
	}

	public abstract void getHalfName();

}
