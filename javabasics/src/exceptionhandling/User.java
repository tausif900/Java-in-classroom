package exceptionhandling;

public class User {
// throw is help us to give the exception
	void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException();
		}
		System.out.println("You are eligible for vote");
	}
}
