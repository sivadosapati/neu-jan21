package class10;

public class Person {

	static NumberOfPeople numberOfPeople;
	static int totalNumberOfPersons = 0;

	Person() {
		totalNumberOfPersons++;
	}

	public String toString() {
		return "Total Persons -> " + totalNumberOfPersons;
	}

	public static void main(String args[]) {
		Person p = new Person();
		System.out.println(Person.totalNumberOfPersons);
		Person pp = new Person();
		System.out.println(Person.totalNumberOfPersons);

	}

	static class NumberOfPeople {
		int total;
	}
}
