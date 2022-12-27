package bankAccount;

public class Customer {

	private String name;
	private Account account;

	public Customer(String n, Account a) {
		this.name = n;
		this.account = a;

	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Accounnt: " + account.getAccountNumber());
		System.out.println("Balance: " + account.getBalance());

	}

	public String getName() {
		return name;
	}

	public Account getAccount() {
		return account;
	}
}
