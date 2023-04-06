package cryptoGraphyGame;

/**
 * Class for doing encryption and decryption using the Caesar Cipher.
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
}
