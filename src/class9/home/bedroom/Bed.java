package class9.home.bedroom;

public class Bed {
	// Rule # 1: Make every instance variable private
	// Rule # 2: Define a public method to access or modify this variable only when
	// there is a necessity
	// Rule # 3: Define a method (or a behavior) as public only if that behavior is
	// something other objects need
	private final int pillowCount = 2;
	protected Pillow onePillow = new Pillow(), twoPillow = new Pillow();

	public Bed() {

	}

	Bed bed = new Bed();

	public void sleep() {
		System.out.println("Sleep on the bed");

		String name = new String();
		name.doSomething();

		java.lang.String x = new java.lang.String("Siva");

		// pillowCount++;
	}

	protected final void changeBedSheets() {

	}

	void moveBedToCorner() {

	}

	private void changeRailings() {

	}

}

class Pillow {

	public void provideHeadSupport() {

	}
}

class BedSheet {

}