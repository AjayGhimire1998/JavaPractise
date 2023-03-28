package CreditCardApp;

public class CreditCardTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(CardName.AMEX);

	}

	private String customer;
	private String bank;
	private String account;
	private int limit;
	protected double intialBalance;

	public enum CardName {
		VISA, MASTERCARD, AMEX
	}

	/**
	 * Constructs a new credit card instance
	 * 
	 * @param customer
	 * @param bank
	 * @param account
	 * @param limit
	 * @param balance
	 */
	CreditCardTwo(String customer, String bank, String account, int limit, int balance) {
		this.customer = customer;
		this.bank = bank;
		this.account = account;
		this.limit = limit;
		this.intialBalance = balance;

	}

	/**
	 * Charges the given price to the card, assuming it has sufficient credit limit
	 * 
	 * @param price the amount to be charged
	 * @return true if charge was accepted; false if charge was denied
	 */
	public boolean charge(double price) {
		if (price + intialBalance > limit) {
			return false;
		}
		intialBalance += price;
		return true;
	}

	/**
	 * processes customer payment that reduces balance
	 * 
	 * @param amount the amount of payment made
	 */
	public void makePayment(double amount) { // make a payment
		intialBalance -= amount;
	}

}
