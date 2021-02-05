package class6;

public class Person {

	private String name;

	private int age;

	private boolean nameChanged = false;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "[name,age]=[" + name + "," + age + "]";
	}

	public void play() {
		System.out.println("Play with person -> " + toString());
	}

	public void eat() {
		System.out.println("Eating");
		digestFood();
	}

	private void digestFood() {
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (nameChanged == false) {
			this.name = name;
			nameChanged = true;
		} else {
			System.out.println("I will not change the name second time");
		}
	}

}

class iPhone {
	private String color;
	private int memory;

	iPhone(String color, int memory) {
		this.color = color;
		this.memory = memory;
	}

	public String toString() {
		return "[color,memory]=[" + color + "," + memory + "]";
	}

	void makePhoneCall() {
		System.out.println("Make phone call -> " + toString());
	}
}