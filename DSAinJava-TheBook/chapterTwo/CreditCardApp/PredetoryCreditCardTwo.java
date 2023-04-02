package CreditCardApp;

public class PredetoryCreditCardTwo extends CreditCardTwo {
	private double apr; // annual percentage rate
	private static int chargesCount;

	PredetoryCreditCardTwo(String customer, String bank, String account, int limit, int balance, double rate) {
		super(customer, bank, account, limit, balance); // initialize superclass attributes
		this.apr = rate;
	}

	/**
	 * The PredatoryCreditCard class provides a processMonth( ) method that models
	 * the completion of a monthly cycle. Modify the class so that once a customer
	 * has made ten calls to charge during a month, each additional call to that
	 * method in the current month results in an additional $1 surcharge.
	 *
	 */
	// initialize superclass attributes
	public void processMonth() {

		if (intialBalance > 0) { // only charge interest on a positive balance
			double monthlyFactor = Math.pow(1 + apr, 1.0 / 12); // compute monthly rate
			intialBalance *= monthlyFactor; // assess interest
		}
		chargesCount = 0;
	}

	@Override // Overriding the charge method defined in the superclass

	public boolean charge(double price) {
		boolean isSuccess = super.charge(price); // call inherited method
		if (!isSuccess) {
			intialBalance += 5;
		} else {
			chargesCount++;
			if (chargesCount > 10) {
				intialBalance += 1;
			}
		}

		return isSuccess;
	}

	public static void main(String[] args) {
		CreditCardTwo card = new PredetoryCreditCardTwo("Ajay", "anz", "aei0u", 200, 100, 12);
//		card.makePayment(12);

		System.out.println(card instanceof PredetoryCreditCardTwo);
		System.out.println(card.intialBalance);
		card.charge(18);
		card.charge(18);
		card.charge(18);
		card.charge(18);
		card.charge(18);
		card.charge(18);
		card.charge(18);
		card.charge(18);
		card.charge(18);
		card.charge(18);
		card.charge(18);
		card.charge(18);
		System.out.println(chargesCount);

		System.out.println(card instanceof CreditCardTwo);
		System.out.println(card.intialBalance);
	}

}
