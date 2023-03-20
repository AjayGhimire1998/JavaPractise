package firstPackage;

public class Main {

	public static void main(String[] args) {
//		String name = "Ajay";
//		String ajay = name;
//		ajay = name + "!";
//
//		System.out.println(ajay);
//		System.out.println(name);
//
//		name = ajay + '!';
//		System.out.println(name);
////		int i;
//
//		System.out.println(name.charAt(0));

		Person jay = new Person("ajay", 24);
		Person hehe = new Person("hehe", 25);
		jay.printName(hehe);

	}

}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printName(Person p) {
		System.out.println(p.name);
		System.out.println(this.age);
	}

}