package class16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		String file = "/Users/sivad/git/neu-jan21/src/class8/abs/Home.java";
		FileInputStream fis = new FileInputStream(file);
		while (true) {
			int i = fis.read();
			if (i == -1)
				break;
			char ch = (char) i;
			System.out.print(ch);
		}
		fis.close();
	}

}
