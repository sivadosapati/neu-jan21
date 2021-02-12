package class8.abs;

public class Home {

	public static void main(String[] args) {
		Banana b = new Banana();
		Mango m = new Mango();

		b.provideNutrition();
		m.provideNutrition();

		Fruit f;;// = new Fruit();
		System.out.println("----");
		//f.provideNutrition();
		f = b;// Corner stone of polymorphism
		f.provideNutrition();
		f = m;
		f.provideNutrition();
		System.out.println("----");

		Fruit a = m;

		// Mango x = b;

		f.provideNutrition();
		a.provideNutrition();

		Parent siva = new Parent();
		Son rishaan = new Son();
		Daughter syra = new Daughter();
		siva.playWithSon(rishaan);
		siva.playWithDaughter(syra);

		siva.play(rishaan);
		siva.play(syra);

		Chocolate cc = new Chocolate();
		Biscuit bb = new Biscuit();
		rishaan.eatBiscuit(bb);
		rishaan.eatChocoloate(cc);
		
		rishaan.eat(bb);
		rishaan.eat(cc);
	}

}

class Kid {
	void play() {
		System.out.println("Kids love playing!");
	}

	void eatChocoloate(Chocolate c) {

	}

	void eatBiscuit(Biscuit b) {

	}

	void eat(Chocolate c) {

	}

	void eat(Biscuit b) {

	}

}

class Chocolate {

}

class Biscuit {

}

class Daughter extends Kid {
	public void play() {
		System.out.println("Daughter plays with crayons");
	}
}

class Son extends Kid {
	public void play() {
		System.out.println("Son plays with Legos");
	}
}

class Parent {
	void playWithDaughter(Daughter d) {
		d.play();
	}

	void playWithSon(Son s) {
		s.play();
	}

	void play(Kid k) {
//		k.play();
	}

	void tasteFruit(Fruit f) {
		f.eat();
	}
}
