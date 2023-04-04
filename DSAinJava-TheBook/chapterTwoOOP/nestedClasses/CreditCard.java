package nestedClasses;

public class CreditCard {
	String name;
	Transaction[] history;

	CreditCard(String n, Transaction t, int c) {
		name = n;
		history = (Transaction[]) new Object[c];
	}

	private static class Transaction {
		int trans;

		Transaction(int value) {
			trans = value;
		}

		public int getTransaction() {
			return trans;
		}
	}

}
