package interfacesInJava;

/**
 * Class for objects that can be sold, packed and shipped
 * 
 * @author ajayghimire
 *
 */
public class BoxedItem implements Sellable, Transportable {
	private String descript;
	private int price;
	private int weight;
	private boolean haz;
	private int height = 0;
	private int width = 0;
	private int depth = 0;

	@Override
	public int weight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isHazardous() {
		// TODO Auto-generated method stub
		return false;
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
