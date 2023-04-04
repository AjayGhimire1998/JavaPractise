package abstractClassesInJava;

public abstract class AbstractProgression {

	protected long current;

	AbstractProgression() {
		this(0);
	}

	public AbstractProgression(int i) {
		current = i;
	}

	public long nextValue() {
		long result = current;
		advance();
		return result;
	}

	public void printProgression(int n) {
		System.out.print(nextValue());
		for (int i = 1; i < n; i++) {
			System.out.print(" " + nextValue());
		}
		System.out.println();
	}

	protected abstract void advance();

}
