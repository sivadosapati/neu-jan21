package class8;

public class Fruit {

	public void provideNutrition() {
		System.out.println("Fruit provides nutrition");
	}

	public void eat() {

	}
}

class Banana extends Fruit {

	@Override
	public void provideNutrition() {
		System.out.println("Banana provides more nutrition");
	}
}

class Mango extends Fruit {
	@Override
	public void provideNutrition() {
		System.out.println("Mango provides best nutrition");
	}
}
