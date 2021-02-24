package class10;

public class NEUStudentINFO5100Jan21 extends java.lang.Object {
	String name;
	static NEUProfessorINFO5100Jan21 professor = new NEUProfessorINFO5100Jan21("Siva");

	public NEUStudentINFO5100Jan21(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student -> " + name + " : " + professor.toString();
	}

	public static void askQuestion(String question) {
		professor.answerQuestion(question);
	}

	public static void fun() {
		professor.name = "John";
	}

	public static void main(String args[]) {
		NEUStudentINFO5100Jan21 lin = new NEUStudentINFO5100Jan21("Lin");
		NEUStudentINFO5100Jan21 manisha = new NEUStudentINFO5100Jan21("Manisha");

		System.out.println(lin);
		System.out.println(manisha);

		System.out.println(NEUStudentINFO5100Jan21.professor.name);

		NEUStudentINFO5100Jan21.askQuestion("Can Static be applied to classes");

		NEUStudentINFO5100Jan21.fun();

		System.out.println(lin.toString());
		// System.out.println(NEUStudentINFO5100Jan21.toString());

	}

}
