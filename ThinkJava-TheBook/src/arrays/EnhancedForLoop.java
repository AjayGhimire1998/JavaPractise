package arrays;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = RandomNumbers.randomArray(30);

		/*
		 * This statement is called an enhanced for loop. You can read it as, “for each
		 * value in values”. It’s conventional to use plural nouns for array variables
		 * and singular nouns for element variables
		 */
		for (int score : scores) {
			System.out.println(score);
		}

	}

}
