package projects;

/**
 * Write a program that can perform the Caesar cipher for English messages that
 * include both upper- and lowercase characters.
 * 
 * @author ajayghimire
 *
 */
public class CaesarCipherAgain {
	private int shift;

	public CaesarCipherAgain(int shift) {
		this.shift = shift;
	}

	String encrypt(String msge) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < msge.length(); i++) {
			char ch = msge.charAt(i);

			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					result.append((char) ('A' + (ch - 'A' + shift) % 26));
				} else {
					result.append((char) ('a' + (ch - 'a' + shift) % 26));
				}
			} else {
				result.append(ch);
			}
		}
		return result.toString();
	}

	String decrypt(String msge) {
		shift = 26 - shift;
		String decryptedMsge = encrypt(msge);
		shift = 26 - shift;
		return decryptedMsge;
	}

	public static void main(String[] args) {
		CaesarCipherAgain cipher = new CaesarCipherAgain(3);
		System.out.println(cipher.encrypt("hello World!"));
		System.out.println(cipher.decrypt("khoor Zruog!"));
	}
}
