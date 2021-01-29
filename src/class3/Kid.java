package class3;

public class Kid {

	boolean hunger = false;
	String name = "";
	int maxCapacityForDrinkingFluid = 3;

	public void eat() {
		System.out.println("Asking my brain if I'm hungry or not");

		if (hunger == true) {
			System.out.println("My Brain is telling me that I'm hungry");
			System.out.println("I will eat the food");

		} else {
			System.out.println("My brain is telling me that I'm not hungry and I will not eat.");

		}
		System.out.println("Thank you for checking with me to eat");

	}

	public void drinkFluids(Drink[] drinks) {
		// for (Drink d : drinks) {
		// drink(d);
		// }
		//break; continue;
		int counter = 0;
		for (int i = 0; i < drinks.length; ++i) {
			int x = counter;
			if (counter == maxCapacityForDrinkingFluid) {
				System.out.println("I've reached my max capacity -> "+maxCapacityForDrinkingFluid);
				hunger = false;
				break;
			}
			Drink d = drinks[i];
			drink(d);
			counter = x + 1;
		}
	}

	public void drink(Drink drink) {
		if (hunger == true) {
			if (drink == Drink.WATER) {
				System.out.println(name + " says, I love drinking water directly");

				return;
			}
			if (drink == Drink.JUICE) {
				System.out.println(name + " says, I need a straw to sip the juice");
				return;
			}
			if (drink == Drink.MILK) {
				System.out.println(name + " says, I need a bottle to drink the milk");
				return;
			}
		} else {
			System.out.println(name + " says, Thank you for giving me a Drink -> " + drink + " but I'm not hungry");
		}

	}

	public void drinkDifferently(Drink d, int volumeOfDrink) {
		if (hunger == true && d == Drink.JUICE && volumeOfDrink > 1) {
			System.out.println(name + " says, I love drinking water directly");
			return;

		}
		if (hunger == true && d == Drink.MILK) {

		}
		if (hunger == true && d == Drink.WATER) {

		}
		System.out.println("I'm not hungry, hence I'm not drinking milk");
	}

	public void drinkWithSwitch(Drink d) {
		if (hunger == true) {
			switch (d) {
			case JUICE:
				System.out.println(name + " says, I need a straw to sip the juice");
				return;
			case WATER:
				break;

			}
			System.out.println("xxx");
		}
	}

	public static void main(String args[]) {
		Kid rishaan = new Kid();
		rishaan.name = "Rishaan";
		rishaan.hunger = true;
		rishaan.eat();
		System.out.println("----");
		rishaan.hunger = false;
		rishaan.eat();
		System.out.println("---");

		Kid aurohi = new Kid();
		aurohi.hunger = true;
		aurohi.name = "Aurohi";
		aurohi.drink(Drink.MILK);
		System.out.println("---");
		aurohi.hunger = false;
		aurohi.drink(Drink.JUICE);
		System.out.println("*****************");
		rishaan.hunger = true;
		aurohi.hunger = true;
		rishaan.drink(Drink.MILK);
		aurohi.drink(Drink.MILK);
		System.out.println("@@@@@@@@@");
		Drink[] drinks = { Drink.JUICE, Drink.MILK, Drink.WATER, Drink.WATER };
		rishaan.drinkFluids(drinks);
		
		aurohi.maxCapacityForDrinkingFluid = 2;
		aurohi.hunger = true;
		System.out.println("----------------------");
		aurohi.drinkFluids(drinks);

	}
}

enum Drink {
	JUICE, WATER, MILK;
}
