package bankAccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int numberOfCustomers = 0;
		Bank bank = new Bank();
		Customer[] c = bank.getCustomer();
		while (true) {
			System.out.println("Please enter your choice: ");
			System.out.println("1. Add Customer");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Check Balance");
			System.out.println("5. Calculate Interest");
			System.out.println("6. Exit");
			try {
				int choice = Integer.parseInt(bufferedReader.readLine());

				switch (choice) {

				case 1:
					System.out.println("Creating an account for new customer...");
					System.out.println("Please enter the initial amount in your account: ");
					double bal = Double.parseDouble(bufferedReader.readLine());
					System.out.println("Please enter your account number");
					String acc = bufferedReader.readLine();
					Account account = new Account(bal, acc);
					System.out.println("Please enter your name: ");
					String name = bufferedReader.readLine();
					Customer customer = new Customer(name, account);
					c[numberOfCustomers] = customer;
					numberOfCustomers++;
					customer.display();
//					for (int i = 0; i < numberOfCustomers; i++) {
//						System.out.println("Name: " + c[i].getName());
//					}
					break;

				case 2:
					System.out.println("Enter your account number: ");
					acc = bufferedReader.readLine();
					if (numberOfCustomers == 0) {
						System.err.println("Account not found");
					} else {
						boolean found = false;
						for (int i = 0; i < numberOfCustomers; i++) {
							Account temp = c[i].getAccount();
							String accTemp = temp.getAccountNumber();
							if (accTemp.equals(acc)) {

								System.out.println("Please enter the amount to deposit: ");
								double deposit = Double.parseDouble(bufferedReader.readLine());
								temp.deposit(deposit);
								found = true;
							}

						}
						if (found == false) {
							System.err.println("Account not found");
						}
					}

					break;
				case 3:
					System.out.println("Enter your account number: ");
					acc = bufferedReader.readLine();
					if (numberOfCustomers == 0) {
						System.err.println("Account not found");
					} else {
						boolean found = false;
						for (int i = 0; i < numberOfCustomers; i++) {
							Account temp = c[i].getAccount();
							String accTemp = temp.getAccountNumber();
							if (accTemp.equals(acc)) {

								System.out.println("Please enter the amount to withdraw: ");
								double withdraw = Double.parseDouble(bufferedReader.readLine());
								temp.withdraw(withdraw);
								found = true;
							}

						}
						if (found == false) {
							System.err.println("Account not found");
						}
					}

					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					System.exit(0);
					break;
				default:
					break;
				}
			} catch (NumberFormatException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}
	}

}
