package thisKeyword;

public class Main {

	public static void main(String[] args) {

//		Test test1 = new Test();
//		Test test2 = new Test();

//		System.out.println(test1.id);
//		System.out.println(test2.id);

//		Test test2 = new Test();
//		System.out.println(test2.id);

//		Test test3 = new Test();
//		System.out.println(test3.id);
//		System.out.println(Test.id);
//		System.out.println(Test.myConditiob);
//		System.out.println(Test.c);
//		System.out.println(Test.obj);
//		System.out.println(test3.uId);

		// == vs euals

//		String s1 = new String("hello");
//		String s2 = new String("hello");
//
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));

//		System.exit(0);

		// static methods
//		Person person = new Person();
//		person.getYear();
//
//		Person.getAge();

//		Person.getAge();

		// leetcode
//		String s = new String("hello World");
//		String[] arr = s.split(" ");
//		System.out.println(arr[arr.length - 1]);

//		int[] arr = { 4, 3, 6, 7 };
//
//		System.out.println(minStoneSum(arr, 3));

//		int[] arr = { -1, 0, 3, 5, 9, 12 };
//		System.out.println(search(arr, 9));

	}

//	public static int minStoneSum(int[] piles, int k) {
//		Arrays.sort(piles);
//		int total = 0;
////		while (k != 0) {
//
//		for (int i = 1; i < k + 1; i++) {
//			total = (int) (total + (piles[i] - Math.floor(piles[i] / 2)));
//		}
////		k--;
////		}
//
//		return total + piles[0];
//	}

//	public static int search(int[] nums, int target) {
//		int index = 0;
//		for (int i = 0; i < nums.length; i++) {
//			if (target == nums[i]) {
//				index = i;
//				break;
//			}
//		}
//
//		if (nums[index] == target) {
//			return index;
//		} else {
//			return -1;
//		}
//	}

}

//class Test {
//	static int id = 1000;
//	static boolean myConditiob = true;
//	static char c = 'A';
//	static Object obj = new Object();
//	static int uId;
//	static {
//		uId = 0;
//		System.out.println("Look I am first");
//	}
//	static {
//		uId = 3;
//		System.out.println("Look I am second");
//	}
//
//	Test() {
//		uId++;
//		System.out.println("Contructors called");
//	}
//}

class Person {

	String name;
	String address;
	int day;
	int month;
	int year;
//	int age = 20;
//	static int years = 1000;

//	static void getAge() {
//		System.out.println(years);
//	}
//
//	public void getYear() {
//		System.out.println(years);
//		System.out.println(age);
//	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void calculateAge() {

	}
}
