package Progression;

public class FibonacciProgression extends Progression {
	protected long prev;

	FibonacciProgression() {
		this(0, 1);
	}

	FibonacciProgression(long first, long second) {
		super(first);
		prev = second - first;
	}

	@Override
	protected void advance() {
		long temp = prev;
		prev = current;
		current += temp;
	}

	public static void main(String[] args) {
		FibonacciProgression fib = new FibonacciProgression(2, 8);
//		fib.nextValue();
//		fib.nextValue();
//		fib.nextValue();
		System.out.println(fib.current);
		fib.nextValue();
		System.out.println(fib.current);
		fib.nextValue();
		System.out.println(fib.current);

		fib.printProgression(20);
	}
}
