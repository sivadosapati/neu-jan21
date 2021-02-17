package class9.home.bedroom;

public final class KingBed extends Bed {

	public KingBed() {
		// super(new Pillow(), new Pillow());
	}

	@Override
	public void sleep() {
		super.sleep();
		onePillow.provideHeadSupport();
		changeBedSheets();

	}

}

