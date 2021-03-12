package class15;

public class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public void think() {
		loop("Thinking");
	}

	private void pause(int i) {
		try {
			Thread.sleep(i);
		} catch (Exception e) {
		}

	}

	public synchronized void talk() {
		loop("Talking");
	}

	public synchronized void eat() {
		loop("Eating");
	}

	public void loop(String task) {
		for (int i = 0; i < 10; i++) {
			int x = getRandomNumber(10);
			if( x == 9) {
				//throw new RuntimeException(name+" has a problem performing "+task);
			}
			System.out.println(name + " is " + task + " -> " + i);
			pause(250);
		}
	}
	
	private int getRandomNumber(int x ) {
		return (int)(Math.random() * x );
	}
}
