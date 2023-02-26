import java.math.BigDecimal;

public class variables {

	public static void main(String[] args) {
		int a = 5;
		int b = a;
		a = 7;
		System.out.println(a != b);

		double pi;
		pi = 3.14566523657862398423523;
		System.out.println(pi);

		double x = 3;
		int y = 1;
		System.out.println(y / x);

		int balance = 12345;
		System.out.println("Balance in dollars: " + balance / 100);

		double balance1 = 125.24;
		double balance2 = 123.212;
		System.out.println("normal double add: " + (balance1 + balance2));

		BigDecimal bal = new BigDecimal(125.24);
		BigDecimal bal2 = new BigDecimal(123.212);
		System.out.println(bal.add(bal2));

		String day = "Thursday";
		String month = "July";
		int date = 16;
		int year = 2015;

		System.out.println("American Format:");
		System.out.println(day + ", " + month + " " + date + ", " + year);
		System.out.println("Euro format:");
		System.out.println(day + " " + date + " " + month + " " + year);

	}

}
