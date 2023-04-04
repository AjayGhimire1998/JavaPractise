package labProjects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		String input = "";
		String line = br.readLine();

		while (line != null) {
			input += line;
			line = br.readLine();
		}
		br.close();

		// Calculate the frequency of each character
		Map<Character, Integer> freqMap = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isAlphabetic(c)) {
				int count = freqMap.containsKey(c) ? freqMap.get(c) : 0;
				freqMap.put(c, count + 1);
			}
		}

		ArrayList<Map.Entry<Character, Integer>> sortedFreqList = new ArrayList<>(freqMap.entrySet());
		Collections.sort(sortedFreqList, new Comparator<Map.Entry<Character, Integer>>() {
			public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});

		// Print the bar-chart plot of the frequencies
		System.out.println("Character Frequency Bar-Chart:");
		for (Map.Entry<Character, Integer> entry : sortedFreqList) {
			char c = entry.getKey();
			int freq = entry.getValue();
			System.out.printf("%c: ", c);
			for (int i = 0; i < freq; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
