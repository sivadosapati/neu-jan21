
public class Box {

	int price = 10;// Step 1
	{
		System.out.println("Before constructor");// Step 2
		price = 25;// Step 2
	}

	// Step 3
	Box() {
		System.out.println("Constructor");
		System.out.println(price);
		price = 50;
		System.out.println(price);
	}

	public void finalize() {
		System.out.println("Box is destructed");
	}

	public static void main(String[] args) {
		Box redBox = new Box();

		Box blueBox = new Box();

		Box greenBox = new Box();

		Box anotherBox = redBox;

		// greenBox.finalize();

		greenBox = null;

		redBox = null;
		blueBox = null;
		anotherBox = null;

		//Runtime.getRuntime().gc();

		System.out.println("Done");

	}

}
