package variableScope;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("Ajay");
		Person q = new Person("Ghimire", 23);
		p.display();
		System.out.println("----------------------");
		q.display();
		System.out.println("----------------------");
		System.out.println(p);
		System.out.println(q);
	}

}
