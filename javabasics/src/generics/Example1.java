package generics;

public class Example1 {
	public static void main(String[] args) {
//		Autoboxing
		int a = 45;
		Integer i = a;
		System.out.println(i);

//		UnBoxing-Wrapper to primitive Conversion is called unboxing
		Integer j = 12;
		int k = j;
		System.out.println(k);
	}
}
//Generics - We decide what will be the type.The one who is creating the obj will decide the type.It happens only in class

//Wrapper class- Integer,Float,Boolean,Character,Double,Byte,Short all are classes here so we can tell the type

// Autoboxing- Automatic convertion of primitive to wrapper is autoboxing.