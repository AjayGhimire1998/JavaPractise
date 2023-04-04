package labProjects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a list of words separated by whitescapes: ");
		String input = scanner.nextLine();

		// Split the input into words and store them in an array
		String[] words = input.split("\\s+");

		// Create a map to store the frequency of each word
		HashMap<String, Integer> wordCount = new HashMap<>();

		// Count the frequency of each word
		for (String word : words) {
			if (!wordCount.containsKey(word)) {
				wordCount.put(word, 1);
			} else {
				wordCount.put(word, wordCount.get(word) + 1);
			}
		}

		// prints the frequency of each word
		System.out.println("Word Count: ");
		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
