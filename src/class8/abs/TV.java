package class8.abs;

interface EntertainmentDevice {
	public abstract void entertain();
}

public class TV implements EntertainmentDevice {
	public void entertain() {
		System.out.println("TV entertains..");
	}
}

class XBox implements EntertainmentDevice {
	public void entertain() {
		System.out.println("Xbox also entertains..");
	}
}

abstract class Human {}

class Friend extends Human implements EntertainmentDevice{

	public void entertain() {
		System.out.println("Entertainment by Friend");
	}

}
