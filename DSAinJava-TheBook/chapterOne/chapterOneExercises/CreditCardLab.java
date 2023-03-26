package chapterOneExercises;

public class CreditCardLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCardLab creditCardLab = new CreditCardLab("Ajay", "CommBank", "Ae10u", 200);
		System.out.println(creditCardLab.toString());

		creditCardLab.makePayment(-1);
		System.out.println(creditCardLab.toString());
	}

	private String customer;
	private String bank;
	private String account;
	private int limit;
	protected double balance;

	/**
	 * Constructs credit card instance with initial balance of zero
	 * 
	 * @param cust customer name
	 * @param bk   bank name
	 * @param acc  account id
	 * @param lim  limit
	 */
	CreditCardLab(String cust, String bk, String acc, int lim) {
		this(cust, bk, acc, lim, 0.0);
	}

	/**
	 * Constructs credit card instance by providing all params
	 * 
	 * @param cust
	 * @param bk
	 * @param acnt
	 * @param limit
	 * @param bal
	 */
	CreditCardLab(String cust, String bk, String acnt, int limit, double bal) {
		this.customer = cust;
		this.bank = bk;
		this.account = acnt;
		this.limit = limit;
		this.balance = bal;
	}

	// Accessor methods
	public String getCustomer() {
		return this.customer;
	}

	public String getBank() {
		return this.customer;
	}

	public String getAccount() {
		return this.account;
	}

	public int getLimit() {
		return this.limit;
	}

	public double getBalance() {
		return this.balance;
	}

	// update methods
	public boolean charge(double amount) {
		if (amount + this.balance > this.limit) {
			return false;
		}
		this.balance += amount;
		return true;
	}

	/*
	 * Modify the CreditCard class from Code Fragment 1.5 so that it ignores any
	 * request to process a negative payment amount.
	 */
	public void makePayment(double amount) {
		if (amount < 0) {
			System.err.println("You cannot make negative payments");

		} else {
			this.balance -= amount;
		}
	}

	// toString
	public String toString() {
		return String.format("Customer: %s\nBank: %s\nAccount: %s\nBalance: %.2f\nLimit: %d", customer, bank, account,
				balance, limit);
	}

	/*
	 * Modify the CreditCard class from Code Fragment 1.5 to include a method that
	 * updates the credit limit.
	 */
	public void updateLimit(int limit) {
		this.limit = limit;
	}

}
