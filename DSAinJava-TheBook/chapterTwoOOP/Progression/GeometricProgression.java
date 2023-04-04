package Progression;

public class GeometricProgression extends Progression {
	protected long base;

	GeometricProgression(long b, long start) {
		super(start);
		base = b;
	}

	GeometricProgression(long b) {
		this(b, 1);
	}

	GeometricProgression() {
		this(2, 1);
	}

	@Override
	protected void advance() {
		current *= base;
	}

	public static void main(String[] args) {
		GeometricProgression geo = new GeometricProgression(3, 2);
		geo.nextValue();
		System.out.println(geo.current);
		geo.printProgression(20);
	}
}
