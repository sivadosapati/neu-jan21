package class16;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		String fileName = "/Users/sivad/git/neu-jan21/src/class17";
		File file = new File(fileName);
		System.out.println(file.isDirectory());

		System.out.println(file.exists());
		if (file.exists() == false) {
			file.mkdir();
		}
	}

}
