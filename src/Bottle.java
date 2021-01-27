
class Bottle {
	float capacityInLitres = 10;

	public String toString() {
		return "Capacity -> "+capacityInLitres;
	}

	void transferOneLitre(Bottle b) {

		float x = capacityInLitres;
		System.out.println("Before transferring -> : " + x);
		b.capacityInLitres = b.capacityInLitres + 1;
		capacityInLitres = capacityInLitres - 1;
		System.out.println("After transferring -> " + capacityInLitres);

	}

	public static void main(String[] args) {
		System.out.println("Siva has a white bottle and it has water in it.");
		Bottle sivaBottle = new Bottle();
		Bottle palakBottle = new Bottle();
		palakBottle.capacityInLitres = 5;
		System.out.println("Capacity in Siva's bottle : " + sivaBottle.capacityInLitres);
		System.out.println("Capacity in Palak's bottle : " + palakBottle.capacityInLitres);
		Bottle anupamaBottle = new Bottle();
		anupamaBottle.capacityInLitres = sivaBottle.capacityInLitres + palakBottle.capacityInLitres;
		System.out.println("Anupama Bottle's capacity : " + anupamaBottle.capacityInLitres);
		anupamaBottle.transferOneLitre(sivaBottle);

		// anupamaBottle.transferOneLitre();
		System.out.println("Anupama Bottle's capacity : " + anupamaBottle.capacityInLitres);
		System.out.println("Siva Bottle's capacity : " + sivaBottle.capacityInLitres);

	}

	void doSomething() {
		// sivaBottle
	}
}

class Glass {
	boolean transparent;
	float size;

}

class Cup {

}