package class10.exceptions;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Begin");
		calculate();
		System.out.println("Done");

	}

	private static void calculate() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Let's do calculation.\nPlease Enter first number");
		int i = getInput(scanner);
		System.out.println("Please enter the second number");
		int j = Integer.parseInt(scanner.nextLine());
		System.out.println("Please enter operator (+,-,x,/)");
		String s = scanner.nextLine();
		if (s.contentEquals("+")) {
			int result = i + j;
			System.out.println(i + " + " + j + " = " + result);
		}

	}

	private static int getInput(Scanner scanner) {
		int counter = 1;
		while (counter++ < 3) {
			String s = null;
			try {
				s = scanner.nextLine();
				return Integer.parseInt(s);
			} catch (Exception e) {
				System.out.println("Exception -> " + e.getMessage());
				System.out.println("Please enter a number. " + s + " is not a number");
				continue;
			}
		}
		System.out.println("I tried 3 times but you didn't give the right number. So I will assume the number is 10");
		return 10;
	}

}
