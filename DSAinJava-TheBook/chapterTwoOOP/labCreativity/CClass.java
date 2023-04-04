package labCreativity;

public class CClass extends BClass {
	CClass() {
		super();
	}

	public void setXInA(int value) {
		super.x = value;
	}

	public static void main(String[] args) {
		AClass aClass = new AClass();
		BClass bClass = new BClass();
		CClass cClass = new CClass();

		System.out.println(aClass.x);
		System.out.println(bClass.x);
		System.out.println(cClass.x);

		cClass.setXInA(12);

		System.out.println(aClass.x);
		System.out.println(bClass.x);
		System.out.println(cClass.x);
	}
}
