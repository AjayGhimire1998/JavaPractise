package genericsInJava;

public class GenericsAndArrays<A, B> {
	A first;
	B second;

	public GenericsAndArrays(A a, B b) {
		first = a;
		second = b;
	}

	public static void main(String[] args) {
		GenericsAndArrays<String, Double>[] holdings;
		holdings = new GenericsAndArrays[10];
		holdings[0] = new GenericsAndArrays<>("Ajay", 24.0);
		System.out.println(holdings[0].second);
	}
}
