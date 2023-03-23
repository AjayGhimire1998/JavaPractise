package CreditCardApp;

public class CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	String customer;
	String bank;
	String account;
	int limit;
	double balance;

	/**
	 * Constructs a new credit card instance
	 * 
	 * @param customer
	 * @param bank
	 * @param account
	 * @param limit
	 * @param balance
	 */
	CreditCard(String customer, String bank, String account, int limit, int balance) {
		this.customer = customer;
		this.bank = bank;
		this.account = account;
		this.limit = limit;
		this.balance = balance;

	}

}
