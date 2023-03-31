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
		GenericsFramework<String, Double> gens = new GenericsFramework<>("Ajay", 24.0);
		System.out.println(gens.getA());
		System.out.println(gens.getB());
	}
}
