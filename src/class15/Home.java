package class15;

public class Home {

	public static void main(String[] args) throws Exception {
		Person yian = new Person("Yian");
		Person palak = new Person("Palak");
		System.out.println("Before : " + currentTime());
		// thinkAndTalkSequentially(yian, palak);

		// thinkAndTalkConcurrently(yian, palak);
		// makeTheWholeClassThinkAndTalk();
		doMultipleThings(palak, yian);
		System.out.println("After : " + currentTime());
	}

	private static void doMultipleThings(Person palak, Person yian) throws Exception {
		ThinkingThread palakThinker = new ThinkingThread(palak);
		TalkingThread palakTalker = new TalkingThread(palak);
		ThinkingThread think = new ThinkingThread(yian);
		TalkingThread talk = new TalkingThread(yian);
		Thread yianEater = new Thread(new Eater(yian));
		Eater eat = new Eater(palak);
		Thread eatingThread = new Thread(eat);
		palakThinker.start();
		palakTalker.start();
		think.start();
		talk.start();
		yianEater.start();

		eatingThread.start();
		palakThinker.join();
		palakTalker.join();
		eatingThread.join();
		yianEater.join();
		think.join();
		talk.join();

	}

	private static void makeTheWholeClassThinkAndTalk() throws Exception {
		Person persons[] = new Person[32];
		ThinkingThread thinkers[] = new ThinkingThread[32];
		TalkingThread talkers[] = new TalkingThread[32];

		for (int i = 0; i < persons.length; i++) {
			persons[i] = new Person("Name[" + i + "]");
			thinkers[i] = new ThinkingThread(persons[i]);
			talkers[i] = new TalkingThread(persons[i]);
			thinkers[i].start();
			talkers[i].start();

		}
		for (TalkingThread talk : talkers) {
			talk.join();
		}
		for (ThinkingThread think : thinkers) {
			think.join();
		}

	}

	private static String currentTime() {
		return new java.sql.Time(System.currentTimeMillis()) + "";
	}

	private static void thinkAndTalkConcurrently(Person yian, Person palak) throws Exception {
		ThinkingThread think = new ThinkingThread(yian);
		TalkingThread talk = new TalkingThread(yian);
		think.start();
		talk.start();

		ThinkingThread palakThinker = new ThinkingThread(palak);
		TalkingThread palakTalker = new TalkingThread(palak);
		palakThinker.start();
		palakTalker.start();
		think.join();
		talk.join();
		palakThinker.join();
		palakTalker.join();

	}

	private static void thinkAndTalkSequentially(Person yian, Person palak) {
		yian.think();
		yian.talk();
		palak.talk();
		palak.think();

	}

}

class Eater implements Runnable {
	private Person person;

	public Eater(Person person) {
		this.person = person;
	}

	@Override
	public void run() {
		person.eat();

	}

}

class ThinkingThread extends Thread {
	private Person person;

	ThinkingThread(Person person) {
		this.person = person;
	}

	public void run() {
		person.think();
	}
}

class TalkingThread extends Thread {
	private Person person;

	TalkingThread(Person person) {
		this.person = person;
	}

	public void run() {
		person.talk();
	}
}
