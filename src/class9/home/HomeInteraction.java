package class9.home;

import class9.home.bedroom.Bed;

public class HomeInteraction {

	public static void main(String[] args) {
		Guest g = new Guest();
		//Bed b = new Bed();
		//g.sleep(b);
		//b.move
	}

}

class Guest {

	void sleep(Bed b) {
		b.sleep();
	}
}
