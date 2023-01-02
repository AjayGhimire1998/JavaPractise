package finalMehthods;

public class Main {
	public static void main(String[] args) {

	}
}

class User {
	private String password;
	private String userName;
	private String phoneNumber;

	// final method
	public final void setPassword(String password) {
		// code for setting password
	}

	// static method
	public static void setUsername(String userName) {
		// code for setting username
	}

	// static method
	public static void setPhone(String phoneNumber) {
		// code for setting phone number
	}

}

class AdminUser extends User {
	@Override
	public void setPassword(String password) { // invalid, cannot override final method from User
		// new code for setting password
	}

	public void setUsername(String userName) { // This instance method cannot override the
												// static method from User
		// new code for setting username
	}

	// static method
	public static void setPhone(String phoneNumber) { // valid, the static method is for AdminUser class
		// code for setting phone number
	}
}
