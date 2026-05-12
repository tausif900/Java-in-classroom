package stringExample;

public class Example1 {

	public static void main(String[] args) {

//		String literals
		String s1 = "Hello";
		String s2 = "Hello";

//		String Class
		String s3 = new String("Hello");
		String s4 = new String("Hello");

		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		System.out.println(s3 == s4); // false

		System.out.println("-----------------------------------------------");

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
	}

}
//String is not a primitive, it is a class,it will have some properties and methods
//String name="hello" 1st way to create string by using string literal.
//if string is a class then we can create String like this by using new keyword. e.g. String s2= new String("Hello"); it's obj store in a heap memory.
// String constant pool specially stores string literals.
//when we want to compare two strings we cann't write like this s1==s2. we cann't use equal to ka sign to compare string
//Mostly when we compare two strings it compares by reference not by value
//	in String constant pool we cann't create same literals, if we do then both will refer to the same obj.
//	new keyword always create a new obj, they don't concern about that both obj has same values because they both r seperated.
//  '==' checks reference '.eqauls()' checks value...

