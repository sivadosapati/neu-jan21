package class16;

import java.util.HashMap;
import java.util.Map;

public class Students {
	private Map<Integer, Student> students = new HashMap<Integer, Student>();

	public void addStudent(Student student) {
		students.put(student.roll, student);
	}

	public String getStudentName(int roll) {
		return students.get(roll).name;
	}

	public void deleteStudent(int roll) {
		students.remove(roll);
	}

	public int getStudentCount() {
		return students.size();
	}

	public String toString() {
		return students.values().toString();
	}

}
