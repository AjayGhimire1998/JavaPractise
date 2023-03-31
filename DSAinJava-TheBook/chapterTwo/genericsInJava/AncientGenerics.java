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
}
