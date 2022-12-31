import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

//import java.awt.geom.Arc2D;

//import javax.swing.JOptionPane;
//import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int i = 9; // integer
		boolean b = true;
		String name = "Ajay";
		float f = 5.5555f;
		double d = 53253.55555;
		String s = "okkkk";
		char c = 'A';
		long l = 7326573678568657L;

		System.out.print("Hello, I am " + name + " and favorite amount is " + l + " and " + s + " ? ");

		// swapping variables
		String x = "water";
		String y = "Tang";
		String temp;

		temp = x;
		x = y;
		y = temp;
//		
		System.out.println("x: " + x);
		System.out.println("y: " + y);

		// user input
		Scanner scanner = new Scanner(System.in);

		System.out.println("Type your name: ");
		String name2 = scanner.nextLine();

		System.out.println("Type your age: ");
		int age = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Type your fav foood: ");
		String food = scanner.nextLine();

//		
		System.out.println("Hello " + name2 + " you are " + age);
		System.out.println("You like " + food);

		// expression
		// expression = perands and operators
		// operand = values, variables, number, quantity
		// operators = + - * / %
		double friends = 10;
		friends = friends + 1;
		friends = friends % 3;
		friends++;
		friends--;
		friends = friends * friends;
		friends = friends + 6;
		friends = (double) friends / 3;
		System.out.println(friends);
//		

		// Java Application GUI
		String name3 = JOptionPane.showInputDialog("Enter You name: ");
		int age2 = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in cm: "));
		JOptionPane.showMessageDialog(null, "Hello " + name3);
		JOptionPane.showMessageDialog(null, "You are " + age2);
		JOptionPane.showMessageDialog(null, "You are " + height + " cm tall.");
//		

		// Math class
		double x2 = 3.14;
		double y2 = 19;

		System.out.println(Math.ceil(x2));
		double z = Math.round(x2);
		System.out.println(z);

		double xx;
		double yy;
		double zz;
//		
		Scanner scanner2 = new Scanner(System.in);

		System.out.println("enter side x: ");
		xx = scanner2.nextDouble();
		System.out.println("Enter side y: ");
		yy = scanner2.nextDouble();

		zz = Math.sqrt((xx * xx) + (yy * yy));

		System.out.println("The hypotenuse is: " + zz);
		scanner.close();

		// Random values
		Random random = new Random();
		int xxx = random.nextInt();
		boolean bbb = random.nextBoolean();

		double yyy = random.nextDouble();
//		
		int dice = random.nextInt(6) + 1;

		System.out.println(dice);

		// if else statement
		int age3 = 24;

		if (age3 > 18 && age3 < 24) {
			System.out.println("A new adult");
		} else if (age3 >= 25 && age3 <= 80) {
			System.out.println("A milenial");
		} else if (age3 == 24) {
			System.out.println("Young adult");
		} else {
			System.out.println("child or old");
		}

		// Switch Statements
//		String day = "FridaY";
//		
//		switch(day.toLowerCase()) {
//			case "sunday": System.out.println("It is sunday");
//			break;
//			case "wednesday": System.out.println("It is Wednesday");
//			break;
//			case "friday": System.out.println("It is Friday");
//			break;
//			default: System.out.println("Faulty day");
//		}

		// Logical Operators used to connect two or more expressions
		// && (and) both must be true;
		// ||(or) either must be true
		// ! (not) reverses the boolean value of the condition

		// &&
//		int temp = 25;
//		if(temp > 30) {
//			System.out.println("It is very hot");
//		} else if(temp >=20 && temp <=30) {
//			System.out.println("It is warm outside");
//		} else {
//			System.out.println("It is cold");
//		}

		// || or ! not
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Playing game...Press q or Q to quit");
//		String response = scanner.next();
//		
//		if(!response.equals("q") && !response.equals("Q")) {
//			System.out.println("Game still on..");	
//		} else {
//			System.out.println("Game quitting..");
//		}

		// while loops : execute a block of code as long as its condition is true
