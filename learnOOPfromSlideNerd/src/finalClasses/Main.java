package finalClasses;

public class Main {

	public static void main(String[] args) {

	}

}

final class SuperClass {

	public void doSuperClassStuff() {
		// code to do superclass stuffs
	}

	public final void doOtherSuperClassStuff() {
		// code to do superclass stuffs
	}
}

class SubClass extends SuperClass { // invalid, the type SubClass cannot
									// subclass the final class SuperClass
	@Override
	public void doSuperClassStuff() { // invalid, cannot override method
										// in final class

	}

	@Override
	public void doOtherSuperClassStuff() { // invalid, cannot override final method

	}
}
