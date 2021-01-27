
public class Home {
	// Bottle a, b, c, d, e, f;
	Bottle[] bottles = new Bottle[5];
	Bottle a, b, c, d, e;

	void buyBottlesInAMundaneWay() {
		bottles[0] = new Bottle();
		bottles[1] = new Bottle();
		bottles[2] = new Bottle();
		bottles[3] = new Bottle();
		bottles[4] = new Bottle();

	}

	void buyBottles() {
		for (int i = 0; i < bottles.length; i++) {
			bottles[i] = new Bottle();
		}
	}

	public static void main(String[] args) {
		Home asrarHome = new Home();
		asrarHome.buyBottles();
		System.out.println(asrarHome.bottles.length);

		System.out.println(asrarHome.bottles[0].capacityInLitres);
		// System.out.println(asrarHome.a.capacityInLitres);
		Bottle a = asrarHome.bottles[0];
		Bottle b = asrarHome.bottles[3];
		a.transferOneLitre(b);
		System.out.println(a.capacityInLitres);
		System.out.println(b.capacityInLitres);

		Home alfiaHome = new Home();
		alfiaHome.buyBottles();

		Home zheningHome = new Home();
		zheningHome.bottles = new Bottle[100];
		zheningHome.buyBottles();
		zheningHome.bottles[0].transferOneLitre(zheningHome.bottles[49]);
		System.out.println(zheningHome.bottles[49]);

	}

}
