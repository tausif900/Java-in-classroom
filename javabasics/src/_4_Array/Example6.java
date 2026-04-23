package _4_Array;

public class Example6 {

	public static void main(String[] args) {
		
//		find Largest number from array
		int array[] = { 12, 34, 5, 100, 2 };
		int max = array[0];
		int min = array[0];
		
		
//		har ek value n me aaegi and then check hoga n> max haiki ni , agr haito max ko replace krdo wrna wahi vlaue rehnedo
		for (int n : array) {
			if (n > max) {
				max = n;
			}
			if (n < min) {
				min = n;
			}
		}
		System.out.println(max);

//		find Smallest from array
		System.out.println(min);
	}
}
