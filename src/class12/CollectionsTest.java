package class12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsTest {
	static String[] studentGroupA = new String[] { "Tejaswi", "Peiwen", "Jaya", "Shruti" };
	static String[] studentGroupB = new String[] { "Anupama", "Xinhui", "Shruti", "Yun", "Lin", "Yun" };

	public static void main(String[] args) {

		Collection<String> groupA = new ArrayList<String>();
		Collection<String> groupB = new ArrayList<String>();
		operate(groupA, groupB, "ArrayList");
		//operate(new LinkedList<String>(), new LinkedList<String>(), "LinkedList");
		//operate(new Vector<String>(), new Vector<String>(), "Vector");
		System.out.println("-----------------------SET----------------\n");
		operate(new HashSet<String>(), new HashSet<String>(), "HashSet");
		operate(new LinkedHashSet<String>(), new LinkedHashSet<String>(), "LinkedHashSet");
		operate(new TreeSet<String>(), new TreeSet<String>(), "TreeSet");

	}

	private static void operate(Collection<String> groupA, Collection<String> groupB, String collectionType) {
		System.out.println("Working with -> " + collectionType + " .....\n");
		makeCollection(studentGroupA, groupA);
		makeCollection(studentGroupB, groupB);

		displaySize(groupB);

		findName(groupB, "Lin");
		findName(groupB, "Siva");

		Collection<String> students = merge(groupA, groupB);

		displaySize(students);

		removeName(students, "Shruti");
		removeName(students, "Siva");
		displaySize(students);
		System.out.println("\nDONE working with -> " + collectionType + "\n");
	}

	private static void removeName(Collection<String> students, String name) {
		students.remove(name);

	}

	private static Collection<String> merge(Collection<String> a, Collection<String> b) {
		Collection<String> result = new ArrayList<String>();
		result.addAll(a);
		result.addAll(b);
		return result;
	}

	private static void findName(Collection<String> list, String name) {
		boolean nameFound = list.contains(name);
		if (nameFound) {
			System.out.println(name + " is in " + list);
		} else {
			System.out.println(name + " is not in " + list);
		}

	}

	private static void displaySize(Collection<String> list) {
		System.out.println(list.size());
		for (String s : list) {
			System.out.print(s + " - ");
		}
		System.out.println("");

	}

	private static Collection<String> makeCollection(String[] names, Collection<String> input) {
		for (String n : names) {
			input.add(n);
		}
		return input;
	}

}
