package class16;

import java.util.Scanner;

public class ClassRoom {

	public static void main(String[] args) {
		// Students students = new Students();
		Students students = new PersistableStudents();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter(ADD|DELETE|COUNT|GET NAME|END)");
			String line = scanner.nextLine();
			if (line.contentEquals("END"))
				break;
			if (line.equals("ADD")) {
				System.out.println("Enter roll, name");// 101, Jaya
				String input = scanner.nextLine();
				Student s = Student.makeStudent(input);
				students.addStudent(s);
				continue;
			}
			if (line.contentEquals("GET NAME")) {
				System.out.println("Enter the roll #");
				String input = scanner.nextLine();
				int roll = Integer.parseInt(input);
				String name = students.getStudentName(roll);
				System.out.println("Student with Roll # " + roll + " has the name -> " + name);
				continue;
			}
			if (line.equals("COUNT")) {
				System.out.println("Total # of Students : " + students.getStudentCount());
				continue;
			}
		}

	}

}