//		Scanner scanner = new Scanner(System.in);
//		String name = "";

//		while(name.isBlank()) {
//			System.out.print(" enter ypour name: ");
//			name = scanner.nextLine();
//		}
//		System.out.println("Hello " +  name);

		// do-loop
//		do {
//			System.out.print(" enter ypour name: ");
//			name = scanner.nextLine();
//		}while(name.isBlank());
//		System.out.println("Hello " +  name);

		// for-loops : execute a block of code a l,imited amount of times
//		for(int i = 10; i >= 0; i--) {
//			System.out.println(i);
//		}
//		System.out.print("Happy New Year");

		// nested-loops
//		Scanner scanner =  new Scanner(System.in);
//		int rows;
//		int cols;
//		String symbol = "";
//		
//		System.out.println("Enter # of rows: ");
//		rows = scanner.nextInt();
//		
//		System.out.println("Enter # of columns: ");
//		cols = scanner.nextInt();
//		
//		System.out.println("Enter a symbol");
//		symbol = scanner.next();
//		
//		for(int i = 1; i <= rows; i++ ) {
//			System.out.println();
//			for(int j = 1; j <= cols; j++) {
//				System.out.print(" " + symbol);
//			}
//			
//		}

		// array : used to store multiple values in a single variable

		// 1D
//		String[] cars = {"BMW", "Tesla", "Mercedes"};
//		cars[0] = "Mustang";
////		cars[3] = "BMW";
//		System.out.println(cars[0]);

//		String[] cars = new String[3];
//		cars[0] = "BMW";
//		cars[1] = "tesla";
//		cars[2] = "Mercedes";
//		
//		for(int i = 0; i < cars.length; i++) {
//			System.out.println(cars[i]);
//		}

		// 2D : multidimensional array of arrays

//		String[][] cars = { { "BMW", "Tesla", "Honda" }, { "mercedes", "ford", "RollsRoyce" },
//				{ "ferrari", "toyota", "Yatri" } };
//
//		for (int i = 0; i < cars.length; i++) {
//			System.out.println();
//			for (int j = 0; j < cars[i].length; j++) {
//				System.out.print(cars[i][j] + " ");
//
//			}
//
//		}

		// DATA-Types methods : String
//		String name = "Ajay";
//		System.out.println(name.equals("Ajay"));
//		System.out.println(name.equalsIgnoreCase("ajay"));
//		System.out.println(name.length());
//		System.out.println(name.charAt(1));
//		System.out.println(name.indexOf("y"));
//		System.out.println(name.isEmpty());
//		System.out.println(name.toUpperCase());
//		System.out.println(name.toLowerCase());
//		System.out.println(name.trim());
//		System.out.println(name.replace("a", "A"));

		// wrapper class : provides a way to use primitive data types as reference
		// data types
		// reference DTs contains useful methods
		// can be used with collections (ArrayLists)

		// primitive //wrapper
//		-----------			---------
//		boolean				Boolean
//		char				Character
//		int					Integer
//		double 				Double

		// AUTOBOXING: the automatic conversion that the Java Compiler makes
		// between the primitive types and their corresponding object wrapper class.
		// UNBOXING: reverse of auto boxing, automatic conversion of wrapper class to
		// primitve.

//		Boolean a = true;
//		Character b = '@';
//		Integer c = 123;
//		Double d = 3.14;
//		String e = "Ajay";
//
//		if (a == true) {
//			System.out.print("Thi is still true");
//		}

		// Array List: a resizeable array, elements can be added and removed after
		// compilation phase,
		// stores reference data types

//		ArrayList<String> food = new ArrayList<String>();
//
//		food.add("pizza");
//		food.add("Burger");
//		food.add("hotDog");
//
//		food.set(0, "sushi");
//		food.remove(2);
//
//		food.clear();
//
//		for (int i = 0; i < food.size(); i++) {
//			System.out.println(food.get(i));
//
//		}

		// 2D ArrayLists; a dynamic list of lists, can change size during runtime

