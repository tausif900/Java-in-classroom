package exceptionhandling;

public class Example1 {
//	Exception disturbs the normal execution flow of programme, it terminates rest of the programme, to avoid such things we use exceptional handling
// jo line error deri ho uske baad ke code run ho.
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println(10 / 0);
		System.out.println("Hello");
	}
}
