package CreditCardApp;

public class PredetoryCreditCardTwo extends CreditCardTwo {
	private double apr; // annual percentage rate

	PredetoryCreditCardTwo(String customer, String bank, String account, int limit, int balance, double rate) {
		super(customer, bank, account, limit, balance); // initialize superclass attributes
		this.apr = rate;
	}

	// initialize superclass attributes
	public void processMonth() {

		if (intialBalance > 0) { // only charge interest on a positive balance
			double monthlyFactor = Math.pow(1 + apr, 1.0 / 12); // compute monthly rate
			intialBalance *= monthlyFactor; // assess interest
		}
	}

	@Override // Overriding the charge method defined in the superclass
	public boolean charge(double price) {
		boolean isSuccess = super.charge(price); // call inherited method
		if (!isSuccess) {
			intialBalance += 5;
		}
		return isSuccess;
	}

	public static void main(String[] args) {
		CreditCardTwo card = new PredetoryCreditCardTwo("Ajay", "anz", "aei0u", 100, 100, 12);
//		card.makePayment(12);

		System.out.println(card instanceof PredetoryCreditCardTwo);
		System.out.println(card.intialBalance);
		card.charge(18);

		System.out.println(card instanceof CreditCardTwo);
		System.out.println(card.intialBalance);
	}

}
