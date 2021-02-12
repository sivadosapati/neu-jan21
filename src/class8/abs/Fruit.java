package class8.abs;

public abstract class Fruit {

	private double price;

	public double getPrice() {
		return price;
	}

	public abstract void provideNutrition();

	public abstract void eat();
}

class Banana extends Fruit {

	@Override
	public void provideNutrition() {
		System.out.println("Banana provides more nutrition");
	}

	@Override
	public void eat() {
		System.out.println("Open the peel and eat the banana");

	}
}

class Mango extends Fruit {
	@Override
	public void provideNutrition() {
		System.out.println("Mango provides best nutrition");
	}

	@Override
	public void eat() {
		System.out
				.println("Take the peel and make juice if the mango is juicy, else cut into pieces and eat the mango");
	}
}