//		ArrayList<ArrayList<String>> groceriesList = new ArrayList();
//		ArrayList<String> bakeryList = new ArrayList();
//		bakeryList.add("pasta");
//		bakeryList.add("garlic bread");
//		bakeryList.add("donuts");
//
//		ArrayList<String> produceList = new ArrayList();
//		produceList.add("tomatoes");
//		produceList.add("bacon");
//		produceList.add("parmesan");
//
//		ArrayList<String> drinkList = new ArrayList();
//		drinkList.add("red wine");
//		drinkList.add("Dr peppers");
//
//		groceriesList.add(bakeryList);
//		groceriesList.add(produceList);
//		groceriesList.add(drinkList);

//		System.out.println(groceriesList.get(0).get(2));

		// for-each: traversing technique to iterate through the elements in an array,
		// less-steps,
		// more readable,
		// less flexible

//		String[] animals = { "cat", "dog", "rat", "bird" };

//		ArrayList<String> animals = new ArrayList<String>();
//
//		animals.add("cat");
//		animals.add("dog");
//		animals.add("rat");
//		animals.add("bird");
//		animals.add("kutta");
//
//		for (String i : animals) {
//			System.out.println(i);
//
//		}

		// methods : a block of code executed on called upon
//		hello("Ajay", 34);

//		int x = 3;
//		int y = 6;
//		System.out.println(sumOfTwoNumbers(x, y));

		// overloaded methods: methods that share the same name but have different
		// parameters, method name + parameters = method signature
//		double x = add(1.0, 2.0, 3.0, 4.0);
//		System.out.println(x);

		// printf: an optional method to control, format, and display text to the
		// console window, two arguments = format string + (object/variable/value,
		// % [flags] [precision] [width] [conversion-character]

//		boolean myBoolean = true;
//		char myChar = '$';
//		String myString = "Ajay";
//		int myInt = 24;
//		double myDouble = -1000;

		// [conversion-character]
//		System.out.printf("%b", myBoolean);
//		System.out.printf("%c", myChar);
//		System.out.printf("%s", myString);
//		System.out.printf("%d", myInt);
//		System.out.printf("%f", myDouble);
//		System.out.printf("%d This is a format string", 123);

		// [width] field: minimum number of character to be written as output;
//		System.out.printf(" Hello %10s", myString);

		// [precision]: sets number of digits of precision when outputting
		// floating-point values
//		System.out.printf("You have this much money %.2f", myDouble);

		// [flags]: adds an effect to the output based on the flag added to format
		// specifier
		// - : left-justify
		// + : output a plus or minus sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if number > 1000
//		System.out.printf("You have this much money %,f", myDouble);

		// final keyword: global, cannot be changed in the program
//		final double PI = 3.14159;
//
//		System.out.println(PI);

	}

	// methods : a block of code executed on called upon

//	static void hello(String name, int age) {
//		System.out.println("hello world " + name + ". A " + age + " years old guy");
//	}

//	static int sumOfTwoNumbers(int a, int b) {
//
//		return a + b;
//	}

	// overloaded methods: methods that share the same name but have different
	// parameters, method name + parameters = method signature

//	static int add(int a, int b) {
//		System.out.println("OverLoaded method 1");
//		return a + b;
//	}
//
//	static int add(int a, int b, int c) {
//		System.out.println("OverLoaded method 2");
//		return a + b + c;
//	}
//
//	static int add(int a, int b, int c, int d) {
//		System.out.println("OverLoaded method 3");
//		return a + b + c + d;
//	}
//
//	static double add(double a, double b) {
//		System.out.println("OverLoaded method 4");
//		return a + b;
//	}
//
//	static double add(double a, double b, double c) {
//		System.out.println("OverLoaded method 5");
//		return a + b + c;
//	}
//
//	static double add(double a, double b, double c, double d) {
//		System.out.println("OverLoaded method 6");
//		return a + b + c + d;
//	}

}
