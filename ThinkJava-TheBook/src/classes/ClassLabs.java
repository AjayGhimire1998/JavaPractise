package classes;

public class ClassLabs {
	private int hour;
	private int minute;
	private double second;

	public static void main(String[] args) {
		Tile tile = new Tile('A', 33);
		Tile.printTile(tile);
		Tile.testTile();
		System.out.println(tile);
		Tile tile2 = new Tile('A', 33);
		System.out.println(tile.equals(tile2));
	}

	/**
	 * The implementation of increment in this chapter is not very efficient. Can
	 * you rewrite it so it doesn’t use any loops? Hint: Remember the modulus
	 * operator.
	 * 
	 * @param second
	 */
	public void incrementTwo(double second) {
		this.second += second;
		this.minute += this.second / 60;
		this.second %= 60;
		this.hour += this.minute / 60;
		this.minute %= 60;
	}
}

/**
 * In the board game Scrabble, each tile contains a letter, which is used to
 * spell words in rows and columns, and a score, which is used to determine the
 * value of words.
 * 
 * Write a definition for a class named Tile that represents Scrabble tiles. The
 * instance variables should include a character named letter and an integer
 * named value.
 * 
 * @author ajayghimire
 *
 */
class Tile {
	private char letter;
	private int value;

	/**
	 * Write a constructor that takes parameters named letter and value and initial‐
	 * izes the instance variables.
	 * 
	 * @param letter
	 * @param value
	 */
	Tile(char letter, int value) {
		this.letter = letter;
		this.value = value;
	}

	/**
	 * Write a method named printTile that takes a Tile object as a parameter and
	 * displays the instance variables in a reader-friendly format.
	 * 
	 * @param tile
	 */
	public static void printTile(Tile tile) {
		System.out.println("{ letter: " + tile.letter + ", value: " + tile.value + " }");
	}

	/**
	 * Write a method named testTile that creates a Tile object with the letter Z
	 * and the value 10, and then uses printTile to display the state of the object.
	 * 
	 */
	public static void testTile() {
		printTile(new Tile('Z', 10));
	}

	/**
	 * Implement the toString and equals methods for a Tile.
	 *
	 */
	public String toString() {
		return String.format("Letter = %s \nValue = %d", this.letter, this.value);
	}

	public boolean equals(Tile tile) {
		return this.letter == tile.letter && this.value == tile.value;
	}
}
