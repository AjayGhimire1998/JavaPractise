package bankAccount;

public class Bank {
	private double INTEREST_RATE = 8.5;
	private double TRANSACTION_FEE = 10;
	private Customer[] customers = new Customer[1000];

	public void calculateInterest() {

	}

	public double getInterestRate() {
		return INTEREST_RATE;
	}

	public double getTransactionFee() {
		return TRANSACTION_FEE;
	}

}
