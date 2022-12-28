package thisKeyword;

public class Main {

	public static void main(String[] args) {

		Test test1 = new Test();
//		Test test2 = new Test();

		System.out.println(test1.id);
//		System.out.println(test2.id);

		Test test2 = new Test();
		System.out.println(test2.id);

		Test test3 = new Test();
		System.out.println(test3.id);

	}

}

class Test {
	static int id = 1000;

	Test() {
		id++;
	}
}
