package interfacesInJava;

/**
 * Interface for objects that can be transported
 * 
 * @author ajayghimire
 *
 */
public interface Transportable {
	/**
	 * returns the weight of transportable in grams
	 * 
	 * @return
	 */
	public int weight();

	/**
	 * returns whethere the object is hazardous
	 * 
	 * @return
	 */
	public boolean isHazardous();
}
