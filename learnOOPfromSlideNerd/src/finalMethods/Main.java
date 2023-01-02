package finalMethods;

public class Main {
	public static void main(String[] args) {

	}
}

class User {
	private String password;
	private String email;

	public final void login(String email, String password) {
		// code for logging in using email and password
	}

}

class AdminUser extends User {
	private String phoneNumber;

	public void login(String phoneNumber) {
		// code for logging in using phone number
	}
}