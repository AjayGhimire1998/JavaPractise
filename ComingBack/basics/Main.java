
public class Main {

	public static void main(String[] args) {

		Counter c = new Counter(5);
		System.out.println(c.getCount());
	}

}

class Counter {
	public int count;

	public Counter(int i) {
		// TODO Auto-generated constructor stub
		count = i;
	}

	public int getCount() {
		return count;
	}

	public void increment() {
		count++;
	}

	public void increment(int j) {
		count += j;
	}

	public void reset() {
		count = 0;
	}

}
