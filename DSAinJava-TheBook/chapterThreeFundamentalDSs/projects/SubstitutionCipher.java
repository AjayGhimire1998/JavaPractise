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

	}
}
