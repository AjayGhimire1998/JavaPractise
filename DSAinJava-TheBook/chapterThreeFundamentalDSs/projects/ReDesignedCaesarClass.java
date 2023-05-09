package projects;

import java.util.Random;

/**
 * Redesign the CaesarCipher class as a subclass of the SubstitutionCipher from
 * the previous problem.
 * 
 * @author ajayghimire
 *
 */
public class ReDesignedCaesarClass extends SubstitutionCipher {
	private int shift;

	ReDesignedCaesarClass(int shift) {
//		super(generateEncoding(shift));
		super(randomlyGeneratedEncoding());
		this.shift = shift;
	}

	private static String generateEncoding(int shift) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			char ch = (char) ('A' + (i + shift) % 26);
			sb.append(ch);
		}
		return sb.toString();
	}

	/**
	 * Design a RandomCipher class as a subclass of the SubstitutionCipher from
	 * Exercise P-3.40, so that each instance of the class relies on a random
	 * permutation of letters for its mapping.
	 * 
	 * @return
	 */
	private static String randomlyGeneratedEncoding() {
		Random random = new Random();
		boolean[] usedChars = new boolean[26];
		char[] encodingMap = new char[26];

		for (int i = 0; i < 26; i++) {
			int index;
			do {
				index = random.nextInt(26);
			} while (usedChars[index]);

			usedChars[index] = true;
			encodingMap[i] = (char) ('A' + index);
		}
		return new String(encodingMap);
	}

	@Override
	String encode(String message) {
		shift %= 26;
		return super.encode(message);
	}

//	@Override
	String decode(String encoded) {
		shift %= 26;
		return super.decode(encoded);
	}

	public static void main(String[] args) {
		ReDesignedCaesarClass cipher = new ReDesignedCaesarClass(3);
		String message = "Fire in the Hole!!";
		String encrypted = cipher.encode(message);
		System.out.println("encrypted: " + encrypted);
		String decrypted = cipher.decode(encrypted);
		System.out.println("decrypted: " + decrypted);
	}

}
