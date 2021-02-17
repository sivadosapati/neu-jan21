package class9.home;

public class Father {
	final protected void openLocker() {

	}

	int getProperty() {
		return 1000000;
	}
}

class Son extends Father {

	int getProperty() {
		super.openLocker();
		return super.getProperty() + 100;
	}

	

}
