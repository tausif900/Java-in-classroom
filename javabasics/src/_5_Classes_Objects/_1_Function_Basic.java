package _5_Classes_Objects;

public class _1_Function_Basic {

//	Function is a block of code that execute again &again where ever and when ever called...

//	Created a function...It is a Non-Parameterized Function
	public static void printHello() {
		System.out.println("Hello World!!!!");
	}

//	Createing a parameterized function
	public static void printName(String name) {
		System.out.println("My name is " + name);
	}

//	Called that function
	public static void main(String[] args) {
		printHello();
		printHello();
		printHello();
		printName("Tausif");
	}
}
