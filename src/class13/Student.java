package class13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Student {
	String name;
	String birthPlace;
	float gpa;
	


	public Student(String name, String birthPlace, float gpa) {
		super();
		this.name = name;
		this.birthPlace = birthPlace;
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", birthPlace=" + birthPlace + ", gpa=" + gpa + "]";
	}

	public static void main(String[] args) {
		Student[] students = makeStudents();
		Collection<Student> studentsCollection = makeStudentsList(students);
		System.out.println(studentsCollection.size());
		System.out.println(getBirthPlace(studentsCollection, "Anupama"));
		System.out.println(getGPA(studentsCollection, "Jaya"));

		Map<String, Student> studentsMap = makeMap(students);
		System.out.println(studentsMap.size());
		Student s = studentsMap.get("Jaya");
		System.out.println(s.gpa);
		s = studentsMap.get("Anupama");
		System.out.println(s.birthPlace);
		System.out.println("-------");
		for (Map.Entry<String, Student> entry : studentsMap.entrySet()) {
			System.out.println(entry.getValue().toString());
		}
	}

	private static Map<String, Student> makeMap(Student[] students) {
		// Map<String, Student> map = new HashMap<String, Student>();
		// Map<String, Student> map = new LinkedHashMap<String, Student>();
		TreeMap<String, Student> map = new TreeMap<String, Student>();

		for (Student s : students) {
			map.put(s.name, s);
		}
		return map;
	}

	private static float getGPA(Collection<Student> students, String string) {
		for (Student s : students) {
			if (s.name.contentEquals(string)) {
				return s.gpa;
			}
		}
		return -1.0f;
	}

	private static String getBirthPlace(Collection<Student> students, String name) {
		for (Student s : students) {
			if (s.name.contentEquals(name)) {
				return s.birthPlace;
			}
		}
		return null;
	}

	private static Collection<Student> makeStudentsList(Student[] students) {
		ArrayList<Student> s = new ArrayList<Student>();
		for (Student ss : students) {
			s.add(ss);
		}
		return s;
	}

	private static Student[] makeStudents() {
		Student students[] = new Student[6];
		students[0] = new Student("Shruti", "Gulbarga", 3.85f);
		students[1] = new Student("Anupama", "Pack", 3.75f);
		students[2] = new Student("Jaya", "Indore", 3.65f);
		students[3] = new Student("Jiaqi", "Zhejiang", 3.95f);
		students[4] = new Student("Zhen", "Shanxi", 3.65f);
		students[5] = new Student("Anupama", "Mumbai", 3.50f);
		return students;

	}

}
