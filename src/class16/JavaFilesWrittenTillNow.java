package class16;

import java.io.File;

public class JavaFilesWrittenTillNow {

	public static void main(String[] args) {
		String dir = "/Users/sivad/git/neu-jan21";
		int count = countJavaFiles(new File(dir));
		System.out.println(count);

	}

	private static int countJavaFiles(File file) {
		int count = 0;
		if (file.isDirectory()) {
			File[] children = file.listFiles();
			for (File child : children) {
				count = count + countJavaFiles(child);
			}
		} else {
			String path = file.getPath();
			if (path.endsWith(".java")) {
				System.out.println(path);
				count = count + 1;
			}
		}
		return count;

	}

}
