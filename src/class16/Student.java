package class16;

public class Student {
	public int roll;
	public String name;

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

	public static Student makeStudent(String input) {
		String[] data = input.split("\\,");
		int roll = Integer.parseInt(data[0]);
		String name = data[1];
		Student s = new Student(roll, name);
		return s;
	}

}
