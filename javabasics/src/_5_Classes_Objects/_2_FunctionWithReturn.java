package _5_Classes_Objects;

public class _2_FunctionWithReturn {

//	Caller function cannot touch the function

//	void hai to hume function ka access ni milta

//	When we have data-type except void , now we have access to the function as it returns something

//	Function for Addition of 2 numbers
	public static int add(int a, int b) {
		return a + b;
	}
	

//	Function for Average of 3 numbers
	public static int Average(int a, int b, int c) {
		return (a + b + c) / 3;
	}

//	Function for isEven that returns boolean
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}

//	Function for isPositive thet return boolean
	public static boolean isPositive(int n) {
		return n > 0;
	}

//	Main method
	public static void main(String[] args) {
		int sum = add(5, 6);
		System.out.println(sum + 100); // now we have access to the value here , we have added

//	we can also call the function like this
		System.out.println(Average(5, 6, 8));

		int a[] = { 12, 45, 11, 67 };
		for (int num : a) {
			if (isEven(num)) {
				System.out.println(num);
			}
		}
		int b[] = { 2, 6, -4, 8, 9, -10 };
		for (int num : b) {
			if (isPositive(num)) {
				System.out.print(num);
			}
		}
	}
}
