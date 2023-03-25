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

	CreditCardLab(String cust, String bk, String acc, int lim) {
		this(cust, bk, acc, lim, 0.0);
	}

	CreditCardLab(String cust, String bk, String acnt, int limit, double bal) {
		this.customer = cust;
		this.bank = bk;
		this.account = acnt;
		this.limit = limit;
		this.balance = bal;
	}

	public String getCustomer() {
		return this.customer;
	}

	public String getBank() {
		return this.customer;
	}

}
