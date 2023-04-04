package genericsInJava;

public class GenericsFramework<A, B> {
	A first;
	B second;

	GenericsFramework(A a, B b) {
		first = a;
		second = b;
	}

	public A getA() {
		return first;
	}

	public B getB() {
		return second;
	}

	public static void main(String[] args) {
		GenericsFramework<String, Double> gens = new GenericsFramework<String, Double>("Ajay", 24.0);
		System.out.println(gens.getA());
		System.out.println(gens.getB());

		GenericsFramework<Integer, Character> gensTwo = new GenericsFramework<>(12, 'A');
		System.out.println(gensTwo.getA());
		System.out.println(gensTwo.getB());

		Integer price = gensTwo.getA();
		System.out.println(price);
	}
}
