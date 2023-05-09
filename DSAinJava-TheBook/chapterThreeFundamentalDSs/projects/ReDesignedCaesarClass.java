package projects;

public class ReDesignedCaesarClass extends SubstitutionCipher {
	private int shift;

	ReDesignedCaesarClass(int shift) {
		super(generateEncoding(shift));
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
