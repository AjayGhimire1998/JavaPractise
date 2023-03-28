package interfacesInJava;

/**
 * Interface for objects that can be sold.
 * 
 * @author ajayghimire
 *
 */
public interface Sellable {

	/**
	 * Returns a description of the object
	 * 
	 * @return
	 */
	public String decription();

	/**
	 * Returns the list price in cents
	 * 
	 * @return
	 */
	public int listPrice();

	/**
	 * Returns the lowest price in cents we will accept
	 * 
	 * @return
	 */
	public int lowestPrice();

}
