package class6;

public class Student {

	public static void main(String[] args) {

		Student z = new Student(" Mr Zifan");
		Student t = new Student("Miss Tejaswi");

		System.out.println(z.isMale());
		System.out.println(t.isMale());

	}

	private String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	// private String name = "Miss Tejaswi";

	public boolean isMale() {
		//return writeLogicForFindingGender();
		return writeLogicUsingJavaMethodFoFindingGender();
	}

	private boolean writeLogicUsingJavaMethodFoFindingGender() {
		if (name.trim().toUpperCase().startsWith("MR ")) {
			return true;
		}
		return false;
	}

	private boolean writeLogicForFindingGender() {
		char c[] = name.toCharArray();
		if (c[0] == 'M' && (c[1] == 'r' || c[1] == 'R') && c[2] == ' ')
			return true;
		return false;
	}

}
