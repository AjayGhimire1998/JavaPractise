import java.util.Random;

public class DiceRoller {

	Random RANDOM = new Random();
	int NUMBER;

	DiceRoller() {
		roll(RANDOM, NUMBER);
	}

	void roll(Random random, int number) {
		number = random.nextInt(6) + 1;
		System.out.println(number);
	}
}
