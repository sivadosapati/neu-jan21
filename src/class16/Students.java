package class16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Students {
	protected Map<Integer, Student> students = new HashMap<Integer, Student>();

	public Student getStudentForIndex(int index) {
		ArrayList<Student> s = new ArrayList<Student>(students.values());
		return s.get(index);
	}

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
