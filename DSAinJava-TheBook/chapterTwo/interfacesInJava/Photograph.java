package interfacesInJava;

/**
 * Class for photographs that can be sold
 * 
 * @author ajayghimire
 *
 */
public class Photograph implements Sellable {
	private String descript;
	private int price;
	private boolean color;

	Photograph() {

	}

	@Override
	public String decription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int listPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lowestPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
