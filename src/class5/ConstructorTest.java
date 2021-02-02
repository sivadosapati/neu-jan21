package class5;

public class ConstructorTest {

	public static void main(String[] args) {
		FastFoodCenter mcd = new FastFoodCenter("McDonalds");
		mcd.location = "Seattle";
		mcd.orderMeal();

		FastFoodCenter subway = new FastFoodCenter();
		subway.name = "Subway";
		subway.location = "Renton";
		subway.orderMeal();

		FastFoodCenter dominos = new FastFoodCenter("Dominoes", "Bellevue");
		dominos.orderMeal();
		dominos.location = "Sammamish";
		dominos.orderMeal();

		Kid ira = new Kid("Ira");
		ira.name = "Irai";

		iPhone manishasPhone = new iPhone("12", 64, "Green");
		System.out.println(manishasPhone);

		iPhone peiweiPhone = new iPhone("12", 128);
		System.out.println(peiweiPhone);

		iPhone linPhone = new iPhone();
		System.out.println(linPhone);
		iPhone jasminePhone = new iPhone();
		System.out.println(jasminePhone);

	}

}

class iPhone {
	String version;
	int memory;
	String color;

	iPhone(String version, int memory, String color) {
		this.version = version;
		this.memory = memory;
		this.color = color;
	}

	iPhone() {
		this("11", 128, "Black");
	}

	iPhone(String version, int memory) {
		this.version = version;
		this.memory = memory;
		this.color = "Black";
	}

	public String toString() {
		return "iPhone -> with version -> " + version + " has memory => " + memory + " and has color -> " + color;
	}
}

class Kid {
	String name;

	Kid(String name) {
		this.name = name;
	}
}

class FastFoodCenter {
	String name;
	String location;

	FastFoodCenter(String n) {
		name = n;
	}

	FastFoodCenter(String n, String l) {
		name = n;
		location = l;
	}

	FastFoodCenter() {

	}

	void orderMeal() {
		System.out.println("Order a meal from " + name + " in " + location);
	}
}
