
public class Main {

	public static void main(String[] args) {

		// object: an instance of a class that may contain attributes and methods
		// example: (phone, desk, computer, coffee cup)

//		Car myCar = new Car();
//		Car mySecondCar = new Car();
//
//		myCar.drive();
//		myCar.brake();
//
//		myCar.color = "red";
//
//		System.out.println(mySecondCar.color);
//		System.out.println(myCar.color);

		// constructor: special method that is called when an object is instantiated
		// (created)

//		Human ajay = new Human("Ajay", 23, 79.0);
//		Human sia = new Human("Sia", 24, 55.0);
//		System.out.println(ajay.name);
//		System.out.println(sia.name);
//		ajay.eat();

		// local: declared inside a method, visible only to that method
		// global: declared outside a method, but within a class, visible to all parts
		// of a class

//		DiceRoller diceRoller = new DiceRoller();

		// overloaded constructors: multiple constructors within a class with the same
		// name, but have different parameters, name + parameters = signature

//		Pizza pizza = new Pizza("thin crust", "nap", "mozzeralla", "basil");
//		System.out.println("Ingredients are: ");
//		System.out.println(pizza.bread);
//		System.out.println(pizza.sauce);
//		System.out.println(pizza.cheese);
//		System.out.println(pizza.topping);

		// toString(): special method that all objects inherit, that returns a string
		// that 'textually represent' an object, can be used both implicitly and
		// explicitly

//		Car myCar = new Car();
//		System.out.println(myCar.toString());
//		System.out.println(myCar);

		// array of objects

//		int[] numbers = new int[3];
//		char[] characters = new char[4];
//		String[] strings = new String[5];

//		Food[] refrigerator = new Food[3];

//		Food food1 = new Food("Pizza");
//		Food food2 = new Food("Burger");
//		Food food3 = new Food("MasuBhat");
//
//		Food[] refrigerator = { food1, food2, food3 };

//		refrigerator[0] = food1;
//		refrigerator[1] = food2;
//		refrigerator[2] = food3;

//		System.out.println(refrigerator[0].name);
//		System.out.println(refrigerator[1].name);
//		System.out.println(refrigerator[2].name);

		// Passing objects within different classes
//		Garage garage = new Garage();
//		Car car = new Car("Tesla");
//		Car car2 = new Car("BMW");
//
//		garage.park(car);
//		garage.park(car2);

		// static : modifier, a single copy of a variable/method is created and shared.
		// the class owns the static member

		Friend friend1 = new Friend("Arjun");
		Friend friend2 = new Friend("Shiya");
		Friend friend3 = new Friend("Speed");
		Friend friend4 = new Friend("JP");

//		System.out.println(Friend.numberOfFriends);
//		System.out.println(friend1.numberOfFriends);

		Friend.displayFriends();

	}

}
