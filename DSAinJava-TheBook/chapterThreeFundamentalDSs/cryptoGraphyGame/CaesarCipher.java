package cryptoGraphyGame;

/**
 * Class for doing encryption and decryption using the Caesar Cipher. formula
 * for pseudoRandom generator: next = (a ∗ cur + b) % n;
 * 
 * @author ajayghimire
 *
 */
public class CaesarCipher {
	private final int MAX_CODER_LENGTH = 26;
	protected char[] encoder = new char[MAX_CODER_LENGTH]; // encryption array
	protected char[] decoder = new char[MAX_CODER_LENGTH]; // decryption array

	/**
	 * Contructor thta initialises the ecryption and decryption arrays
	 * 
	 * @param rotation
	 */
	CaesarCipher(int rotation) {
		for (int k = 0; k < MAX_CODER_LENGTH; k++) {
			encoder[k] = (char) ('A' + (k + rotation) % MAX_CODER_LENGTH);
			decoder[k] = (char) ('A' + (k - rotation + MAX_CODER_LENGTH) % MAX_CODER_LENGTH);
		}
	}

	/**
	 * Return transformation of origin String using the given code
	 * 
	 * @param original
	 * @param code
	 * @return new String
	 */
	private String transform(String original, char[] code) {
		char[] message = original.toCharArray();
		for (int i = 0; i < message.length; i++) {
			if (Character.isUpperCase(message[i])) {
				int j = message[i] - 'A';
				message[i] = code[j];
			}
		}
		return new String(message);
	}

	/**
	 * returns string represeantation for ecrypted message
	 * 
	 * @param message
	 * @return
	 */
	public String encrypt(String message) {
		return transform(message, encoder); // use encoder Array
	}

	/**
	 * return string representation of decrypted secret
	 * 
	 * @param secret
	 * @return
	 */
	public String decrypt(String secret) {
		return transform(secret, decoder); // use decoder array
	}
}
