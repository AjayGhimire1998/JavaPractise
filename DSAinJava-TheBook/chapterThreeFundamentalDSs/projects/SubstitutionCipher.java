package projects;

/**
 * Implement a class, SubstitutionCipher, with a constructor that takes a string
 * with the 26 uppercase letters in an arbitrary order and uses that as the
 * encoder for a cipher (that is, A is mapped to the first character of the
 * parameter, B is mapped to the second, and so on.) You should derive the
 * decoding map from the forward version.
 * 
 * @author ajayghimire
 *
 */
public class SubstitutionCipher {
	private char[] encodingMap = new char[26];
	private char[] decodingMap = new char[26];

	SubstitutionCipher(String encoding) {
		if (encoding.length() != 26) {
			throw new IllegalArgumentException("Encoding string must be 26 chars long");
		}

		for (int i = 0; i < 26; i++) {
			encodingMap[i] = encoding.charAt(i);
			decodingMap[encoding.charAt(i) - 'A'] = (char) ('A' + i);
		}
	}

	String encode(String message) {
		StringBuilder sb = new StringBuilder();
		for (char c : message.toCharArray()) {
			if (Character.isUpperCase(c)) {
				sb.append(encodingMap[c - 'A']);
			} else if (Character.isLowerCase(c)) {
				sb.append(Character.toLowerCase(encodingMap[Character.toUpperCase(c) - 'A']));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	String decode(String encoded) {
		StringBuilder sb = new StringBuilder();
		for (char c : encoded.toCharArray()) {
			if (Character.isUpperCase(c)) {
				sb.append(decodingMap[c - 'A']);
			} else if (Character.isLowerCase(c)) {
				sb.append(Character.toLowerCase(decodingMap[Character.toUpperCase(c) - 'A']));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		SubstitutionCipher cipher = new SubstitutionCipher("QWERTYUIOPASDFGHJKLZXCVBNM");
		String message = "Fire in the Hole, Detach, I repeat DETACH!!";
		System.out.println("msge: " + message);
		String encoded = cipher.encode(message);
		System.out.println("encoded msge: " + encoded);
		String decoded = cipher.decode(encoded);
		System.out.println("decoded msge: " + decoded);
	}
}
