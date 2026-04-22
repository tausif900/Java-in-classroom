package _4_Array;

public class Example1 {

	public static void main(String[] args) {
//		Array is a Collection of Data	

//		In Java Array has a fixed Data type---------> int to int hi, float to float hi, not mixed datatype

//		syntax--> datatype array_name[]={v1,v2.....}  ..............value given at the time of declaration

//		2nd way syntax--->datatype array_name[]=new datatype[size] this is to declare or define the array

//		Data is stored in a continuous manner inside the memory and to access them we use indexing and indexing is start from 0

//		Array size are fixed

		int numbers[] = { 12, 45, 29, 100, 60, 45 };
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		System.out.println(numbers[5]);
		
//		To find array length
		
		System.out.println("Array length is " + numbers.length);

		String days[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		
	}
}
