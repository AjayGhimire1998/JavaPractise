package genericsInJava;

public class GenArrPortfolio<T> {
	T[] data;

	GenArrPortfolio(int capacity) {
//		data = new T[capacity];
		data = (T[]) new Object[capacity];

	}

	public T get(int index) {
		return data[index];
	}

	public void set(int index, T element) {
		data[index] = element;
	}
}
