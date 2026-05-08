package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example6 {
	public static void main(String[] args) {
//	Compiled time exception

		System.out.println("Hello");
		try {
			new FileInputStream("abc.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		System.out.println("Move ahead");
	}
}
