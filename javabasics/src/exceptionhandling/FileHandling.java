package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileHandling {
//	throws passon and said u handle, the one who is using the function
	void readFile() throws FileNotFoundException {
		new FileInputStream("abc-file.txt");
	}
}
