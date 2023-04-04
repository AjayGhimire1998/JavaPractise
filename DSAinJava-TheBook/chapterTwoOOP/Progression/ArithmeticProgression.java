package Progression;

public class ArithmeticProgression extends Progression {
	protected long increment;

	ArithmeticProgression() {
		this(1, 0);
	}

	ArithmeticProgression(long stepSize) {
		this(stepSize, 0);
	}

	ArithmeticProgression(long stepSize, long start) {
		super(start);
		increment = stepSize;
	}

	@Override
	protected void advance() {
		current += increment;
	}

	public static void main(String[] args) {
		ArithmeticProgression arth = new ArithmeticProgression(3, 1);
		arth.nextValue();
		System.out.println(arth.current);
		arth.printProgression(20);
	}
}
