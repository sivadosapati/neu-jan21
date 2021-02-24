package class10;

public class NEUProfessorINFO5100Jan21 {
	String name;

	public NEUProfessorINFO5100Jan21(String name) {
		this.name = name;
	}

	public String toString() {
		return "Professor -> " + name;
	}

	public void answerQuestion(String question) {
		System.out.println("Answer question -> " + question);
	}
}
