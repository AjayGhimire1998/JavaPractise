package bankAccount;

public class Account {
	private double balance = 100;
	private String accountNumber;
	private boolean firstTime = true;

	public Account(String accNumber) {
		accountNumber = accNumber;
	}

	public Account(double bal, String accNumber) {
		if (bal >= 100) {
			balance = bal;
		} else {
			balance = 100;
		}
		accountNumber = accNumber;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println(amount + " $ has been successfully deposited.");
		} else {
			System.err.println("You cannot deposit negative value");
		}

	}

	public void withdraw(double amount) {
		if (amount >= 0) {
			if (firstTime == true) {
				double tempBalance = balance;
				tempBalance = tempBalance - amount;
				if (tempBalance >= 100) {
					balance -= amount;
					System.out.println(amount + " has been withdrawn successfully.");
				} else {
					System.err.println("Insufficient balance to withdraw " + amount);

				}
				firstTime = false;
			} else {
				Bank bank = new Bank();
				double tempBalance = balance;
				tempBalance = tempBalance - amount - bank.getTransactionFee();
				if (tempBalance >= 100) {
					balance -= amount - bank.getTransactionFee();
					System.out.println(amount + " has been withdrawn successfully.");
					System.out.println("your new balance is " + balance);
				} else {
					System.err.println("Insufficient balance to withdraw " + amount);

				}
			}

		} else {
			System.err.println("You cannot withdraw negative value");
		}

	}

	public double getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

}
