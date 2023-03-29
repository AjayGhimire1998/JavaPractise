package interfacesInJava;

public class BoxedItem2 implements Insurable {
	private String descript; // description of this item
	private int price;// list price in cents
	private int weight;// weight in grams
	private boolean haz;// true if object is hazardous
	private int height = 0;// box height in centimeters
	private int width = 0;// box width in centimeters
	private int depth = 0;// box depth in centimeters

	BoxedItem2(String desc, int p, int w, boolean h) {
		descript = desc;
		price = p;
		weight = w;
		haz = h;
	}

	@Override
	public String decription() {
		// TODO Auto-generated method stub
		return descript;
	}

	@Override
	public int listPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public int lowestPrice() {
		// TODO Auto-generated method stub
		return price / 2;
	}

	@Override
	public int weight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public boolean isHazardous() {
		// TODO Auto-generated method stub
		return haz;
	}

	@Override
	public int insuredValue() {
		// TODO Auto-generated method stub
		return price * 2;
	}

}
