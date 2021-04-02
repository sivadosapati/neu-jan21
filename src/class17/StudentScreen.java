package class17;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import class16.PersistableStudents;
import class16.Student;
import class16.Students;

public class StudentScreen extends JFrame {

	private JTable studentsTable;
	private StudentsTableModel model;
	private JButton add, delete, close;

	private Students students;

	public StudentScreen() {
		createComponents();
		addComponents();
		setListeners();
		makeItVisible();
		addStudentsPeriodically();
	}

	private void addStudentsPeriodically() {
		for (int i = 0; i < 10; i++) {
			try {
				Student s = new Student(110 + i, "STUDENT -> " + i);
				students.addStudent(s);
				Thread.sleep(2000);
				studentsTable.updateUI();

			} catch (Exception e) {

			}
		}

	}

	private void makeItVisible() {
		setSize(400, 400);
		setVisible(true);

	}

	private void setListeners() {
		// TODO Auto-generated method stub

	}

	private void addComponents() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add(new JScrollPane(studentsTable), "Center");
		JPanel panel = new JPanel();
		panel.add(add);
		panel.add(delete);
		panel.add(close);
		con.add(panel, "South");

	}

	private void createComponents() {
		students = new PersistableStudents();
		model = new StudentsTableModel(students);
		studentsTable = new JTable(model);

		add = new JButton("Add");
		delete = new JButton("Delete");
		close = new JButton("Close");

	}

	public static void main(String[] args) {
		new StudentScreen();

	}

}

class StudentsTableModel implements TableModel {

	private Students students;

	public StudentsTableModel(Students students) {
		this.students = students;
	}

	@Override
	public int getRowCount() {
		return students.getStudentCount();
	}

	@Override
	public int getColumnCount() {
		return 2;
	}

	@Override
	public String getColumnName(int columnIndex) {
		if (columnIndex == 1) {
			return "ID";
		}
		return "NAME";
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Student s = students.getStudentForIndex(rowIndex);
		if (columnIndex == 0) {
			return s.roll;
		}
		return s.name;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

}
