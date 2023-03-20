package firstPackage;

public class Main {

	public static void main(String[] args) {
		String name = "Ajay";
		String ajay = name;
		ajay = name + "!";

		System.out.println(ajay);
		System.out.println(name);

		name = ajay + '!';
		System.out.println(name);
//		int i;

		System.out.println(name.charAt(0));

	}

}
