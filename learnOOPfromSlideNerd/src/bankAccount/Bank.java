package bankAccount;

public class Bank {
	private double INTEREST_RATE = 8.5;
	private double TRANSACTION_FEE = 10;
	private Customer[] customers = new Customer[1000];

	public void calculateInterest(Customer customer) {
		Account a = customer.getAccount();
		double bal = a.getBalance();
		double interestAmount = bal * INTEREST_RATE / 100;
		double totalBalance = bal + interestAmount;
		System.out.println("Interest amount: " + interestAmount);
		System.out.println("Total balace: " + totalBalance);
	}

	public double getInterestRate() {
		return INTEREST_RATE;
	}

	public double getTransactionFee() {
		return TRANSACTION_FEE;
	}

	public Customer[] getCustomer() {
		return customers;
	}

}
