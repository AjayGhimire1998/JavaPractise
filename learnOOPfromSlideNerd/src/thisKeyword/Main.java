package thisKeyword;

public class Main {

	public static void main(String[] args) {

		Test test1 = new Test();
//		Test test2 = new Test();

//		System.out.println(test1.id);
//		System.out.println(test2.id);

		Test test2 = new Test();
//		System.out.println(test2.id);

		Test test3 = new Test();
//		System.out.println(test3.id);
//		System.out.println(Test.id);
//		System.out.println(Test.myConditiob);
//		System.out.println(Test.c);
//		System.out.println(Test.obj);

		// == vs euals

		String s1 = new String("hello");
		String s2 = new String("hello");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

	}

}

class Test {
	static int id = 1000;
	static boolean myConditiob = true;
	static char c = 'A';
	static Object obj = new Object();
	static int uId;
	static {
		uId = 1001;
		System.out.println("Look I am first");
	}
	static {
		uId = 10000;
		System.out.println("Look I am second");
	}

	Test() {
//		id++;
		System.out.println("Contructors called");
	}
}
