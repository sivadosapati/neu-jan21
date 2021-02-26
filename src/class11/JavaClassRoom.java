package class11;

public class JavaClassRoom {

	public static void main(String[] args) throws ProfessorNotInformedException{
		Professor cva = new Professor();
		Student lin = new Student();
		for (int i = 0; i < 10; i++) {
			lin.attendTheClass(cva);
			System.out.println("-----");
		}
	}

}
