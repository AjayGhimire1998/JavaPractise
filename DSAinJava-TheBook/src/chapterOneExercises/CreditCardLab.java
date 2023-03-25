package chapterOneExercises;

public class CreditCardLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

}
