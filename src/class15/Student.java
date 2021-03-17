package class15;

public class Student extends Person {

	private static Object QUESTION_LOCK = new Object();

	public Student(String name) {
		super(name);
	}

	public void askQuestionToProfessor(String question) {
		synchronized (QUESTION_LOCK) {
			loop("asking question -> " + question);
		}
	}

	public static void main(String args[]) {
		Student anupama = new Student("Anupama");
		Student junni = new Student("Junni");
		Thread a = new Thread(() -> anupama.askQuestionToProfessor("Anupama Question # 1"));
		Thread j = new Thread(() -> junni.askQuestionToProfessor("Junni Question # 1"));
		Thread aa = new Thread(() -> anupama.askQuestionToProfessor("Anupama Question # 2"));
		Thread jj = new Thread(() -> junni.askQuestionToProfessor("Junni Question # 2"));

		a.start();
		j.start();
		aa.start();
		jj.start();
	}
}
