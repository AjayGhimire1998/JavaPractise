package interfacesInJava;

/**
 * Class for photographs that can be sold
 * 
 * @author ajayghimire
 *
 */
public class Photograph implements Sellable {
	private String descript; // decription of this photo
	private int price; // the price we are setting
	private boolean color; // true if the photo is in color

	Photograph(String desc, int p, boolean c) {
		descript = desc;
		price = p;
		color = c;
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
