package class9.home.bedroom;

public class GuestInBedroom {
	Bed b;

	public void moveBed() {
		b.moveBedToCorner();
		// b.ch
	}

	public void sleepComfortably() {
		KingBed kb = new KingBed();
		kb.changeBedSheets();

	}
}
