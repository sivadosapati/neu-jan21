package class5;

public class StringTest {

	public static void main(String[] args) {
		String studentName = "Anupama";
		char[] name = new char[] { 'A', 'n', 'u', 'p', 'a', 'm', 'a' };
		char[] a = new char[] { 'A', 'n', 'u' };
		String a1 = "Anu";

		String word = "Table";
		int age = 10;
		String another = "iPhone";

		Student jaya = new Student();
		Student jasmine = new Student();
		System.out.println(jaya == jasmine);// false
		System.out.println(jaya.equals(jasmine));//true

		String x = new String("Pen");
		String xx = "Pen";
		String yy = "Pen";

		System.out.println(xx == yy);// true
		System.out.println(xx == x);// false

		System.out.println(xx.equals(x));// true
		
		xx = "Pan";
		
		String zz = yy.replace('e','a');
		System.out.println(yy);//Pan or Pen
		System.out.println(zz);

	}

}

class Student {
	// String name;
	// char[] name;

	public boolean equals(Object o) {
		return true;
	}

}
