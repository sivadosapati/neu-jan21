package class15;

public class Person {

	private Object SLEEP_DRINK_LOCK = new Object();

	protected String name;

	public Person(String name) {
		this.name = name;
	}

	public void think() {
		loop("Thinking");
	}

	public void pause(int i) {
		try {
			Thread.sleep(i);
		} catch (Exception e) {
		}

	}

	public void sleep() {
		synchronized (SLEEP_DRINK_LOCK) {
			loop("Sleeping");
		}
	}

	public synchronized void drink() {
		synchronized (SLEEP_DRINK_LOCK) {
			loop("Drinking");
		}

	}

	public void talk() {
		loop("Formulate the words that needs to be spoken");
		synchronized (this) {
			loop("Talking");
		}
	}

	public void eat() {
		System.out.println("About to Eat");
		loop("Preparing the bite");
		synchronized (this) {
			loop("Chewing");
			loop("Swallowing");
		}
		loop("Relishing");
		System.out.println("Done eating");
	}

	public void loop(String task) {
		for (int i = 0; i < 10; i++) {
			int x = getRandomNumber(10);
			if (x == 9) {
				// throw new RuntimeException(name+" has a problem performing "+task);
			}
			System.out.println(name + " is " + task + " -> " + i);
			pause(250);
		}
	}

	public int getRandomNumber(int x) {
		return (int) (Math.random() * x);
	}
}
