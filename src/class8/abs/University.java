package class8.abs;

public class University {

	public static void main(String[] args) {
		Student manisha = new Student();
		Professor siva = new Professor();
		TA yash = new TA();
		StudentKnowingJavaAndTeacher jasmine = new StudentKnowingJavaAndTeacher();

		manisha.learn(jasmine);
		manisha.learn(siva);
		manisha.learn(yash);

	}

}

class Student {
	void learn(Teacher t) {
		t.teach();
	}
	
	void learn(Professor p) {
		p.teach();
	}
}

interface Teacher {
	void teach();
}

class Professor implements Teacher {

	@Override
	public void teach() {
		System.out.println("Professor");

	}

}

class TA implements Teacher {

	@Override
	public void teach() {
		System.out.println("TA");
	}

}

class StudentKnowingJavaAndTeacher extends Student implements Teacher {

	@Override
	public void teach() {
		System.out.println("Student who knows Java is teaching");

	}

}

class OnlineJavaBook implements Teacher{

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		
	}
	
}
