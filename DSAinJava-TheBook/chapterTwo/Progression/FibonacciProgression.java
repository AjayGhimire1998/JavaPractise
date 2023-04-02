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

	/**
	 * C-2.23 Modify the advance method of the FibonacciProgression class so as to
	 * avoid use of any temporary variable.
	 *
	 */
	@Override
	protected void advance() {
		current += prev;
		prev = current - prev;
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
