package basic;

public class Main {

	public static void main(String[] args) {

		Counter counter = new Counter();
		System.out.println(counter);
		Counter c = new Counter(5);
		Counter d = c;
		int temp = d.getCount();
		System.out.println("temp: " + temp);
		temp = temp + 5;
		System.out.println("temp + 5: " + temp);
		System.out.println(d.getCount());
		System.out.println(d.getCount());
		System.out.println(c.getCount());
		c.increment();
		System.out.println(c.getCount());
		c.increment(10);
		System.out.println(c.getCount());
		c.reset();
		System.out.println(c.getCount());
	}

}

class Counter {
	private int count;

	public Counter() {

	}

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
