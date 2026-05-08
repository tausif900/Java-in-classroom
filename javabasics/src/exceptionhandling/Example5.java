package exceptionhandling;

public class Example5 {
	public static void main(String[] args) {
//	finally
//		finally block always executes even if the exception is handled or not

		System.out.println("Database connection is open");
		try {
			System.out.println(5 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		} finally {
			System.out.println("Databse connection is closed");
		}
		System.out.println("Code after execution");
	}
}
