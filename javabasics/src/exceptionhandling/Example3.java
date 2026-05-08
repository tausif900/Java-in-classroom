package exceptionhandling;

public class Example3 {
	public static void main(String[] args) {
		int arr[] = new int[4];
		
		try {
			arr[6] = 101;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(arr[2]);
	}
}
