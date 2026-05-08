package exceptionhandling;

public class Example1 {
//	Exception disturbs the normal execution flow of programme, it terminates rest of the programme, to avoid such things we use exceptional handling
// jo line error deri ho uske baad ke code run ho.
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Hello");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {		// we are storing obj of arithmeticexception class in a variable 'e' of type ArithmeticException.
			System.out.println("Cannot divide by zero");
		}
		System.out.println("Hello");
	}
}

//	Arithmetic exception is a class that inherits RuntimeException, it inherits Exception and it inherits Throwable naam ke parent class ko