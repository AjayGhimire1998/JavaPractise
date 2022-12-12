
public class Main {

	public static void main(String[] args) {

		// object: an instance of a class that may contain attributes and methods
		// example: (phone, desk, computer, coffee cup)

//		car1 myCar = new car1();
//		car1 mySecondCar = new car1();
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

//		car1 myCar = new car1();
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
//		car1 car1 = new car1("Tesla");
//		car1 car2 = new car1("BMW");
//
//		garage.park(car1);
//		garage.park(car2);

		// static : modifier, a single copy of a variable/method is created and shared.
		// the class owns the static member

//		Friend friend1 = new Friend("Arjun");
//		Friend friend2 = new Friend("Shiya");
//		Friend friend3 = new Friend("Speed");
//		Friend friend4 = new Friend("JP");

//		System.out.println(Friend.numberOfFriends);
//		System.out.println(friend1.numberOfFriends);

//		Friend.displayFriends();

		// super: keyword refers to the superclass (parent) of an object
		// very similar to the "this" keyword.

//		Hero hero1 = new Hero("Batman", 42, "$$$");
//		Hero hero2 = new Hero("Superman", 43, "laser eye");

//		System.out.println(hero2.power);
//		System.out.println(hero2.toString());

		// abstract: abstract classes cannot be instantiated, but they can have a
		// subclass
		// abstract methods are declared without an implementation.

//		Vehicle vehicle = new Vehicle();
//		car1 car1 = new car1();
//		car1.go();

		// Encapsulation: attributes of a class will be hidden or private;
		// Can be accessed only through methods(getters or setters);
		// you should make attributes private if you don't have a reason to make them
		// public

//		Car car1 = new Car("chevrolet", "Camero", 2022);
//		System.out.println(car1.getMake() + " " + car1.getModel());
//		car1.year = 2023;
//		car1.setYear(2025);
//		System.out.println(car1.getYear());

//		Car car2 = new Car("Ford", "Mustang", 2021);
//
//		car2.copy(car1);

//		Car car2 = new Car(car1);
//
//		System.out.println(car1);
//		System.out.println(car2);
//		System.out.println();
//		System.out.println(car1.getMake());
//		System.out.println(car1.getModel());
//		System.out.println(car1.getYear());
//		System.out.println();
//		System.out.println(car2.getMake());
//		System.out.println(car2.getModel());
//		System.out.println(car2.getYear());

//		
		// interface: a template that can be applied to a class;
		// similar to inheritance, but specifies what a class has/must do;
		// classes can apply more than one interface, inheritance is limited to 1 super
		// class;

	}

}
