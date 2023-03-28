package Progression;

public class Progression {
	protected long current;

	Progression() {
		this(0);
	}

	Progression(long start) {
		current = start;
	}

	public long nextValue() {
		long result = this.current;
		advance();
		return result;
	}

	protected void advance() {
		current++;
	}

	public void printProgression(int n) {
		System.out.println(nextValue());
		for (int i = 1; i < n; i++) {
			System.out.println(" " + nextValue());
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Progression prog = new Progression();
//		prog.printProgression(12);
		prog.nextValue();
		prog.nextValue();

		System.out.println(prog.current);

	}
}
