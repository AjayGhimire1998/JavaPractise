package genericsInJava;

public class AncientGenerics {
	Object first;
	Object second;

	AncientGenerics(Object a, Object b) {
		first = a;
		second = b;
	}

	public Object getFirst() {
		return first;
	}

	public Object getSecond() {
		return second;
	}

	public static void main(String[] args) {
		AncientGenerics gens = new AncientGenerics("ORCL", 32.9);
		System.out.println(gens.first);
		String s = (String) gens.first;
		System.out.println(s);
	}
}
