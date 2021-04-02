package class16;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class PersistableStudents extends Students {
	private String file = "students.txt";

	@Override
	public void addStudent(Student student) {
		super.addStudent(student);
		writeStudentIntoFile(student);
	}

	public PersistableStudents() {
		readAndLoadDataIntoMap();
	}

	public void deleteStudent(int roll) {
		super.deleteStudent(roll);
		rewriteAllTheStudents();
	}

	private void rewriteAllTheStudents() {
		try {
			PrintWriter writer = new PrintWriter(new FileWriter(file), true);
			for (Student student : students.values()) {
				String line = student.roll + "," + student.name;
				writer.println(line);

			}
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void readAndLoadDataIntoMap() {
		try {
			Scanner scanner = new Scanner(new FileInputStream(file));
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				Student s = Student.makeStudent(line);
				super.addStudent(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void writeStudentIntoFile(Student student) {
		try {
			PrintWriter writer = new PrintWriter(new FileWriter(file, true), true);
			String line = student.roll + "," + student.name;
			writer.println(line);
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
