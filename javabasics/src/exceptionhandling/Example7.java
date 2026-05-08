package exceptionhandling;

import java.io.FileNotFoundException;

public class Example7 {
	public static void main(String[] args) {
		FileHandling f = new FileHandling();
		try {
			f.readFile();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		System.out.println("code");
	}
}
