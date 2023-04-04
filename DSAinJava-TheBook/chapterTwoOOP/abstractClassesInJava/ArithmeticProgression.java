package abstractClassesInJava;

public class ArithmeticProgression extends AbstractProgression {
	protected long increment;

	ArithmeticProgression(int start) {
		super(start);
	}

	ArithmeticProgression(int start, int stepSize) {
		super(start);
		increment = stepSize;
	}

	@Override
	protected void advance() {
		current += increment;
	}

	public static void main(String[] args) {
		ArithmeticProgression prog = new ArithmeticProgression(1, 2);
		prog.printProgression(12);
	}
}
