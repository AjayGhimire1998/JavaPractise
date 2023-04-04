package labCreativity;

/**
 * Most modern Java compilers have optimizers that can detect simple cases when
 * it is logically impossible for certain statements in a program to ever be
 * executed. In such cases, the compiler warns the programmer about the useless
 * code. Write a short Java method that contains code for which it is provably
 * impossible for that code to ever be executed, yet the Java compiler does not
 * detect this fact.
 * 
 * @author ajayghimire
 *
 */
public class UnreachableCode {
	public static void main(String[] args) {
		boolean flag = false;

		if (flag == true) {

			System.out.println("This will never be executed");
		}
	}
}
